/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isabel
 */

import java.util.HashMap;
import java.util.Map;

public class form extends javax.swing.JFrame {

    static bio current = new bio();
    
    /**
     * Creates new form form
     */
    public form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        NameField = new javax.swing.JTextField();
        JobField = new javax.swing.JTextField();
        Item1Field = new javax.swing.JTextField();
        Item2Field = new javax.swing.JTextField();
        Item3Field = new javax.swing.JTextField();
        QuoteField = new javax.swing.JTextField();
        NameHexField = new javax.swing.JTextField();
        QuoteHexField = new javax.swing.JTextField();
        GenerateButton = new javax.swing.JButton();
        RandomizeButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CodeHereField = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NameField.setText("Unnamed");
        NameField.setBorder(javax.swing.BorderFactory.createTitledBorder("Name"));

        JobField.setText("None");
        JobField.setBorder(javax.swing.BorderFactory.createTitledBorder("Job/Title"));
        JobField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobFieldActionPerformed(evt);
            }
        });

        Item1Field.setBorder(javax.swing.BorderFactory.createTitledBorder("Item 1"));

        Item2Field.setBorder(javax.swing.BorderFactory.createTitledBorder("Item 2"));

        Item3Field.setBorder(javax.swing.BorderFactory.createTitledBorder("Item 3"));

        QuoteField.setText("\"There are more things in heaven and earth, Horatio, than are dreamt of in your philosophy.\"");
        QuoteField.setBorder(javax.swing.BorderFactory.createTitledBorder("Long Quote"));

        NameHexField.setText("#FFFFFF");
        NameHexField.setBorder(javax.swing.BorderFactory.createTitledBorder("Name Color (Hex code!)"));

        QuoteHexField.setText("#FFFFFF");
        QuoteHexField.setBorder(javax.swing.BorderFactory.createTitledBorder("Quote Color (Hex code!)"));
        QuoteHexField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuoteHexFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(NameHexField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QuoteHexField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(QuoteField, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NameField, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(Item1Field))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JobField)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Item2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Item3Field)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JobField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Item1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Item2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Item3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuoteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameHexField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuoteHexField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GenerateButton.setText("Generate");
        GenerateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateButtonActionPerformed(evt);
            }
        });

        RandomizeButton.setText("Randomize");
        RandomizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandomizeButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        CodeHereField.setColumns(20);
        CodeHereField.setRows(5);
        jScrollPane2.setViewportView(CodeHereField);

        jLabel1.setText("Made by VolatileMatter #160158 on FlightRising");

        jButton1.setText("Random Colors");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(GenerateButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RandomizeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExitButton))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)))
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenerateButton)
                    .addComponent(RandomizeButton)
                    .addComponent(ExitButton)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JobFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JobFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JobFieldActionPerformed

    private void GenerateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateButtonActionPerformed
        // TODO add your handling code here:
        current.setName(NameField.getText());
        current.setJob(JobField.getText());
        current.setItem1(Item1Field.getText());
        current.setItem2(Item2Field.getText());
        current.setItem3(Item3Field.getText());
        current.setQuote(QuoteField.getText());
        current.setNamehex(NameHexField.getText());
        current.setQuotehex(QuoteHexField.getText());        
        
        CodeHereField.setText(current.calc());
    }//GEN-LAST:event_GenerateButtonActionPerformed

    private void RandomizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RandomizeButtonActionPerformed
        // TODO add your handling code here:
        current.genName();
        current.genJob();
        current.genFam();
        current.genMats();
        
        Item1Field.setText(current.getItem1());
        Item2Field.setText(current.getItem2());
        Item3Field.setText(current.getItem3());
        JobField.setText(current.getJob());
        NameField.setText(current.getName());
    }//GEN-LAST:event_RandomizeButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void QuoteHexFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuoteHexFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuoteHexFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        current.genColors();
        
        NameHexField.setText(current.getNamehex());
        QuoteHexField.setText(current.getQuotehex());
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CodeHereField;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton GenerateButton;
    private javax.swing.JTextField Item1Field;
    private javax.swing.JTextField Item2Field;
    private javax.swing.JTextField Item3Field;
    private javax.swing.JTextField JobField;
    private javax.swing.JTextField NameField;
    private javax.swing.JTextField NameHexField;
    private javax.swing.JTextField QuoteField;
    private javax.swing.JTextField QuoteHexField;
    private javax.swing.JButton RandomizeButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

