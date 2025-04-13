package br.com.sudoku.ui.custom.panel;

import javax.swing.JPanel;
import java.awt.Dimension;

public class MainPanel extends JPanel {

    private static final long serialVersionUID = 1L;

	public MainPanel(final Dimension dimension){
        this.setSize(dimension);
        this.setPreferredSize(dimension);
    }

}