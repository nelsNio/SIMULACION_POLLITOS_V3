/**
 * @author: Fonseca Cano. Leidy Nathalia.
 * @author: Niño Verdugo. Nelson Andres
 * @version: 3.0
 */
package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import constants.Constants;
import controller.Controller;

public class MainWindow extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JLabel lblTitleWindow;
	private JLabel lblSimulationTime;
	private JLabel lblSimulationDay;
	private JLabel lblSimulationTimeChange;
	private JTextField textFieldTime;
	private JTextField textFieldTimeChange;
	private JTextField textFieldOrderAmount;
	private JTextField textFieldOrderTableOne;
	private JTextField txtDaysOfSimulation;
	private JButton buttonStart;
	private JButton buttonChangeTime;
	private PanelTable panelTables;
	private PanelData panelData;

	public MainWindow(Controller controller) {
		setWindowsParameters();
		lblTitleWindow = new JLabel("Simulación Pollitos 3");
		
		lblTitleWindow.setBackground(Color.decode("#89f590"));
		lblTitleWindow.setBounds(655, 20, 360, 30);
		lblTitleWindow.setFont(new Font("Agency FB", Font.BOLD, 30));
		lblTitleWindow.setBackground(Color.BLACK);
		this.add(lblTitleWindow);
		startDataLabels();
		addPanels();	
		startControlButtons(controller);
		
	}

	private void addPanels() {
		panelData = new PanelData();
		panelData.setBounds(40, 155, 650, 530);
		panelData.setBorder(BorderFactory.createLineBorder(Color.decode("#09eb18")));
		panelData.setFont(new Font("Agency FB", Font.BOLD, 12));
		panelData.setBackground(Color.decode("#03fceb"));
		panelData.setVisible(true);
		this.add(panelData);
		
		panelTables = new PanelTable();
		panelTables.setBounds(730, 155, 745, 530);
		panelTables.setBorder(BorderFactory.createLineBorder(Color.decode("#029e0c")));
		panelTables.setVisible(true);
		this.add(panelTables);
	}

	private void setWindowsParameters() {
		this.setResizable(true);
		this.setTitle("S3 SIMIULACIÓN POLLITOS, NATALIA & NELSON");
		this.setFont(new Font("Agency FB", Font.BOLD, 22));
		this.setSize(Constants.WIDTH_WINDOW, Constants.HEIGHT_WINDOW);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
	}

	private void startDataLabels() {
		lblSimulationTime = new JLabel("Tiempo:");
		lblSimulationTime.setFont(new Font("Agency FB", Font.BOLD, 15));
		lblSimulationTime.setBounds(300, 60, 80, 30);
		this.add(lblSimulationTime);
		
		lblSimulationTimeChange = new JLabel("Nuevo Tiempo (día):");
		lblSimulationTimeChange.setBounds(750, 60, 160, 30);
		lblSimulationTimeChange.setFont(new Font("Agency FB", Font.BOLD, 15));
		lblSimulationTimeChange.setEnabled(true);
		this.add(lblSimulationTimeChange);

		textFieldTime = new JTextField();
		textFieldTime.setBounds(380, 60, 100, 30);
		textFieldTime.setFont(new Font("Agency FB", Font.BOLD, 15));
		textFieldTime.setEditable(false);
		this.add(textFieldTime);

		textFieldTimeChange = new JTextField();
		textFieldTimeChange.setBounds(910, 60, 100, 30);
		textFieldTimeChange.setEditable(true);
		this.add(textFieldTimeChange);
		
		lblSimulationDay = new JLabel("Día:");
		lblSimulationDay.setBounds(300, 110, 80, 30);
		lblSimulationDay.setFont(new Font("Agency FB", Font.BOLD, 30));
		this.add(lblSimulationDay);
		
		txtDaysOfSimulation = new JTextField();
		txtDaysOfSimulation.setBounds(380, 110, 150, 35);
		txtDaysOfSimulation.setEditable(false);
		txtDaysOfSimulation.setFont(new Font("Agency FB", Font.BOLD, 30));
		this.setBackground(Color.decode("#89f590"));
		this.setForeground(Color.decode("#89f590"));
		this.add(txtDaysOfSimulation);

		this.repaint();
	}

	private void startControlButtons(Controller controlador) {
		buttonStart = new JButton("Iniciar");
		buttonStart.setBounds(800, 100, 120, 50);
		buttonStart.setBackground(new Color(3, 111, 252));
		buttonStart.setForeground(Color.decode("#045209"));
		buttonStart.setFont(new Font("Agency FB", Font.BOLD, 30));
		buttonStart.addActionListener(controlador);
		buttonStart.setActionCommand(Constants.START);
		this.add(buttonStart);
		
		buttonChangeTime = new JButton("Cambiar");
		buttonChangeTime.setBounds(1025, 54, 120, 35);
		buttonChangeTime.addActionListener(controlador);
		buttonChangeTime.setFont(new Font("Agency FB", Font.BOLD, 20));
		buttonChangeTime.setActionCommand(Constants.CHANGE);
		this.add(buttonChangeTime);
		this.setForeground(Color.decode("#89f590"));
	}

	public void addTables() {
		panelTables.setVisible(true);
		panelTables.setBorder(BorderFactory.createLineBorder(Color.RED));
		this.repaint();

	}

	public void unableButtonStart() {
		buttonStart.setEnabled(false);
	}

	public void enableButtonStart() {
		buttonStart.setEnabled(true);
	}

	public JTextField getTxtPedidosMesa1() {
		return textFieldOrderTableOne;
	}

	public void setTxtPedidosMesa1(String txtPedidosMesa1) {
		this.textFieldOrderTableOne.setText(txtPedidosMesa1);
	}

	public JTextField getTxtDaysOfSimulation() {
		return txtDaysOfSimulation;
	}

	public void setTxtPedidosMesa2(String txtPedidosMesa2) {
		this.txtDaysOfSimulation.setText(txtPedidosMesa2);
	}
	public JTextField getTimeTxt() {
		return textFieldTime;
	}

	public void setTxttiempo(JTextField txttiempo) {
		this.textFieldTime = txttiempo;
	}

	public JTextField getTxtnumeropedidos() {
		return textFieldOrderAmount;
	}

	public void setTxtnumeropedidos(JTextField txtnumeropedidos) {
		this.textFieldOrderAmount = txtnumeropedidos;
	}

	public PanelTable getPanelTables() {
		return panelTables;
	}

	public void setPanelTablas(PanelTable panelTablas) {
		this.panelTables = panelTablas;
	}

	public PanelData getPanelData() {
		return panelData;
	}

	public void setPanelData(PanelData panelData) {
		this.panelData = panelData;
	}

	public JTextField getTextFieldTimeChange() {
		return textFieldTimeChange;
	}

	public void setTextFieldTimeChange(JTextField textFieldTimeChange) {
		this.textFieldTimeChange = textFieldTimeChange;
	}

	public JButton getButtonChangeTime() {
		return buttonChangeTime;
	}

	public void setButtonChangeTime(JButton buttonChangeTime) {
		this.buttonChangeTime = buttonChangeTime;
	}

	
}
