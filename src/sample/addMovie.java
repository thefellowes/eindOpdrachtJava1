package sample;

import javax.swing.*;

public class addMovie extends View{

    private JLabel labelName;
    private JLabel labelYear;
    private JLabel labelOrigin;
    private JLabel labelBudget;
    private JTextField txtName;
    private JTextField txtYear;
    private JTextField txtOrigin;
    private JTextField txtBudget;
    private JButton btnAddMovie;
    private JPanel addPanel;

    addMovie(){
        initUI();
    }

    @Override
    public void initUI(){
        setTitle("Add a movie");
        setSize(500,400);
        setVisible(true);
        setContentPane(addPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(0, 500);
    }

    @Override
    public void updateUI(Model model){}

    public void clear(){
        txtName.setText("");
        txtYear.setText("");
        txtOrigin.setText("");
        txtBudget.setText("");
    }

    public Movie getMovie(){
        return new Movie(getName(), getYear(), getOrigin(), getBudget());
    }

    public String getName() {
        return txtName.getText();
    }

    private int getYear() {
        return Integer.parseInt(txtYear.getText());
    }

    private String getOrigin() {
        return txtOrigin.getText();
    }

    private double getBudget() {
        return Integer.parseInt(txtBudget.getText());
    }
}
