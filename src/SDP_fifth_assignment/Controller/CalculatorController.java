package Controller;

import Model.CalculatorModel;
import View.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView view;
    private CalculatorModel model;
    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;

       view.getAddButton().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               int num1 = 0;
               try {
                   num1 = view.getFirstNumber();
               } catch (Exception ex) {
                   throw new RuntimeException(ex);
               }

               int num2 = 0;
               try {
                   num2 = view.getSecondNumber();
               } catch (Exception ex) {
                   throw new RuntimeException(ex);
               }
               model.add(num1, num2);
               view.setResult(model.getResult());
           }
       });

        view.getSubtractButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = 0;
                try {
                    num1 = view.getFirstNumber();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                int num2 = 0;
                try {
                    num2 = view.getSecondNumber();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                model.subtract(num1, num2);
                view.setResult(model.getResult());
            }
        });

        view.getMultiplyButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = 0;
                try {
                    num1 = view.getFirstNumber();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                int num2 = 0;
                try {
                    num2 = view.getSecondNumber();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                model.multiply(num1, num2);
                view.setResult(model.getResult());
            }
        });

        view.getDivideButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = 0;
                try {
                    num1 = view.getFirstNumber();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                int num2 = 0;
                try {
                    num2 = view.getSecondNumber();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                model.divide(num1, num2);
                view.setResult(model.getResult());
            }
        });
    }
}
