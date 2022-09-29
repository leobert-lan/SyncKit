package com.hi.dhl.ui;

import com.hi.dhl.action.listener.JTextFieldHintListener;
import com.hi.dhl.common.R;
import com.hi.dhl.common.SyncContentProvide;
import com.hi.dhl.console.RemoteMachineInfo;
import com.intellij.ui.JBColor;

import javax.swing.*;
import java.awt.*;

/**
 * <pre>
 *     author: dhl
 *     date  : 2022/9/29
 *     desc  :
 * </pre>
 */
public class PluginConfigForm {
    JPanel servicePanel;
    JPanel androidPanel;
    JPanel rootPanel;
    JTextField tfLaunchActivity;
    JTextField tfRemoteAddress;
    JTextField tfRemotePort;
    JTextField tfRemoteUser;
    JTextField tfRemoteCommand;
    JLabel labelRemoteAddress;
    JLabel labelRemotePort;
    JLabel labelRemoteUser;
    JLabel labelRemoteCommand;
    JLabel labelLaunchActivity;
    JTextField tfSDK;
    JLabel lableSDK;
    JTextField tfNdk;
    JLabel lableNDK;
    JTextArea fileFilters;
    JLabel fileFilterTip;

    PluginConfigForm() {
        rootPanel.setPreferredSize(new Dimension(460, -1));
        labelRemoteUser.setText(R.String.ui.labelRemoteUser);
        labelRemotePort.setText(R.String.ui.labelRemotePort);
        labelRemoteAddress.setText(R.String.ui.labelRemoteAddress);
        labelRemoteCommand.setText(R.String.ui.labelRemoteCommand);

        labelLaunchActivity.setText(R.String.ui.labelLaunchActivity);
        tfLaunchActivity.addFocusListener(new JTextFieldHintListener(tfLaunchActivity, R.String.ui.tfLaunchActivity));

        lableSDK.setText(R.String.ui.labelSDK);
        tfSDK.addFocusListener(new JTextFieldHintListener(tfSDK, R.String.ui.tfSDK));

        lableNDK.setText(R.String.ui.labelNDK);
        tfNdk.addFocusListener(new JTextFieldHintListener(tfNdk, R.String.ui.tfNDK));

        fileFilterTip.setForeground(JBColor.GRAY);
    }

}