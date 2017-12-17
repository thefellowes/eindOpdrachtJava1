package sample;

import javax.swing.*;

public abstract class View extends JFrame {
    public abstract void initUI();

    public abstract void updateUI(Model model);
}