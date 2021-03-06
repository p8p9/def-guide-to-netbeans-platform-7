package com.galileo.netbeans.module;

import com.galileo.netbeans.myentities.Genre;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.openide.modules.ModuleInstall;

public class Installer extends ModuleInstall {

   public static final EntityManagerFactory EMF;
   public static final EntityManager        EM;

   @Override
   public void close() {
      EM.close();
      EMF.close();
   }

   @Override
   public void restored() {

      try {
         EMF = Persistence.createEntityManagerFactory("MyEntitiesPU");
         EM = EMF.createEntityManager();
      } catch (Throwable ex) {
         System.err.println("Initial EntityManagerFactory creation failed." + ex);
         throw new ExceptionInInitializerError(ex);
      }

      EM.getTransaction().begin();
      EM.merge(new Genre(1, "Techno, Trance & Dance"));
      EM.merge(new Genre(2, "Rock & Pop"));
      EM.merge(new Genre(3, "Country & Classic"));
      EM.getTransaction().commit();
   }
}
