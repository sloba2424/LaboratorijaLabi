package model;

/***********************************************************************
 * Module:  ZahtevAnalize.java
 * Author:  Zelic
 * Purpose: Defines the Class ZahtevAnalize
 ***********************************************************************/

import java.util.*;

public class ZahtevAnalize {
   private Date datumZahteva;
   
   private boolean kucnaPoseta;
   
   private boolean uzorakUzet;
   
   public Analiza[] analiza;

   public StanjeZahteva stanjeZahteva;

   public Pacijent pacijent;

   public MedicinskiTehnicar medicinskiTehnicar;
   
   public Laborant[] laborant;
   
   public Nalaz nalaz;
   
   
   
   public Pacijent getPacijent() {
      return pacijent;
   }
   
   public void setPacijent(Pacijent newPacijent) {
      if (this.pacijent == null || !this.pacijent.equals(newPacijent))
      {
         if (this.pacijent != null)
         {
            Pacijent oldPacijent = this.pacijent;
            this.pacijent = null;
            oldPacijent.removeZahtevAnalize(this);
         }
         if (newPacijent != null)
         {
            this.pacijent = newPacijent;
            this.pacijent.addZahtevAnalize(this);
         }
      }
   }
   
   public MedicinskiTehnicar getMedicinskiTehnicar() {
      return medicinskiTehnicar;
   }
   
   public void setMedicinskiTehnicar(MedicinskiTehnicar newMedicinskiTehnicar) {
      if (this.medicinskiTehnicar == null || !this.medicinskiTehnicar.equals(newMedicinskiTehnicar))
      {
         if (this.medicinskiTehnicar != null)
         {
            MedicinskiTehnicar oldMedicinskiTehnicar = this.medicinskiTehnicar;
            this.medicinskiTehnicar = null;
            oldMedicinskiTehnicar.removeZahtevAnalize(this);
         }
         if (newMedicinskiTehnicar != null)
         {
            this.medicinskiTehnicar = newMedicinskiTehnicar;
            this.medicinskiTehnicar.addZahtevAnalize(this);
         }
      }
   }

}