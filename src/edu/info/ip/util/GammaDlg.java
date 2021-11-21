package edu.info.ip.util;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Hashtable;

public class GammaDlg extends AbstractSettingsDialog{

    private JSlider slider1;
    private JTextField textField1;

    public GammaDlg() {
        super();
        setTitle("Gamma");

        mainPanel.setLayout(new GridLayout(1,1));

        JPanel panel1 = new JPanel();
        textField1 = new JTextField(5);
        slider1 = new JSlider(0,400,0);
        slider1.setPreferredSize(new Dimension(400,200));
        slider1.setMajorTickSpacing(50);
       // slider1.setMinorTickSpacing(10);
        Hashtable<Integer, JLabel > lables=new Hashtable<>();
        lables.put(0, new JLabel("0.0"));
        lables.put(200, new JLabel("1.0"));
        lables.put(400, new JLabel("2.0"));
        slider1.setLabelTable(lables);
        slider1.setPaintLabels(true);
        slider1.setPaintTicks(true);

        panel1.add(textField1);
        panel1.add(slider1);

        mainPanel.add(panel1);

        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                onSlide();
            }
        });
    }

    private void onSlide(){
        double val = slider1.getValue()/200.0;
        textField1.setText(""+val);

        BufferedImage img = ImageUtil.contrastGamma(originalImg, val);
        imagePanel.setImage(img);
    }
}
