package model;

/***********************************************************************
 * Module:  Laborant.java
 * Author:  Zelic
 * Purpose: Defines the Class Laborant
 ***********************************************************************/

import java.util.*;


public class Laborant extends Zaposleni {
   public java.util.Collection<ZahtevAnalize> zahtevAnalize;

   public java.util.Collection<Nalaz> nalaz;

   public Specijalizacija[] specijalizacija;
   
   
   public java.util.Collection<ZahtevAnalize> getZahtevAnalize() {
      if (zahtevAnalize == null)
         zahtevAnalize = new java.util.HashSet<ZahtevAnalize>();
      return zahtevAnalize;
   }
   
   public java.util.Iterator getIteratorZahtevAnalize() {
      if (zahtevAnalize == null)
         zahtevAnalize = new java.util.HashSet<ZahtevAnalize>();
      return zahtevAnalize.iterator();
   }
   
   public void setZahtevAnalize(java.util.Collection<ZahtevAnalize> newZahtevAnalize) {
      removeAllZahtevAnalize();
      for (java.util.Iterator iter = newZahtevAnalize.iterator(); iter.hasNext();)
         addZahtevAnalize((ZahtevAnalize)iter.next());
   }
   
   public void addZahtevAnalize(ZahtevAnalize newZahtevAnalize) {
      if (newZahtevAnalize == null)
         return;
      if (this.zahtevAnalize == null)
         this.zahtevAnalize = new java.util.HashSet<ZahtevAnalize>();
      if (!this.zahtevAnalize.contains(newZahtevAnalize))
         this.zahtevAnalize.add(newZahtevAnalize);
   }
   
   public void removeZahtevAnalize(ZahtevAnalize oldZahtevAnalize) {
      if (oldZahtevAnalize == null)
         return;
      if (this.zahtevAnalize != null)
         if (this.zahtevAnalize.contains(oldZahtevAnalize))
            this.zahtevAnalize.remove(oldZahtevAnalize);
   }
   
   public void removeAllZahtevAnalize() {
      if (zahtevAnalize != null)
         zahtevAnalize.clear();
   }

   public java.util.Collection<Nalaz> getNalaz() {
      if (nalaz == null)
         nalaz = new java.util.HashSet<Nalaz>();
      return nalaz;
   }
   
   public java.util.Iterator getIteratorNalaz() {
      if (nalaz == null)
         nalaz = new java.util.HashSet<Nalaz>();
      return nalaz.iterator();
   }
   
   public void setNalaz(java.util.Collection<Nalaz> newNalaz) {
      removeAllNalaz();
      for (java.util.Iterator iter = newNalaz.iterator(); iter.hasNext();)
         addNalaz((Nalaz)iter.next());
   }

   public void addNalaz(Nalaz newNalaz) {
      if (newNalaz == null)
         return;
      if (this.nalaz == null)
         this.nalaz = new java.util.HashSet<Nalaz>();
      if (!this.nalaz.contains(newNalaz))
         this.nalaz.add(newNalaz);
   }
   
   public void removeNalaz(Nalaz oldNalaz) {
      if (oldNalaz == null)
         return;
      if (this.nalaz != null)
         if (this.nalaz.contains(oldNalaz))
            this.nalaz.remove(oldNalaz);
   }
   
   public void removeAllNalaz() {
      if (nalaz != null)
         nalaz.clear();
   }

}