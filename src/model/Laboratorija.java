package model;

/***********************************************************************
 * Module:  Laboratorija.java
 * Author:  Zelic
 * Purpose: Defines the Class Laboratorija
 ***********************************************************************/

import java.util.*;


public class Laboratorija {
   private String naziv;

   private int cenaPoseteSaVremenom;

   private int cenaPoseteBezVremena;
   

   public java.util.Collection<Analiza> analiza;

   public java.util.Collection<Zaposleni> zaposleni;

   public java.util.Collection<Administrator> administrator;

   public java.util.Collection<GrupaAnalize> grupaAnalize;

   public Pacijent[] pacijent;
   
   
   public java.util.Collection<Analiza> getAnaliza() {
      if (analiza == null)
         analiza = new java.util.HashSet<Analiza>();
      return analiza;
   }
   
   public java.util.Iterator getIteratorAnaliza() {
      if (analiza == null)
         analiza = new java.util.HashSet<Analiza>();
      return analiza.iterator();
   }
   
   public void setAnaliza(java.util.Collection<Analiza> newAnaliza) {
      removeAllAnaliza();
      for (java.util.Iterator iter = newAnaliza.iterator(); iter.hasNext();)
         addAnaliza((Analiza)iter.next());
   }
   
   public void addAnaliza(Analiza newAnaliza) {
      if (newAnaliza == null)
         return;
      if (this.analiza == null)
         this.analiza = new java.util.HashSet<Analiza>();
      if (!this.analiza.contains(newAnaliza))
         this.analiza.add(newAnaliza);
   }
   
   public void removeAnaliza(Analiza oldAnaliza) {
      if (oldAnaliza == null)
         return;
      if (this.analiza != null)
         if (this.analiza.contains(oldAnaliza))
            this.analiza.remove(oldAnaliza);
   }
   
   public void removeAllAnaliza() {
      if (analiza != null)
         analiza.clear();
   }

   public java.util.Collection<Zaposleni> getZaposleni() {
      if (zaposleni == null)
         zaposleni = new java.util.HashSet<Zaposleni>();
      return zaposleni;
   }
   
   public java.util.Iterator getIteratorZaposleni() {
      if (zaposleni == null)
         zaposleni = new java.util.HashSet<Zaposleni>();
      return zaposleni.iterator();
   }
   
   public void setZaposleni(java.util.Collection<Zaposleni> newZaposleni) {
      removeAllZaposleni();
      for (java.util.Iterator iter = newZaposleni.iterator(); iter.hasNext();)
         addZaposleni((Zaposleni)iter.next());
   }
   
   public void addZaposleni(Zaposleni newZaposleni) {
      if (newZaposleni == null)
         return;
      if (this.zaposleni == null)
         this.zaposleni = new java.util.HashSet<Zaposleni>();
      if (!this.zaposleni.contains(newZaposleni))
         this.zaposleni.add(newZaposleni);
   }
   
   public void removeZaposleni(Zaposleni oldZaposleni) {
      if (oldZaposleni == null)
         return;
      if (this.zaposleni != null)
         if (this.zaposleni.contains(oldZaposleni))
            this.zaposleni.remove(oldZaposleni);
   }
   
   public void removeAllZaposleni() {
      if (zaposleni != null)
         zaposleni.clear();
   }
   
   public java.util.Collection<Administrator> getAdministrator() {
      if (administrator == null)
         administrator = new java.util.HashSet<Administrator>();
      return administrator;
   }
   
   public java.util.Iterator getIteratorAdministrator() {
      if (administrator == null)
         administrator = new java.util.HashSet<Administrator>();
      return administrator.iterator();
   }
   
   public void setAdministrator(java.util.Collection<Administrator> newAdministrator) {
      removeAllAdministrator();
      for (java.util.Iterator iter = newAdministrator.iterator(); iter.hasNext();)
         addAdministrator((Administrator)iter.next());
   }
   
   public void addAdministrator(Administrator newAdministrator) {
      if (newAdministrator == null)
         return;
      if (this.administrator == null)
         this.administrator = new java.util.HashSet<Administrator>();
      if (!this.administrator.contains(newAdministrator))
         this.administrator.add(newAdministrator);
   }
   
   public void removeAdministrator(Administrator oldAdministrator) {
      if (oldAdministrator == null)
         return;
      if (this.administrator != null)
         if (this.administrator.contains(oldAdministrator))
            this.administrator.remove(oldAdministrator);
   }
   
   public void removeAllAdministrator() {
      if (administrator != null)
         administrator.clear();
   }
   
   public java.util.Collection<GrupaAnalize> getGrupaAnalize() {
      if (grupaAnalize == null)
         grupaAnalize = new java.util.HashSet<GrupaAnalize>();
      return grupaAnalize;
   }
   
   public java.util.Iterator getIteratorGrupaAnalize() {
      if (grupaAnalize == null)
         grupaAnalize = new java.util.HashSet<GrupaAnalize>();
      return grupaAnalize.iterator();
   }
   
   public void setGrupaAnalize(java.util.Collection<GrupaAnalize> newGrupaAnalize) {
      removeAllGrupaAnalize();
      for (java.util.Iterator iter = newGrupaAnalize.iterator(); iter.hasNext();)
         addGrupaAnalize((GrupaAnalize)iter.next());
   }
   
   public void addGrupaAnalize(GrupaAnalize newGrupaAnalize) {
      if (newGrupaAnalize == null)
         return;
      if (this.grupaAnalize == null)
         this.grupaAnalize = new java.util.HashSet<GrupaAnalize>();
      if (!this.grupaAnalize.contains(newGrupaAnalize))
         this.grupaAnalize.add(newGrupaAnalize);
   }
   
   
   public void removeGrupaAnalize(GrupaAnalize oldGrupaAnalize) {
      if (oldGrupaAnalize == null)
         return;
      if (this.grupaAnalize != null)
         if (this.grupaAnalize.contains(oldGrupaAnalize))
            this.grupaAnalize.remove(oldGrupaAnalize);
   }
   
   
   public void removeAllGrupaAnalize() {
      if (grupaAnalize != null)
         grupaAnalize.clear();
   }

}