import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * One object of class MyFrame build a window to input the data of employee, add
 * it into the list, give a raise in their salary and print the list
 * 
 * @author johnlaw
 */
public class GuiView extends JFrame implements ActionListener {
	private JButton addEmployee;
	private JButton setEmployee;
	private JButton addManager;
	private JButton setManager;
	private JButton addWorker;
	private JButton setWorker;
	private JButton addRaise;
	private JButton setRaise;
	private JButton print;
	private JTextField addNameField;
	private JTextField addSsnField;
	private JTextField addSalaryField;
	private JTextField addTitleField;
	private JTextField addBonusField;
	private JTextField addBossField;
	private JTextField addDepartmentField;
	private JTextField addPercentRaiseField;
	private JTextArea screen;
	private LinkedList list = new LinkedList();
	private String name = null;
	private String ssn = null;
	private double salary = 0;
	private String boss = null;
	private String department = null;
	private String title = null;
	private double bonus = 0;
	private double percentRaise;

	/**
	 * Initializes the screen of window that the user will see
	 */
	private void initialize() {
		addNameField = new JTextField("Type name here: ", 20);
		addSsnField = new JTextField("Type ssn here: ", 20);
		addSalaryField = new JTextField("Type salary here: ", 20);
		addTitleField = new JTextField("Type title here: ", 20);
		addBonusField = new JTextField("Type bonus here: ", 20);
		addBossField = new JTextField("Type boss here: ", 20);
		addDepartmentField = new JTextField("Type department here: ", 20);
		addPercentRaiseField = new JTextField("Type the percent raise here: ",
				20);
		this.setLayout(new FlowLayout());
		addEmployee = new JButton("Add an Employee");
		addManager = new JButton("Add a Manager");
		addWorker = new JButton("Add a Worker");
		addRaise = new JButton("Raise");
		print = new JButton("Print");
		addAllMenuButton();
		addEmployee.addActionListener(this);
		addManager.addActionListener(this);
		addWorker.addActionListener(this);
		addRaise.addActionListener(this);
		print.addActionListener(this);
		screen = new JTextArea("Welcome to the EMPLOYEELIST!");
		this.add(screen);
		this.setSize(700, 200);
		this.setTitle("EMPLOYEELIST");
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}

	/**
	 * Supplies default screen of the window
	 */
	public GuiView() {
		this.initialize();
	}

	/**
	 * Sets the function of the button
	 */
	public void actionPerformed(ActionEvent evt) {
		this.remove(screen);
		try {
			if (evt.getSource() == addEmployee) {
				removeAllMenuButton();
				addEmployeeField();
				setEmployee = new JButton("Enter");
				add(setEmployee);
				setEmployee.addActionListener(this);
			} else if (evt.getSource() == setEmployee) {
				getEmployeeField();
				Employee newEmployee;
				newEmployee = new Employee(name, ssn, salary);
				list.recursiveAddAtend(newEmployee);
				removeEmployeeField();
				this.remove(setEmployee);
				initializeEmployeeField();
				addAllMenuButton();
				screen = new JTextArea(name + " was added in the list!");
				this.add(screen);
			} else if (evt.getSource() == addManager) {
				removeAllMenuButton();
				addManagerField();
				setManager = new JButton("Enter");
				this.add(setManager);
				setManager.addActionListener(this);
			} else if (evt.getSource() == setManager) {
				getManagerField();
				Manager newManager;
				newManager = new Manager(name, ssn, salary, title, bonus);
				list.recursiveAddAtend(newManager);
				removeManagerField();
				this.remove(setManager);
				initializeManagerField();
				addAllMenuButton();
				screen = new JTextArea(name + " was added in the list!");
				this.add(screen);
			} else if (evt.getSource() == addWorker) {
				removeAllMenuButton();
				addWorkerField();
				setWorker = new JButton("Enter");
				this.add(setWorker);
				setWorker.addActionListener(this);
			} else if (evt.getSource() == setWorker) {
				getWorkerField();
				Worker newWorker;
				newWorker = new Worker(name, ssn, salary, boss, department);
				list.recursiveAddAtend(newWorker);
				removeWorkerField();
				this.remove(setWorker);
				initializeWorkerField();
				addAllMenuButton();
				screen = new JTextArea(name + " was added in the list!");
				this.add(screen);
			} else if (evt.getSource() == addRaise) {
				removeAllMenuButton();
				addRaiseField();
				setRaise = new JButton("Enter");
				add(setRaise);
				setRaise.addActionListener(this);
			} else if (evt.getSource() == setRaise) {
				getRaiseField();
				list.raise(percentRaise);
				removeRaiseField();
				this.remove(setRaise);
				this.initializeRaiseField();
				addAllMenuButton();
				screen = new JTextArea("Everyone was given a raise in salary!");
				this.add(screen);
				this.removeRaiseField();
			} else if (evt.getSource() == print) {
				if (list.toString() == "") {
					screen = new JTextArea("There is no employee in the list.");
				} else {
					screen = new JTextArea(list.toString());
				}
				this.add(screen);
			}
		} catch (Exception e) {
			if (evt.getSource() == setEmployee) {
				removeEmployeeField();
				this.remove(setEmployee);
				initializeEmployeeField();
			} else if (evt.getSource() == setManager) {
				removeManagerField();
				this.remove(setManager);
				initializeManagerField();
			} else if (evt.getSource() == setWorker) {
				removeWorkerField();
				this.remove(setWorker);
				initializeWorkerField();
			} else if (evt.getSource() == setRaise) {
				removeRaiseField();
				this.remove(setRaise);
				initializeRaiseField();
			}
			addAllMenuButton();
			screen = new JTextArea("Please input the correct data!");
			this.add(screen);
		}
		this.validate();
		this.invalidate();
		this.repaint();
	}

