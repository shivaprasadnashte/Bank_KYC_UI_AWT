import  java.awt.Label;
import java.awt.*;
import java.awt.event.*;

//Simple KYC Form in Java AWT
class KC extends Frame {
    Label lblTitle,lblName,lblFather,lblPAN,lblAadhar,lblGender,lblOCP,lblACCT,lblAddress,libIP,checkb2,lblacc,lblphone,lblpoa,lblincome,lblnationality,lbldob,lblms,lblst,lblpin;
    TextField txtName,txtFather,txtPAN,txtAadhar,txtacc,txtphone,txtdob,txtincome,txtst,txtpin;
    TextArea txtAddress;
    Checkbox checkMale, checkFemale,checkOther,ACCT1,ACCT2,ACCT3,ACCT4,mars,mars2,nan1,nan2,checkb;
    CheckboxGroup cbg;
    Choice OCP,IP,poa;
    Button btnSave,btnClear;

    public KC() {
        super("KNOW YOUR CUSTOMER(KYC) FORM");
        setSize(1900, 700);
        setLayout(null);
        setVisible(true);
        Color formColor = new Color(255, 213, 128);
        setBackground(formColor);

        Font titleFont = new Font("arial", Font.BOLD, 25);
        Font labelFont =new  Font("arial", Font.PLAIN, 18);
        Font textFont =new  Font("arial", Font.PLAIN, 15);

        lblTitle=new Label("KNOW YOUR CUSTOMER");
        lblTitle.setBounds(500,40,350,50);
        lblTitle.setFont(titleFont);
        lblTitle.setForeground(Color.BLACK);
        add(lblTitle);

        lblName=new Label("Name");
        lblName.setBounds(20,100,150,30);
        lblName.setFont(labelFont);
        lblName.setForeground(Color.BLACK);
        add(lblName);

        txtName=new TextField();
        txtName.setBounds(200,100,400,30);
        txtName.setFont(textFont);
        add(txtName);

        lblFather=new Label("Father/Spouse Name");
        lblFather.setBounds(20,150,200,30);
        lblFather.setFont(labelFont);
        lblFather.setForeground(Color.BLACK);
        add(lblFather);

        txtFather=new TextField();
        txtFather.setBounds(220,150,380,30);
        txtFather.setFont(textFont);
        add(txtFather);

        lblPAN=new Label("PAN");
        lblPAN.setBounds(20,200,150,30);
        lblPAN.setFont(labelFont);
        lblPAN.setForeground(Color.BLACK);
        add(lblPAN);

        txtPAN=new TextField();
        txtPAN.setBounds(200,200,400,30);
        txtPAN.setFont(textFont);
        add(txtPAN);

        lblAadhar=new Label("Aadhar No.");
        lblAadhar.setBounds(20,250,150,30);
        lblAadhar.setFont(labelFont);
        lblAadhar.setForeground(Color.BLACK);
        add(lblAadhar);

        txtAadhar=new TextField();
        txtAadhar.setBounds(200,250,400,30);
        txtAadhar.setFont(textFont);
        add(txtAadhar);


        lblGender=new Label("Gender");
        lblGender.setBounds(20,300,150,30);
        lblGender.setFont(labelFont);
        lblGender.setForeground(Color.BLACK);
        add(lblGender);

        cbg = new CheckboxGroup();

        checkMale = new Checkbox("Male",cbg,true);
        checkMale.setBounds(200,300, 100, 30);
        checkMale.setFont(labelFont);
        checkMale.setForeground(Color.BLACK);
        add(checkMale);

        checkFemale = new Checkbox("Female",cbg,false);
        checkFemale.setBounds(300,300, 100, 30);
        checkFemale.setFont(labelFont);
        checkFemale.setForeground(Color.BLACK);
        add(checkFemale);

        checkOther = new Checkbox("Other",cbg,false);
        checkOther.setBounds(400,300, 100, 30);
        checkOther.setFont(labelFont);
        checkOther.setForeground(Color.BLACK);
        add(checkOther);

        libIP = new Label("Identity Proof");
        libIP.setBounds(20,350,150,30);
        libIP.setFont(labelFont);
        libIP.setForeground(Color.BLACK);
        add(libIP);

        IP = new Choice();
        IP= new Choice();
        IP.setFont(labelFont);
        IP.setBounds(200, 350, 400, 50);
        IP.add("Pan Card");
        IP.add("Aadhar Card");
        IP.add("Driving License");
        IP.add("Voter ID");
        IP.add("Other(Please Specify)");
        add(IP);


        lblOCP=new Label("Occupation");
        lblOCP.setBounds(20,400,150,30);
        lblOCP.setFont(labelFont);
        lblOCP.setForeground(Color.BLACK);
        add(lblOCP);

        OCP= new Choice();
        OCP.setFont(labelFont);
        OCP.setBounds(200, 400, 400, 50);
        OCP.add("PRIVATE");
        OCP.add("PUBLIC");
        OCP.add("GOVERNMENT");
        OCP.add("BUSINESS");
        OCP.add("HOUSEWIFE");
        OCP.add("STUDENT");
        OCP.add("OTHER(Please Specify)");
        add(OCP);

        lblACCT=new Label("Account Type");
        lblACCT.setBounds(20,450,150,30);
        lblACCT.setFont(labelFont);
        lblACCT.setForeground(Color.BLACK);
        add(lblACCT);

        ACCT1= new Checkbox("SB",cbg,false);
        ACCT1.setBounds(200,450, 100, 30);
        ACCT1.setFont(labelFont);
        ACCT1.setForeground(Color.BLACK);
        add(ACCT1);

        ACCT2= new Checkbox("CURR",cbg,false);
        ACCT2.setBounds(300,450, 100, 30);
        ACCT2.setFont(labelFont);
        ACCT2.setForeground(Color.BLACK);
        add(ACCT2);

        ACCT3= new Checkbox("RD",cbg,false);
        ACCT3.setBounds(400,450, 100, 30);
        ACCT3.setFont(labelFont);
        ACCT3.setForeground(Color.BLACK);
        add(ACCT3);

        ACCT4= new Checkbox("FD",cbg,false);
        ACCT4.setBounds(500,450, 100, 30);
        ACCT4.setFont(labelFont);
        ACCT4.setForeground(Color.BLACK);
        add(ACCT4);




        lblAddress=new Label("Address");
        lblAddress.setBounds(20,500,150,30);
        lblAddress.setFont(labelFont);
        lblAddress.setForeground(Color.BLACK);
        add(lblAddress);

        txtAddress=new TextArea(10,30);
        txtAddress.setBounds(200,500,400,100);
        txtAddress.setFont(labelFont);
        add(txtAddress);


        btnSave=new Button("SUBMIT");
        btnSave.setBounds(500,650,150,30);
        btnSave.setFont(labelFont);
        btnSave.setBackground(Color.GREEN);
        btnSave.setForeground(Color.BLACK);
        add(btnSave);

        btnClear=new Button("CLOSE");
        btnClear.setBounds(660,650,150,30);
        btnClear.setFont(labelFont);
        btnClear.setBackground(Color.RED);
        btnClear.setForeground(Color.BLACK);
        add(btnClear);

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        lblacc=new Label("Acc No");
        lblacc.setBounds(750,100,100,30);
        lblacc.setFont(labelFont);
        lblacc.setForeground(Color.BLACK);
        add( lblacc);

        txtacc=new TextField();
        txtacc .setBounds(850,100,400,30);
        txtacc.setFont(textFont);
        add(txtacc);
//======================================================================================================================
        lbldob=new Label("DOB");
        lbldob.setBounds(750,150,100,30);
        lbldob .setFont(labelFont);
        lbldob.setForeground(Color.BLACK);
        add(  lbldob);

        txtdob=new TextField();
        txtdob .setBounds(850,150,400,30);
        txtdob.setFont(textFont);
        add(txtdob);
//======================================================================================================================
        lblms=new Label("Marital Status");
        lblms.setBounds(750,200,150,30);
        lblms.setFont(labelFont);
        lblms.setForeground(Color.BLACK);
        add(lblms);

        mars= new Checkbox("Single",cbg,false);
        mars.setBounds(900,200, 100, 30);
        mars.setFont(labelFont);
        mars.setForeground(Color.BLACK);
        add(mars);

        mars2= new Checkbox("Married",cbg,false);
        mars2.setBounds(1000,200, 100, 30);
        mars2.setFont(labelFont);
        mars2.setForeground(Color.BLACK);
        add(mars2);
//=====================================================================================================================
        lblphone=new Label("Phone No");
        lblphone.setBounds(750,250,100,30);
        lblphone.setFont(labelFont);
        lblphone.setForeground(Color.BLACK);
        add(  lblphone);

        txtphone=new TextField();
        txtphone .setBounds(850,250,400,30);
        txtphone.setFont(textFont);
        add(txtphone);
        //=============================================================================================================
        lblincome=new Label("Income");
        lblincome.setBounds(750,300,100,30);
        lblincome.setFont(labelFont);
        lblincome.setForeground(Color.BLACK);
        add(  lblincome);

        txtincome=new TextField();
        txtincome .setBounds(850,300,400,30);
        txtincome.setFont(textFont);
        add(txtincome);
        //=============================================================================================================
        lblnationality=new Label("Nationality");
        lblnationality.setBounds(750,350,150,30);
        lblnationality.setFont(labelFont);
        lblnationality.setForeground(Color.BLACK);
        add(lblnationality);

        nan1= new Checkbox("Indian",cbg,false);
        nan1.setBounds(900,350, 100, 30);
        nan1.setFont(labelFont);
        nan1.setForeground(Color.BLACK);
        add(nan1);

        nan2= new Checkbox("Other",cbg,false);
        nan2.setBounds(1000,350, 100, 30);
        nan2.setFont(labelFont);
        nan2.setForeground(Color.BLACK);
        add(nan2);
        //=============================================================================================================
        lblst=new Label("State");
        lblst.setBounds(750,400,100,30);
        lblst.setFont(labelFont);
        lblst.setForeground(Color.BLACK);
        add(lblst);

        txtst=new TextField();
        txtst.setBounds(850,400,400,30);
        txtst.setFont(textFont);
        add(txtst);
//======================================================================================================================
        lblpin=new Label("Pin Code");
        lblpin.setBounds(750,450,100,30);
        lblpin.setFont(labelFont);
        lblpin.setForeground(Color.BLACK);
        add(lblpin);

        txtpin=new TextField();
        txtpin.setBounds(850,450,400,30);
        txtpin.setFont(textFont);
        add(txtpin);
//======================================================================================================================
        lblpoa = new Label("Proof Of Address");
        lblpoa.setBounds(750,500,150,30);
        lblpoa.setFont(labelFont);
        lblpoa.setForeground(Color.BLACK);
        add(lblpoa);

        poa = new Choice();
        poa= new Choice();
        poa.setFont(labelFont);
        poa.setBounds(900, 500, 350, 30);
        poa.add("Aadhar Card");
        poa.add("Electricity Bill");
        poa.add("Ration Card");
        poa.add("Other(Please Specify)");
        add(poa);
//======================================================================================================================
        checkb=new Checkbox("I hereby declare that the details furnished above are true.");
        checkb.setBounds(750, 550, 500, 30);
        checkb.setFont(labelFont);
        checkb.setForeground(Color.BLACK);
        add(checkb);

       checkb2 = new Label("I am aware that I may be held liable for it");
        checkb2.setBounds(770, 575, 500, 30);
        checkb2.setFont(labelFont);
        checkb2.setForeground(Color.BLACK);
        add(checkb2);


//======================================================================================================================
        // Close Button Code
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
public class BANK_KYC {
    public static void main(String[] args) {
        KC K = new KC();
    }
}
