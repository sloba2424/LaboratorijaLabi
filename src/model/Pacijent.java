package model;

/***********************************************************************
 * Module:  Pacijent.java
 * Author:  Zelic
 * Purpose: Defines the Class Pacijent
 ***********************************************************************/

import java.util.*;

public class Pacijent extends Osoba {
 
   private String lbo;

   public java.util.Collection<Nalaz> nalaz;

   public java.util.Collection<ZahtevAnalize> zahtevAnalize;
   
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
      {
         this.nalaz.add(newNalaz);
         newNalaz.setPacijent(this);      
      }
   }

   public void removeNalaz(Nalaz oldNalaz) {
      if (oldNalaz == null)
         return;
      if (this.nalaz != null)
         if (this.nalaz.contains(oldNalaz))
         {
            this.nalaz.remove(oldNalaz);
            oldNalaz.setPacijent((Pacijent)null);
         }
   }
   
   public void removeAllNalaz() {
      if (nalaz != null)
      {
         Nalaz oldNalaz;
         for (java.util.Iterator iter = getIteratorNalaz(); iter.hasNext();)
         {
            oldNalaz = (Nalaz)iter.next();
            iter.remove();
            oldNalaz.setPacijent((Pacijent)null);
         }
      }
   }

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
      {
         this.zahtevAnalize.add(newZahtevAnalize);
         newZahtevAnalize.setPacijent(this);      
      }
   }
   
   public void removeZahtevAnalize(ZahtevAnalize oldZahtevAnalize) {
      if (oldZahtevAnalize == null)
         return;
      if (this.zahtevAnalize != null)
         if (this.zahtevAnalize.contains(oldZahtevAnalize))
         {
            this.zahtevAnalize.remove(oldZahtevAnalize);
            oldZahtevAnalize.setPacijent((Pacijent)null);
         }
   }
   
   public void removeAllZahtevAnalize() {
      if (zahtevAnalize != null)
      {
         ZahtevAnalize oldZahtevAnalize;
         for (java.util.Iterator iter = getIteratorZahtevAnalize(); iter.hasNext();)
         {
            oldZahtevAnalize = (ZahtevAnalize)iter.next();
            iter.remove();
            oldZahtevAnalize.setPacijent((Pacijent)null);
         }
      }
   }

}