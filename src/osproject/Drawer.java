/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osproject;

/**
 *
 * @author harth
 */
import java.awt.Color;
import java.awt.Dimension;
import java.util.Collections;
import java.util.Date;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.gantt.XYTaskDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class Drawer extends ApplicationFrame {

    public static DrawingInstructions drawingInstructions;
    static private int numberOfProcess;
    private static String arr[];
    public JPanel localJPanel;
    
    public Drawer(String paramString, DrawingInstructions drawingInstructions, int numberOfProcess) {
        super(paramString);
        this.numberOfProcess = numberOfProcess;
        this.drawingInstructions = drawingInstructions;
        arr = new String[numberOfProcess];
        for (int i = 1; i <= numberOfProcess; i++) {
            arr[i-1] = String.format("Process %d", i);
        }
        localJPanel = createDemoPanel();
        localJPanel.setPreferredSize(new Dimension(1072, 288));
        setContentPane(localJPanel);
    }

    private static JFreeChart createChart(IntervalXYDataset paramIntervalXYDataset) {
        JFreeChart localJFreeChart = ChartFactory.createXYBarChart("Procssing schadual", "Resource", false, "Timing", paramIntervalXYDataset, PlotOrientation.HORIZONTAL, true, false, false);
        localJFreeChart.setBackgroundPaint(Color.BLACK);
        XYPlot localXYPlot = (XYPlot) localJFreeChart.getPlot();
       
        

        SymbolAxis localSymbolAxis = new SymbolAxis("Process", arr);
        localSymbolAxis.setGridBandsVisible(false);
        localXYPlot.setDomainAxis(localSymbolAxis);
        XYBarRenderer localXYBarRenderer = (XYBarRenderer) localXYPlot.getRenderer();
        localXYBarRenderer.setUseYInterval(true);
        localXYPlot.setRangeAxis(new DateAxis("Timing"));
        ChartUtilities.applyCurrentTheme(localJFreeChart);
        return localJFreeChart;
    }

    public static JPanel createDemoPanel() {
        return new ChartPanel(createChart(createDataset()));
    }

    private static IntervalXYDataset createDataset() {
        return new XYTaskDataset(createTasks());
    }

    private static TaskSeriesCollection createTasks() {
        TaskSeriesCollection localTaskSeriesCollection = new TaskSeriesCollection();
        drawingInstructions.sortOnId();
        int prevId = -1;
        TaskSeries taskSeries = null;
        String label = null;
        int startMinute = new Minute().getMinute();
        int startHour = new Hour().getHour();
        int startSecond = new Second().getSecond();

        for (int i = 0; i < drawingInstructions.count(); i++) {
            if(drawingInstructions.getInstruction(i).from == drawingInstructions.getInstruction(i).to)
                continue;
            
            if (prevId != drawingInstructions.getInstruction(i).processId) {
                prevId = drawingInstructions.getInstruction(i).processId;

                if (taskSeries != null) {
                    localTaskSeriesCollection.add(taskSeries);
                }
                label = arr[drawingInstructions.getInstruction(i).processId];
                taskSeries = new TaskSeries(label);
            }

            int curSecond = 0, curMinute = startMinute, curHour = startHour;

            if (startSecond + drawingInstructions.getInstruction(i).from > 59) {
                curSecond = startSecond + drawingInstructions.getInstruction(i).from;
                curSecond %= 60;

                curMinute++;
                if (curMinute > 59) {
                    curMinute %= 60;
                    curHour++;
                }
            } else {
                curSecond = startSecond + drawingInstructions.getInstruction(i).from;
            }

            int toSecond = 0, toMinute = startMinute, toHour = startHour;

            if (startSecond + drawingInstructions.getInstruction(i).to > 59) {
                toSecond = startSecond + drawingInstructions.getInstruction(i).to;
                toSecond %= 60;

                toMinute++;
                if (toMinute > 59) {
                    toMinute %= 60;
                    toHour++;
                }
            } else {
                toSecond = startSecond + drawingInstructions.getInstruction(i).to;
            }

            Date from = new Second(curSecond, new Minute(curMinute, new Hour(curHour, new Day()))).getStart();
            Date to = new Second(toSecond, new Minute(toMinute, new Hour(toHour, new Day()))).getEnd();

            taskSeries.add(new Task(label, from, to));
        }
        
        localTaskSeriesCollection.add(taskSeries);
        return localTaskSeriesCollection;
    }

    public static void main(String[] paramArrayOfString) {

    }
}
