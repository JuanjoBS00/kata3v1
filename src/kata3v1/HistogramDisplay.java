package kata3v1;

import java.awt.Container;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{

    public HistogramDisplay(String title) {
        super(title);
        this.setContentPane(createPanel());
        this.pack();
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
                
        return chartPanel;        
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("JFreeChart Histogram",
                                                        "email domains", 
                                                        "mº emails", dataSet, PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
        
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
                dataSet.addValue(23, "", "ulpgc.es");
                dataSet.addValue(33, "", "dis.ulpgc.es");
                dataSet.addValue(13, "", "ull.es");
                dataSet.addValue(53, "", "gmail.com");
                dataSet.addValue(28, "", "hotmail.es");
                return dataSet;
    }
    
    public void execute(){
        this.setVisible(true);
    }

}
