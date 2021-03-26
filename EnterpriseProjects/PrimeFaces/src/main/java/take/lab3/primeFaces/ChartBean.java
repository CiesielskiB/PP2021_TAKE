/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package take.lab3.primeFaces;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 *
 * @author Miket
 */
@Named(value = "chartBean")
@Dependent
public class ChartBean {

    private LineChartModel lineModel;
    
    public ChartBean() {
        lineModel = new LineChartModel();
        lineModel.addSeries(createSeries(true));
        lineModel.addSeries(createSeries(false));
        lineModel.setLegendPosition("ne");
        lineModel.setZoom(true);
        
        setAxis(lineModel);
    }
    
    private LineChartSeries createSeries(boolean isSine) {
        LineChartSeries series = new LineChartSeries();
        series.setLabel(isSine ? "Sine" : "Cosine");
        
        
        for(int i = 0; i <= 360; i += 10) {
            series.set(i, isSine ? Math.sin(Math.toRadians(i)) : Math.cos(Math.toRadians(i)));
        }
        
        return series;
    }
    
    private void setAxis(LineChartModel model) {
        Axis y = model.getAxis(AxisType.Y);
        y.setMin(-1);
        y.setMax(1);
        y.setLabel("Value");
        
        Axis x = model.getAxis(AxisType.X);
        x.setMin(0);
        x.setMax(360);
        x.setTickInterval("10");
        x.setLabel("Degrees");
    }  

    /**
     * @return the lineModel
     */
    public LineChartModel getLineModel() {
        return lineModel;
    }

    /**
     * @param lineModel the lineModel to set
     */
    public void setLineModel(LineChartModel lineModel) {
        this.lineModel = lineModel;
    }
    
}
