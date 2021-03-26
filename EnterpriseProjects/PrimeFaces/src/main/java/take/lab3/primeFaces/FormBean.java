/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package take.lab3.primeFaces;

import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Miket
 */
@Named(value = "formBean")
@RequestScoped
public class FormBean {

    private Integer firstNumber;
    private Integer secondNumber;
    private Integer result;
    private Date now;
    
    public FormBean() {
        setNow(new Date());
    }

    public void calculate() {
        result = firstNumber + secondNumber;
        growl();
    }
    
    public void growl() {
        String message = firstNumber + " + " + secondNumber + " = " + result;
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Działanie", message));
    }
    
    /**
     * @return the firstNumber
     */
    public Integer getFirstNumber() {
        return firstNumber;
    }

    /**
     * @param firstNumber the firstNumber to set
     */
    public void setFirstNumber(Integer firstNumber) {
        this.firstNumber = firstNumber;
    }

    /**
     * @return the secondNumber
     */
    public Integer getSecondNumber() {
        return secondNumber;
    }

    /**
     * @param secondNumber the secondNumber to set
     */
    public void setSecondNumber(Integer secondNumber) {
        this.secondNumber = secondNumber;
    }

    /**
     * @return the result
     */
    public Integer getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(Integer result) {
        this.result = result;
    }

    /**
     * @return the now
     */
    public Date getNow() {
        return now;
    }

    /**
     * @param now the now to set
     */
    public void setNow(Date now) {
        this.now = now;
    }
}
