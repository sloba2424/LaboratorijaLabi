package model;

/***********************************************************************
 * Module:  Specijalizacija.java
 * Author:  Zelic
 * Purpose: Defines the Class Specijalizacija
 ***********************************************************************/

import java.util.*;

public class Specijalizacija {
   private String vrstaSpecijalizacije;
   
   public java.util.Collection<Laborant> laborant;
   
   public java.util.Collection<Laborant> getLaborant() {
      if (laborant == null)
         laborant = new java.util.HashSet<Laborant>();
      return laborant;
   }

   public java.util.Iterator getIteratorLaborant() {
      if (laborant == null)
         laborant = new java.util.HashSet<Laborant>();
      return laborant.iterator();
   }
   
   public void setLaborant(java.util.Collection<Laborant> newLaborant) {
      removeAllLaborant();
      for (java.util.Iterator iter = newLaborant.iterator(); iter.hasNext();)
         addLaborant((Laborant)iter.next());
   }
   
   public void addLaborant(Laborant newLaborant) {
      if (newLaborant == null)
         return;
      if (this.laborant == null)
         this.laborant = new java.util.HashSet<Laborant>();
      if (!this.laborant.contains(newLaborant))
         this.laborant.add(newLaborant);
   }
   
   public void removeLaborant(Laborant oldLaborant) {
      if (oldLaborant == null)
         return;
      if (this.laborant != null)
         if (this.laborant.contains(oldLaborant))
            this.laborant.remove(oldLaborant);
   }
   
   public void removeAllLaborant() {
      if (laborant != null)
         laborant.clear();
   }

}