	/**
	 * Adds the text fields that created to add an Employee
	 */
	public void addEmployeeField() {
		this.add(addNameField);
		this.add(addSsnField);
		this.add(addSalaryField);
	}

	/**
	 * Gets the data from the text fields that created to add an Employee
	 */
	public void getEmployeeField() {
		name = addNameField.getText();
		ssn = addSsnField.getText();
		salary = Double.parseDouble(addSalaryField.getText());
	}

	/**
	 * Initializes all the text fields that created to add a Manager
	 */
	public void removeEmployeeField() {
		this.remove(addNameField);
		this.remove(addSsnField);
		this.remove(addSalaryField);
	}

	/**
	 * Initializes all the text fields that created to add a Employee
	 */
	public void initializeEmployeeField() {
		addNameField = new JTextField("Type name here: ", 20);
		addSsnField = new JTextField("Type ssn here: ", 20);
		addSalaryField = new JTextField("Type salary here: ", 20);
	}

	/**
	 * Adds the text fields that created to add a Manager
	 */
	public void addManagerField() {
		addEmployeeField();
		this.add(addTitleField);
		this.add(addBonusField);
	}

	/**
	 * Gets the data from the text fields that created to add a Manager
	 */
	public void getManagerField() {
		getEmployeeField();
		title = addTitleField.getText();
		bonus = Double.parseDouble(addBonusField.getText());
	}

	/**
	 * Removes all the text fields that created to add a Manager
	 */
	public void removeManagerField() {
		removeEmployeeField();
		this.remove(addTitleField);
		this.remove(addBonusField);
	}

	/**
	 * Initializes all the text fields that created to add a Manager
	 */
	public void initializeManagerField() {
		initializeEmployeeField();
		addTitleField = new JTextField("Type title here: ", 20);
		addBonusField = new JTextField("Type bonus here: ", 20);
	}

	/**
	 * Adds the text fields that created to add a Worker
	 */
	public void addWorkerField() {
		addEmployeeField();
		this.add(addBossField);
		this.add(addDepartmentField);
	}

	/**
	 * Gets the data from the text fields that created to add a Worker
	 */
	public void getWorkerField() {
		getEmployeeField();
		boss = addBossField.getText();
		department = addDepartmentField.getText();
	}

	/**
	 * Removes all the text fields that created to add a Worker
	 */
	public void removeWorkerField() {
		removeEmployeeField();
		this.remove(addBossField);
		this.remove(addDepartmentField);
	}

	/**
	 * Initializes all the text fields that created to add a Worker
	 */
	public void initializeWorkerField() {
		initializeEmployeeField();
		addBossField = new JTextField("Type boss here: ", 20);
		addDepartmentField = new JTextField("Type department here: ", 20);
	}

	/**
	 * Adds the text fields that created to raise employee salary in salary
	 */
	public void addRaiseField() {
		this.add(addPercentRaiseField);
	}

	/**
	 * Gets the data from the text fields that created to give everyone a raise
	 * in salary
	 */
	public void getRaiseField() {
		percentRaise = Double.parseDouble(addPercentRaiseField.getText());
	}

	/**
	 * Removes all the text fields that created to give everyone a raise in
	 * salary
	 */
	public void removeRaiseField() {
		this.remove(addPercentRaiseField);
	}

	/**
	 * Initializes all the text fields that created to give everyone a raise in
	 * salary
	 */
	public void initializeRaiseField() {
		addPercentRaiseField = new JTextField("Type the percent raise here: ",
				20);
	}

	/**
	 * Removes all the buttons in the menu page
	 */
	public void removeAllMenuButton() {
		this.remove(addEmployee);
		this.remove(addManager);
		this.remove(addWorker);
		this.remove(addRaise);
		this.remove(print);
	}

	/**
	 * Adds all the buttons in the menu page
	 */
	public void addAllMenuButton() {
		add(addEmployee);
		add(addManager);
		add(addWorker);
		add(addRaise);
		add(print);
	}
}