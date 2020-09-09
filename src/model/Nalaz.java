package model;

/***********************************************************************
 * Module:  Nalaz.java
 * Author:  Zelic
 * Purpose: Defines the Class Nalaz
 ***********************************************************************/

import java.util.*;


public class Nalaz {
   private Date datumObrade;
   
   private int ukupnaCena;
   
   public ZahtevAnalize zahtevAnalize;

   public Pacijent pacijent;

   public Laborant[] laborant;
   
   
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
            oldPacijent.removeNalaz(this);
         }
         if (newPacijent != null)
         {
            this.pacijent = newPacijent;
            this.pacijent.addNalaz(this);
         }
      }
   }

}