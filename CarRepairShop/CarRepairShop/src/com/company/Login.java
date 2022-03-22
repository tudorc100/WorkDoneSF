package com.company;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Login {
    Garage garaj=new Garage(10000,0);
    Yard curte= new Yard(0);
    @FXML
    public Button btnintrodu;
    @FXML
    public Button ok;
   @FXML
    public Button curata;
    @FXML
    public Button plusb;
    @FXML
    public Button btndiag;
    @FXML
    public Button btnrep;
    @FXML
    public Button btnpay;
    @FXML
    public Button btnstatus;
    @FXML
    public TextField nrtel;
    @FXML
    public TextField placuta;
    @FXML
    public Label lblprint;
    @FXML
    public Button curtegaraj;
    @FXML
    public Label masinicurte;
    @FXML
    public Label reparatecurte;
    @FXML
    public Label lblprint1;
    @FXML
    public Label lblprint2;
    @FXML
    public Label lblprint3;
    @FXML
    public Label lblprint4;
    @FXML
    public Label lblprint5;
    @FXML
    public Label lblprint6;
    @FXML
    public Label lblprint7;
    @FXML
    public Label lblprint8;
    @FXML
    public Label lblprint9;
    @FXML
    public Label lblprint10;
    @FXML
    public Label lblprint11;
    @FXML
    public Label lblprintb;
    @FXML
    public TextField placutao;
    @FXML
    public TextField placutad;
    @FXML
    public TextField nrtelp;
    @FXML
    public TextField placutar;
    @FXML
    public Label lblerr;
    @FXML
    public TextField buget;
    public String telefon;
    public String reparate;
    public String placa;
    public String placao;
    public String placadiag;
    public String placarep;
    public int budget;
    public String telefonp;
    public void introduce(ActionEvent actionEvent) {
        placa=placuta.getText();
        telefon=nrtel.getText();
        budget=Integer.parseInt(buget.getText());
        Owner owner=new Owner(telefon,budget);
        Car car=new Car(placa,owner,"Nediagnosticat");
        if(garaj.getNrcars()<12&&garaj.getNrcars()+ curte.getNrCars()<20)
        {
            garaj.getCars().add(car);
            garaj.setNrcars(garaj.getNrcars()+1);
        }
        else
            if(curte.getNrCars()+ garaj.getNrcars()<20)
            {
                lblerr.setText("Prea multe mașini în garaj, am pus-o în curte");
                curte.getCars().add(car);
                curte.setNrCars(curte.getNrCars()+1);
            }
            else
            lblerr.setText("Prea multe mașini în garaj și curte");

        //lblprint.setText("Telefon=        "+telefon+"\n"+"Numar Inmatriculare:"+placa);
        placuta.setText(null);
        nrtel.setText(null);
        buget.setText(null);

    }
    public void aratasts(ActionEvent actionEvent)
    {
        reparate=" ";

        if(garaj.getNrcars()==0)
            lblprint.setText(null);
        lblprint1.setText(null);
        lblprint2.setText(null);
        lblprint3.setText(null);
        lblprint4.setText(null);
        lblprint5.setText(null);
        lblprint6.setText(null);
        lblprint7.setText(null);
        lblprint8.setText(null);
        lblprint9.setText(null);
        lblprint10.setText(null);
        lblprint11.setText(null);
            if(garaj.getNrcars()>0)
            lblprint.setText("Masina: "+garaj.getCars().get(0).getPlate()+"      Statut:"+garaj.getCars().get(0).getState()+"    Tel:"+garaj.getCars().get(0).getOwner().getNrtel());
            if(garaj.getNrcars()==1)
                lblprint1.setText(null);
        lblprint2.setText(null);
        lblprint3.setText(null);
        lblprint4.setText(null);
        lblprint5.setText(null);
        lblprint6.setText(null);
        lblprint7.setText(null);
        lblprint8.setText(null);
        lblprint9.setText(null);
        lblprint10.setText(null);
        lblprint11.setText(null);
        if(garaj.getNrcars()>1)
        lblprint1.setText("Masina: "+garaj.getCars().get(1).getPlate()+"      Statut:"+garaj.getCars().get(1).getState()+"    Tel:"+garaj.getCars().get(1).getOwner().getNrtel());
        if(garaj.getNrcars()==2)
            lblprint2.setText(null);
        lblprint3.setText(null);
        lblprint4.setText(null);
        lblprint5.setText(null);
        lblprint6.setText(null);
        lblprint7.setText(null);
        lblprint8.setText(null);
        lblprint9.setText(null);
        lblprint10.setText(null);
        lblprint11.setText(null);
        if(garaj.getNrcars()>2)
        lblprint2.setText("Masina: "+garaj.getCars().get(2).getPlate()+"      Statut:"+garaj.getCars().get(2).getState()+"    Tel:"+garaj.getCars().get(2).getOwner().getNrtel());
        if(garaj.getNrcars()==3)
            lblprint3.setText(null);
        lblprint4.setText(null);
        lblprint5.setText(null);
        lblprint6.setText(null);
        lblprint7.setText(null);
        lblprint8.setText(null);
        lblprint9.setText(null);
        lblprint10.setText(null);
        lblprint11.setText(null);
        if(garaj.getNrcars()>3)
            lblprint3.setText("Masina: "+garaj.getCars().get(3).getPlate()+"      Statut:"+garaj.getCars().get(3).getState()+"    Tel:"+garaj.getCars().get(3).getOwner().getNrtel());
        if(garaj.getNrcars()==4)
            lblprint4.setText(null);
        lblprint5.setText(null);
        lblprint6.setText(null);
        lblprint7.setText(null);
        lblprint8.setText(null);
        lblprint9.setText(null);
        lblprint10.setText(null);
        lblprint11.setText(null);
        if(garaj.getNrcars()>4)
            lblprint4.setText("Masina: "+garaj.getCars().get(4).getPlate()+"      Statut:"+garaj.getCars().get(4).getState()+"    Tel:"+garaj.getCars().get(4).getOwner().getNrtel());
        if(garaj.getNrcars()==5)
            lblprint5.setText(null);
        lblprint6.setText(null);
        lblprint7.setText(null);
        lblprint8.setText(null);
        lblprint9.setText(null);
        lblprint10.setText(null);
        lblprint11.setText(null);
        if(garaj.getNrcars()>5)
            lblprint5.setText("Masina: "+garaj.getCars().get(5).getPlate()+"      Statut:"+garaj.getCars().get(5).getState()+"    Tel:"+garaj.getCars().get(5).getOwner().getNrtel());
        if(garaj.getNrcars()==6)
            lblprint6.setText(null);
        lblprint7.setText(null);
        lblprint8.setText(null);
        lblprint9.setText(null);
        lblprint10.setText(null);
        lblprint11.setText(null);
        if(garaj.getNrcars()>6)
            lblprint6.setText("Masina: "+garaj.getCars().get(6).getPlate()+"      Statut:"+garaj.getCars().get(6).getState()+"    Tel:"+garaj.getCars().get(6).getOwner().getNrtel());
        if(garaj.getNrcars()==7)
            lblprint7.setText(null);
        lblprint8.setText(null);
        lblprint9.setText(null);
        lblprint10.setText(null);
        lblprint11.setText(null);
        if(garaj.getNrcars()>7)
            lblprint7.setText("Masina: "+garaj.getCars().get(7).getPlate()+"      Statut:"+garaj.getCars().get(7).getState()+"    Tel:"+garaj.getCars().get(7).getOwner().getNrtel());
        if(garaj.getNrcars()==8)
            lblprint8.setText(null);
        lblprint9.setText(null);
        lblprint10.setText(null);
        lblprint11.setText(null);
        if(garaj.getNrcars()>8)
            lblprint8.setText("Masina: "+garaj.getCars().get(8).getPlate()+"      Statut:"+garaj.getCars().get(8).getState()+"    Tel:"+garaj.getCars().get(8).getOwner().getNrtel());
        if(garaj.getNrcars()==9)
            lblprint9.setText(null);
        lblprint10.setText(null);
        lblprint11.setText(null);
        if(garaj.getNrcars()>9)
            lblprint9.setText("Masina: "+garaj.getCars().get(9).getPlate()+"      Statut:"+garaj.getCars().get(9).getState()+"    Tel:"+garaj.getCars().get(9).getOwner().getNrtel());
        if(garaj.getNrcars()==10)
            lblprint10.setText(null);
        lblprint11.setText(null);
        if(garaj.getNrcars()>10)
            lblprint10.setText("Masina: "+garaj.getCars().get(10).getPlate()+"      Statut:"+garaj.getCars().get(10).getState()+"    Tel:"+garaj.getCars().get(10).getOwner().getNrtel());
        if(garaj.getNrcars()==11)
            lblprint11.setText(null);
        if(garaj.getNrcars()>11)
            lblprint11.setText("Masina: "+garaj.getCars().get(11).getPlate()+"      Statut:"+garaj.getCars().get(11).getState()+"    Tel:"+garaj.getCars().get(11).getOwner().getNrtel());

        for(int i=0;i< curte.getNrCars();i++)
            if (curte.getCars().get(i).getState().equals("Reparat"))
                reparate=reparate+curte.getCars().get(i).getPlate()+",";
        reparatecurte.setText(reparate);
        lblprintb.setText("Buget:"+garaj.getMoney());
masinicurte.setText("Mașini în curte:"+curte.getNrCars());

    }
    public void plateste(ActionEvent actionEvent)
    {
        placao=placutao.getText();
        int ok=0;
        for(int i=0;i< garaj.getNrcars();i++)
        {
            if (garaj.getCars().get(i).getPlate().equals(placao))
            {   ok++;
                if(garaj.getCars().get(i).getState().equals("Reparat"))
            {
                if(garaj.getCars().get(i).getOwner().getBudget()>=1000)
                {
                    garaj.getCars().remove(i);
                    garaj.setNrcars(garaj.getNrcars() - 1);
                    garaj.setMoney(garaj.getMoney()+1000);
                }
                else
                    lblerr.setText("Proprietarul nu are bani de reparație");
            }
                else lblerr.setText("Mașina nu e reparată");
        }
    }
        if (ok==0)
        for(int i=0;i< curte.getNrCars();i++)
        {
            if (curte.getCars().get(i).getPlate().equals(placao))
            {   ok++;
                if(curte.getCars().get(i).getState().equals("Reparat"))
                {
                    if(curte.getCars().get(i).getOwner().getBudget()>=1000)
                    {
                        curte.getCars().remove(i);
                        curte.setNrCars(curte.getNrCars() - 1);
                        garaj.setMoney(garaj.getMoney()+1000);
                    }
                    else
                        lblerr.setText("Proprietarul nu are bani de reparație");
                }
                else lblerr.setText("Mașina nu e reparată");
            }
        }
       if(ok==0)
           lblerr.setText("Mașina nu există în garaj sau curte");
       placutao.setText(null);

}
    public void diagnoza(ActionEvent actionEvent)
    {
        placadiag=placutad.getText();
        int ok=0;
        for(int i=0;i< garaj.getNrcars();i++)
        {
            if(garaj.getCars().get(i).getPlate().equals(placadiag))
            {
                ok++;
                if (garaj.getCars().get(i).getState().equals("Nediagnosticat"))
                {
                    garaj.getCars().get(i).setState("Diagnosticat");
                } else lblerr.setText("Mașina a fost deja diagnosticată");
            }
        }
        if(ok==0)
            lblerr.setText("Mașina nu există în garaj");
        placutad.setText(null);
    }

    public void reparatie(ActionEvent actionEvent)
    {
        placarep=placutar.getText();
        int ok=0;
        for(int i=0;i< garaj.getNrcars();i++)
        {
            if(garaj.getCars().get(i).getPlate().equals(placarep))
            {
                ok++;
                if (garaj.getCars().get(i).getState().equals("Diagnosticat"))
                {
                    garaj.getCars().get(i).setState("Reparat");
                } else if(garaj.getCars().get(i).getState().equals("Reparat"))
                    lblerr.setText("Mașina a fost deja reparată");
                else lblerr.setText("Mașina nu a fost diagnosticată");
            }
        }
        if(ok==0)
            lblerr.setText("Mașina nu există în garaj");
        placutar.setText(null);
    }
    public void plusbuget(ActionEvent actionEvent)
    {
        int ok=0;
       telefonp=nrtelp.getText();
       for(int i=0;i< garaj.getNrcars();i++)
       {
          if(garaj.getCars().get(i).getOwner().getNrtel().equals(telefonp))
          {
              ok++;
              garaj.getCars().get(i).getOwner().setBudget(garaj.getCars().get(i).getOwner().getBudget()+1000);
          }
       }
       if(ok==0)
           for(int i=0;i< curte.getNrCars();i++)
           {
               if(curte.getCars().get(i).getOwner().getNrtel().equals(telefonp))
               {
                   ok++;
                   curte.getCars().get(i).getOwner().setBudget(curte.getCars().get(i).getOwner().getBudget()+1000);
               }
           }
       if(ok==0) lblerr.setText("Proprietarul nu există");
       nrtelp.setText(null);
    }
    public void ok(ActionEvent actionEvent)
    {
        lblerr.setText(null);
    }
    public void garageToYard(ActionEvent actionEvent)
    {
        int ok=0;
        do {
            if(garaj.getCars().get(ok).getState().equals("Reparat"))
            {
                curte.getCars().add(garaj.getCars().get(ok));
                curte.setNrCars(curte.getNrCars()+1);
                garaj.getCars().remove(ok);
                garaj.setNrcars(garaj.getNrcars()-1);
                ok--;
            }
            ok++;

        }while(curte.getNrCars()+ garaj.getNrcars()<20&&ok<garaj.getNrcars());
    }
    public void yardToGarage(ActionEvent actionEvent)
    {
        if(garaj.getNrcars()>=12)
        {
            lblerr.setText("Nu există loc în garaj");
        }
        else {
            int ok = 0;
            do {
                if (curte.getCars().get(ok).getState().equals("Nediagnosticat")) {
                    garaj.getCars().add(curte.getCars().get(ok));
                    garaj.setNrcars(garaj.getNrcars() + 1);
                    curte.getCars().remove(ok);
                    curte.setNrCars(curte.getNrCars() - 1);
                    ok--;
                }
                ok++;

            } while (garaj.getNrcars() < 12 && ok < curte.getNrCars());
        }
    }
}
