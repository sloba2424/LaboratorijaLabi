package model;

/***********************************************************************
 * Module:  MedicinskiTehnicar.java
 * Author:  Zelic
 * Purpose: Defines the Class MedicinskiTehnicar
 ***********************************************************************/

import java.util.*;

public class MedicinskiTehnicar extends Zaposleni {

   public java.util.Collection<ZahtevAnalize> zahtevAnalize;
   
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
         newZahtevAnalize.setMedicinskiTehnicar(this);      
      }
   }

   public void removeZahtevAnalize(ZahtevAnalize oldZahtevAnalize) {
      if (oldZahtevAnalize == null)
         return;
      if (this.zahtevAnalize != null)
         if (this.zahtevAnalize.contains(oldZahtevAnalize))
         {
            this.zahtevAnalize.remove(oldZahtevAnalize);
            oldZahtevAnalize.setMedicinskiTehnicar((MedicinskiTehnicar)null);
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
            oldZahtevAnalize.setMedicinskiTehnicar((MedicinskiTehnicar)null);
         }
      }
   }

}