class bio { 
    static String name = "Noot";
    public static void setName(String a){name=a;}
    public static String getName(){return name;}
    
    static String job = "Unemployed";
    public static String getJob() {return job;}
    public static void setJob(String a) {job=a;}
    
    static String item1 = "";
    public static String getItem1() {return item1;}
    public static void setItem1(String a) {item1=a;}
    
    static String item2 = "";
    public static String getItem2() {return item2;}
    public static void setItem2(String a) {item2=a;}
    
    static String item3 = "";
    public static String getItem3() {return item3;}
    public static void setItem3(String a) {item3=a;}
    
    static String quote = "";
    public static String getQuote() {return quote;}
    public static void setQuote(String a) {quote=a;}
    
    static String namehex = "FFFFFF";
    public static String getNamehex() {return namehex;}
    public static void setNamehex(String a) {namehex=a;}

    static String quotehex = "";
    public static String getQuotehex() {return quotehex;}
    public static void setQuotehex(String a) {quotehex=a;}
    
    public void genName() {
  String[] prefix = {"anti","auto","de","dis","down","extra","hyper","il","im","in","ir","inter","mega","mid","mis","non","over","out","post","pre","pro","re","semi","sub","sub","super","tele","trans","ultra","un","under","up"};
  String[] firCon = {"t", "n", "s", "r", "d", "f", "c", "b", "z"};
  String[] secCon = {"r", "h", "s","v"};
  String[] firVow = {"e", "a", "i", "o", "oo", "u"};
  String[] thiCon = {"t", "v", "w", "x", "ck", "g", "p", "ch", "sh","ph","rr",};
  String[] secVow = {"e", "i", "o","a","u"}; 
  String[] fouCon = {"r", "s", "y","de","x","ra","le",};
  String[] suffix = {"iode","able","ac","acity","ocity","ade","age","aholic","oholic","al","algia","an","ian","ance","ant","ar","ard","arian","arium","orium","ary","ation","ate","ative","cide","cracy","crat","cule","cy","cycle","dom","dox","ed","ee","ectomy","eer","emia","en","ence","ency","ent","er","ern","escence","ese","esque","ess","est","etic","ette","ful","fy","gam","gamy","gon","gonic","hood","ial","ian","iasis","iatric","ible","ic","ical","ile","ily","ine","ing","ion","ious","ish","ism","ist","ite","itis","ity","ive","ization","ize","less","let","like","ling","loger","logist","log","ly","ment","ness","oid","ology","oma","onym","opia","opsy","or","ory","osis","ostomy","otomy","ous","path","pathy","phile","phobia","phone","phyte","plegia","plegic","pnea","scopy","scope","scribe","script","sect","ship","sion","some","sophy","sophic","th","tion","tome","tomy","tude","trophy","tude","ty","ular","uous","ure","ward","ware","wise"};
  int numnum = (int)(Math.random() * 100000);  
  String result = " ";         
        //start with the prefix
        if(Math.random() < .5) {
            result += prefix[(int)(Math.random() * prefix.length)];
        }
        
        //then the first consonant
        if(Math.random() < .7) {
            result += firCon[(int)(Math.random() * firCon.length)];
        }
        
        //then the possible second consonant
        if(Math.random() < .4) {
            result += secCon[(int)(Math.random() * secCon.length)];
        }
        
        //then the first vowel
        if(Math.random() < .9) {
            result += firVow[(int)(Math.random() * firVow.length)];
        }
        
        //then the third consonant
        if(Math.random() < .8) {
            result += thiCon[(int)(Math.random() * thiCon.length)];
        }
        
        //then the second vowel
        if(Math.random() < .6) {
            result += secVow[(int)(Math.random() * secVow.length)];
        }
        
        //then the fourth consonant
        if(Math.random() < .5) {
            result += fouCon[(int)(Math.random() * fouCon.length)];
        }
        
        //possibly another vowel?
        if(Math.random() < .5) {
            result += secVow[(int)(Math.random() * secVow.length)];
        }
        
        //then the suffix
        if (Math.random() < .5) {
            result += suffix[(int)(Math.random() * suffix.length)];
        }
        
        //if it's short, then maybe repeat it. (Seg -> Segseg)
        if (Math.random() < .7 && (result.length() < 6)) {
        result += result.substring(1,result.length());
        }
        
        //lastly, capitalize the first letter.
        String temp1 = result.substring(1,2);
        String temp2 = result.substring(2,result.length());
        temp1 = temp1.toUpperCase();
        result = temp1 + temp2;
        
        //if it's too long, delete it. 
        if (result.length() > 9) {
             result = result.substring(0,8);
        }  
name = result;       
    }
    public void genJob() {
     String[] jobs = {"Warrior","Paladin","Wizard","Shopkeeper","Courier","Archaeologist","Scribe","Imagineer","Priest","Gardener","Scribne","Messenger","Blacksmith","Metallurgist","Dancer","Scout","Familiar Caretaker","Beast Master","Fisher","hunter","Healer","Nurse","Guard","Scientist",
                           "Lawyer","Professional Appraiser","Potter","Alchemist","Mercenary","Accountant","Magician","Oracle","Seer","Night Watchman","Serial Killer","Potion Master","Aerial Scout","Artist","Spell Weaver","Hatchling Sitter","Forager","Cook","Beekeeper","Farmer","Jeweler","Seamstress",
                           "Tailor","Weaver","Mason","Writer","Carpenter","Peacemaker","Diplomat","Healer","Spy","Vault Guard","Historian","Scholar","Philosopher","Undertaker","Scryer","Matchmaker","Cartographer","Logger","Astronomer","Pirate","Botanist","Mechanic","Dentist","Nanny","Exalter",
                            "Gamekeeper","Baker","Barber","Hairdresser","Explorer","Cooper","Brewster","Butcher","Maid","Housekeeper","Tracker","Innkeeper","Cheesemaker","Aviary keeper","Silk-Worm Keeper","Spider Keeper","Shepherd","Miner","Lair Construction Crew","Leather Worker","Tanner",
                            "Potter","Spinner","Dyer","Archardist","Tree-keeper","Paper Maker","Candlemaker","Glass Blower","Kite-Maker","Brewmaster","Wine Master","Herbalist","Caravan Leader","Messenger","Exotic Dancer","Gladiator","Electrician","Engineer","Mechanic","Translator","Playwright",
                            "Composer","Trader","Chemist","Illusionist","Bard","Luthier","Actor","Embroiderer","Farrier","Haberdasher","Soap Maker","Conman","Pickpocket","Apothecary","Kennel Master","Ward Crafter","Nest Sitter","Festival Keeper","Anarchist","Bandit","Cavelier","Daredevil","Espionage",
                             "Ninja","Poacher","Knight","Musketeer","Pillager","Samurai","Savager","Seafarer","Master-At-Arms","Slayer","Viking","Ranger","Rogue","Stalker","Theif","Trapper","Zealot","Archmage","Bishop","Conjuerer","Invoker","Jinx","Lich","Mage","Magi","Mediator","Monk","Mystic",
                            "Necromancer","Occultist","Saint","Sorcerer","Sprite","Summoner","Trickster","Warlock","Wizard","Witch","Cleric","Doctor","Druid","Herbalist","Purifier","Sage","Shaman","Surgeon","Sylph","Witch Doctor","Bouncer","Lookout","Mafioso","Consigliere","Warden","Apiarist","Arborist",
                           "Collector","Deepsea Diver","Excavator","Fisher","Fletcher","Florist","Fungiculturalist","Gatherer","Gravedigger","Harvester","Hoarder","Hobbyist","Reaper","Scavenger","Adviser","Archivist","Coach","Courtier","Educator","Teacher","Librarian","Mentor","Pedagogue","Proctor",
                            "Professor","Reporter","Storyteller","Savant","Trainer","Locksmith","Woodcarver"};
      int num = (int)(Math.random()*jobs.length);
      job = jobs[num];
  } 
    public void genFam() {
    String[] fams = {"Abyss Striker", "Amaranth Moth", "Ancient Fungus", "Arcane Sprite", "Autumn Dryad", "Baku", "Bamboo Phytocat", "Banded Owlcat", "Basilisk", "Black Dwarf Unicorn", "Black Iron Creeper", "Black Wolf", "Black-Wing Hummingbird", "Blacktalon Striker", "Blackwing Croaker", "Blooming Strangler", "Blue Dragon Reef Snail", "Blue Tang Hippogriff", "Bluefin Charger", "Bluemoon Aviar", "Blueridge Greatshell", "Bone Fiend", "Boolean", "Bramble Guardian", "Brilliant Psywurm", "Brown River Flight", "Brush Dodo", "Bucktooth Digger", "Bumble", "Candycane Xolo", "Cardinal Hippogriff", "Carmine Serthis", "Celestial Antelope", "Centaur Archer", "Charcoal Sprangyroo", "Chimera", "Chocolate Ferret", "Citrine Cave Jewel", "Cloud Chaser", "Clouddancer", "Clown Charger", "Coarsefur Yeti", "Cockatrice", "Cog Frog", "Colorburst Buttersnake", "Common Podid", "Construction Mith", "Coppercoil Creeper", "Coral Carpenter", "Corpse Cleaner", "Corundum Chameleon", "Cragbacked Bouldursa", "Crimson Emperor", "Crimson Reef Snail", "Crowned Bonepriest", "Cumulus Seal", "Cursed Bat", "Dappled Dunhoof", "Dappled Seal", "Dark-Tufted Sparrowmouse", "Darktouched Chimera", "Death Seeker", "Death's-Head Stag", "Dodo", "Double-Tailed Warcat", "Downy Fox Rat", "Dream Eater", "Driftwood Baron", "Dryad", "Dunhoof Ambassador", "Dwarf Truffle", "Dwarf Unicorn", "Earth Sprite", "Ectoplasmime", "Elk", "Ember Mouse", "Emerald Cave Jewel", "Emerald Webwing", "Ethereal Trickster", "Everglade Lasher", "Fallout Streak", "Fawn Fox Rat", "Fire Sprite", "Fluted Pukasloth", "Frost Delver", "Frostbite Hummingbird", "Fuiran", "Fungalhoof Qiriq", "Fungusbearing Phony", "Gale Wolf", "Gaseous Megashrimp", "Glossy Duskrat", "Glowing Pocket Mouse", "Golden Bantam Fangar", "Golden Idol", "Golden Porpoise", "GoldThroated Sparrow", "Granite Thresher", "Grasslands Trunker", "Graveyard Guardian", "Greater Sandstrike", "Greatshell", "Greenroot Janustrap", "Grey River Flight", "Hainu", "Harvest Floracat", "Hati", "Heartred Croaker", "Hedgehog", "Hibernal Starbear", "Hippogriff", "Hippojay", "Hoarfrost Mauler", "Hooded Dodo", "Hydra Scorpion", "Ice Sprite", "Iridescent Scaleback", "Irradiated Astronomer", "Jadecarved Decoy", "Janustrap", "Jawlocker", "Jeweled Octoflyer", "Kelp Tender", "Lavaborne Hoax", "Leafy Moth", "Light Sprite", "Lightning Sprite", "Livewire Grizzly", "Longneck Interloper", "Longneck Magi", "Longneck Mender", "Longneck Skirmisher", "Luna Mith", "Magma Embear", "Mammertee", "Maned Cobra", "Maned Rasa", "Mantarune", "Manticore", "Marbled Jester", "Maren Ambusher", "Maren Scout", "Maren Warrior", "Maren Wavesinger", "Masked Harpy", "Melprin", "Mesacliff Harpy", "Mimic Buttersnake", "Mistral Minion", "Mistwatch Shellion", "Mock Firebird", "Moordwelling Trunker", "Mottled Buttersnake", "Nature Sprite", "Nephrite Chameleon", "Nightsky Fuiran", "Nochnyr", "Noggle", "Octoflyer", "Opheodrys Serthis", "Painted Centaur", "Parasitic Fungus", "Peacock Firebird", "Peacock Scorpion", "Perching Java Sparrow", "Permafrost Impaler", "Plague Sprite", "Poisonous Toridae", "Polarfreeze Defender", "Poultrygeist", "Psywurm", "Radioactive Slime", "Ragamouse", "Rainbow Sprite", "Rambra", "Raptorik Warrior", "Red-Breasted Hainu", "Red-Footed Akirbeak", "Red-Winged Owlcat", "Relic Eel", "Renegade Aviar", "River Muck", "Rivermouth Flatbill", "Roundhorn Melprin", "Ruby Webwing", "Runic Bat", "Sakura Owl", "Salve Kamaitachi", "Scaleback", "Scarlet Flycatcher", "Scrapmetal Tracker", "Scythe Kamaitachi", "Sentinel Mith", "Serthis Alchemist", "Serthis Potionmaster", "Shadow Serpent", "Shadow Sprite", "Shale Thresher", "Shalebuck", "Shattered Serpent", "Shellion", "Shimmering Xolo", "Sickle Kamaitachi", "Silver Ferret", "Silver Springbok", "Skittering Megashrimp", "Skoll", "Skycat", "Slumbering Charlatan", "Smoke Gyre", "Smoky Bantam Fangar", "Snarling Mimic", "Snow Streak", "Snowfall Elk", "Snowsquall Floracat", "Southmarsh Podid", "Speedy", "Spellbound Golem", "Spined Cobra", "Spinel Vulstal", "Spotted Pukasloth", "Sprangyroo", "Squall Rasa", "Steam Gyre", "Steelhound", "Stone Borer", "Stonewatch Harpy", "Storm Seeker", "Strangler", "Sunbeam Ursa", "Sundial Imposter", "Sunset Lasher", "Sunspot Clouddancer", "Swallowtail Buttersnake", "Swift Lumen", "Swift Volt", "Tengu", "Tourmaline Vulstal", "Trick of the Light", "Tuxedo Floracat", "Umberhorn Qiriq", "Umbra Wolf", "Velvet Floracat", "Venerable Shalebuck", "Venomous Toridae", "Voltspire Intruder", "Warcat Protector", "Water Sprite", "Wave Sweeper", "Wildwood Owl", "Wind Sprite", "Windcarve Harpy", "Winter Wolf", "Wintermane Bowman", "Wintermane Spearman", "Woodland Turkey", "Yellow-Throated Sparrowmouse", "Zeeba"};
    int num = (int)(Math.random()*fams.length);
    item1 = fams[num];  
  }
    public void genMats(){
      String[] mats = {"Clay Fertility Statue", "Stone Fertility Statue", "Intact Clay Relief", "Intact Stone Relief", "Sanded Ash Plank", "Sanded Birch Plank", "Sanded Cedar Plank", "Sanded Pine Plank", "Intact Parchment", "Tattered Parchment", "Mangled Textile", "MothEaten Rug", "Cracked Leather", "Crumbling Leather", "Moldy Leather", "Rotting Leather", "Bronze Fabric Scrap", "Faded Blue Fabric", "Red Linen Fabric Scrap", "White Linen Fabric Scrap", "Ragged Skirmisher Scrap", "Tattered Interloper Scrap", "Broken Pottery Piece", "Shattered Ceramic Shard", "Rippling Cloth", "Seeker Broach", "Waterskin", "Tracker Engine", "Black Iron Segment", "Lumen Wiring", "Mistral Glove", "Sentinel Armor", "Fancy SilverPlated Buckle", "Iron Belt Buckle", "Rusted Iron Belt Buckle", "Wavespun Cloth", "Seeker Orb", "Toridae Chew Toy", "Volt Wiring", "Construction Armor", "Coppercoil Segment", "Spellbound Glove", "Steelhound Core", "Rusted Chain", "Arcane Runestone", "Earth Runestone", "Fire Runestone", "Ice Runestone", "Light Runestone", "Lightning Runestone", "Nature Runestone", "Plague Runestone", "Shadow Runestone", "Water Runestone", "Wind Runestone", "Ancestral Incense", "Borer Scrapmetal", "Delver Parts", "Dried Cedar Branch", "Fir Branch", "Pine Branch", "Driftwood Branch", "Ash Twigs", "Birch Twigs", "Redwood Kindling", "Ice Crystal", "Chipped Blackened Legbones", "Small Legbones", "Cracked Blackened Ribcage", "Small Ribcage", "Bone Fragments", "Chimera Fangs", "Sparrow Skull", "Squirrel Skull", "Oozing Tusk", "Slimy Tusk", "Broken Wing Bones", "Wing Bones", "Etched Tusk", "Fractured Tusk", "Ivory Tusk", "Warbeast Tusk", "Firestarter", "Glowing Pocket Bauble", "Moonglow Foxtail", "Wispy Foxtail", "Crackled Scales", "Bluestreaked Shell", "Common Podid Claws", "Elk Pelt", "Fragile Antler", "Shalebuck Horn", "Sickle Claws", "Diaphanous Wing", "Jeweled Octoflyer Beak", "Octoflyer Beak", "Twitching Leg Bones", "Unnatural Leg Bones", "Janustrap Root", "Strangling Root", "Ancient Fungus Spore", "Dwarf Truffle Spores", "Maple Leaf", "Red Maple Leaf", "Cursed Tuft of Fur", "Runed Tuft of Fur", "Fallout Streak Pinion", "Snow Streak Pinion", "Clouddancer Hide", "Sunspot Clouddancer Hide", "Beeswax", "Carpenter Wax", "Baku Tusk", "Dreameater Tusk", "Strangling Vine", "Sakura Moss", "Wildwood Moss", "Cedar Logs", "Fir Logs", "Pine Logs", "Driftwood Log", "Ash Logs", "Birch Logs", "Redwood Log", "Bonewood Log", "Bonewood Branch", "Bamboo Cluster", "Bamboo Shoot", "Fuiran Hide", "Nightsky Fuiran Hide", "Celestial Horn", "Silver Horn", "Molted Scales", "Muckbottom Shell", "Southmarsh Podid Claws", "Snowfall Elk Pelt", "Windstroked Silk Whitetail", "Reflective Fish Scales", "Tiny Feathers", "Blooming Vine", "Decorated Turtle Shell", "Painted Turtle Shell", "Turtle Shell", "Bonepriest Venom", "Shining Feather Cluster", "Jar of Slime", "Unstable Serthis Concoction", "Small Chunk of Granite", "Lithe Otter Pelt", "Webbed Paw", "Coarse Tail Hair", "Small Block of Granite", "Perfect Skipping Stone", "Skipping Stone", "Round Pebbles", "Smooth Pebbles", "Coal", "Traprock", "Dark Basalt", "Grey Basalt", "Clay", "Obsidian", "Shale", "Copper Ore", "Iron Ore", "Nickel Ore", "Cobalt Ore", "Lead Ore", "Tin Ore", "Rich Copper Ore", "Rich Iron Ore", "Rich Nickel Ore", "Gravel", "Salt", "Sand", "Gypsum", "Rosy Gypsum", "Fool's Gold", "Infused Crystal", "Hematite", "Blue Quartz", "Crystal Quartz", "Rose Quartz", "Smoky Quartz", "Frozen Rock Flow", "Igneous Flow", "Volcanic Remnants", "Magnetite", "Banded Sardonyx", "Jade", "Jasper", "Labradorite", "Silver Ore", "Brilliant Feather Cluster", "Gold Ore", "Banded Olivine", "Platinum Ore", "Banded Ironstone", "Depleted Sacridite", "Impure Sacridite", "Sacridite", "Granite Fragment"};
     int num = (int)(Math.random()*mats.length);
    item2 = mats[num];
    num = (int)(Math.random()*mats.length);
    item3 = mats[num];
      }
    public void genColors(){
          final char [] hex = { '0', '1', '2', '3', '4', '5', '6', '7',
                          '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
          String temp = "#";
          int num = (int)(Math.random()*16);
          temp += hex[num];
          while (temp.length() < 7) {
              num = (int)(Math.random()*16);
              temp+=hex[num];
          }
          namehex = temp.toUpperCase();
          temp = "#";
          while (temp.length() < 7) {
              num = (int)(Math.random()*16);
              temp+=hex[num];
          }
          quotehex = temp.toUpperCase();
          
      }
    
    public String calc(){
        String biotxt = "";
        biotxt+= "[center][size=7][font=Century Gothic][color="+namehex+"]"+name+"[/color][/font][/size]\n" +
"[size=3][color="+quotehex+"]"+job+"[/color][/size]\n" +
"[/center]\n" +
"\n" +
"[columns][item="+item1+"]\n" +
"[item="+item2+"]\n" +
"[item="+item3+"] [nextcol]\n" +
"\n" +
"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas elementum sagittis cursus. Morbi aliquam id nisl non bibendum. Nulla neque nibh, posuere et imperdiet sed, fermentum ac quam. Proin quis sollicitudin enim, quis tincidunt massa. Sed laoreet arcu lacus, tincidunt semper dui posuere et. Quisque nibh enim, mattis vel massa in, aliquet semper lectus. Quisque arcu turpis, lobortis in odio consectetur, congue eleifend eros. \n" +
"\n" +
"Pellentesque vehicula ultrices vestibulum. Curabitur ac interdum est, quis pretium mi. Phasellus vestibulum dictum ligula, sed ultricies libero ornare a. Sed mattis bibendum leo. Donec vitae porta diam.[/columns]\n" +
"\n" +
"[right][sup][font=Century Gothic][size=4][i][color="+quotehex+"]"+quote+"[/i][/sup][/size][/font][/color][/right]";
        
        
        return biotxt;
    }
}