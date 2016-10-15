/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galileo.netbeans.module;

import org.openide.windows.TopComponent;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.NbBundle.Messages;
import org.openide.util.NbPreferences;

@TopComponent.Description(preferredID = "MyTopComponent",
//iconBase="SET/PATH/TO/ICON/HERE", 
persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "editor", openAtStartup = true)
@ActionID(category = "Window", id = "com.galileo.netbeans.module.MyTopComponent")
@ActionReference(path = "Menu/Window", position = 50)
@TopComponent.OpenActionRegistration(displayName = "#CTL_MyAction",
preferredID = "MyTopComponent")
@Messages(
   {"CTL_MyTopComponent=MyWindow", "CTL_MyAction=MyWindow"})
public final class MyTopComponent extends TopComponent {

   public MyTopComponent() {
      initComponents();
      setName(Bundle.CTL_MyTopComponent());
   }

   /** This method is called from within the constructor to
    * initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is
    * always regenerated by the Form Editor.
    */
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      propValue = new javax.swing.JTextField();
      okButton = new javax.swing.JButton();

      propValue.setText(org.openide.util.NbBundle.getMessage(MyTopComponent.class, "MyTopComponent.propValue.text")); // NOI18N
      propValue.setName("propValue"); // NOI18N

      org.openide.awt.Mnemonics.setLocalizedText(okButton, org.openide.util.NbBundle.getMessage(MyTopComponent.class, "MyTopComponent.okButton.text")); // NOI18N
      okButton.setName("okButton"); // NOI18N
      okButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            okButtonActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(propValue, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
               .addComponent(okButton, javax.swing.GroupLayout.Alignment.TRAILING))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(propValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(okButton)
            .addContainerGap(240, Short.MAX_VALUE))
      );

      propValue.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(MyTopComponent.class, "MyTopComponent.propValue.AccessibleContext.accessibleName")); // NOI18N
   }// </editor-fold>//GEN-END:initComponents

   private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
      NbPreferences.forModule(MyTopComponent.class).put("propKey", propValue.getText());
   }//GEN-LAST:event_okButtonActionPerformed

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton okButton;
   private javax.swing.JTextField propValue;
   // End of variables declaration//GEN-END:variables
   @Override
   public void componentOpened() {
      propValue.setText(NbPreferences.forModule(MyTopComponent.class).get("propKey", "default"));
   }

   @Override
   public void componentClosed() {
      // TODO add custom code on component closing
   }
}