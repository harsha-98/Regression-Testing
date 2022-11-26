
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test01"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    AVLTree.Node node16 = aVLTree0.getRoot();
    AVLTree.Node node17 = aVLTree0.getRoot();
    aVLTree0.delete(1);
    AVLTree.Node node20 = aVLTree0.getRoot();
    AVLTree.Node node22 = aVLTree0.find((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test02"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)1);
    AVLTree.Node node16 = aVLTree0.find((-1));
    aVLTree0.delete(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test03"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree aVLTree3 = new AVLTree();
    AVLTree.Node node4 = null;
    int i5 = aVLTree3.getBalance(node4);
    AVLTree.Node node7 = aVLTree3.find((int)'4');
    aVLTree3.insert(0);
    AVLTree.Node node10 = aVLTree3.getRoot();
    int i11 = aVLTree0.getBalance(node10);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    AVLTree.Node node16 = aVLTree12.find((int)'4');
    aVLTree12.insert(0);
    AVLTree.Node node19 = aVLTree12.getRoot();
    AVLTree.Node node20 = aVLTree12.getRoot();
    int i21 = aVLTree0.getBalance(node20);
    aVLTree0.insert(1);
    AVLTree.Node node25 = aVLTree0.find((int)'#');
    AVLTree.Node node27 = aVLTree0.find((int)(short)1);
    aVLTree0.delete((int)(short)100);
    AVLTree.Node node31 = aVLTree0.find((int)(byte)10);
    AVLTree.Node node33 = aVLTree0.find((int)(byte)10);
    aVLTree0.insert((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node33);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test04"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    AVLTree aVLTree8 = new AVLTree();
    AVLTree.Node node9 = null;
    int i10 = aVLTree8.getBalance(node9);
    AVLTree.Node node12 = aVLTree8.find((int)'4');
    aVLTree8.insert(0);
    aVLTree8.insert((int)(byte)10);
    AVLTree.Node node18 = aVLTree8.find((int)(short)1);
    AVLTree.Node node19 = aVLTree8.getRoot();
    int i20 = aVLTree0.getBalance(node19);
    int i21 = aVLTree0.height();
    aVLTree0.delete(0);
    AVLTree.Node node25 = aVLTree0.find(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test05"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    AVLTree.Node node6 = aVLTree0.getRoot();
    AVLTree.Node node7 = aVLTree0.getRoot();
    aVLTree0.delete((int)(short)-1);
    aVLTree0.delete((int)'a');
    AVLTree.Node node13 = aVLTree0.find(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test06"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    int i8 = aVLTree0.height();
    aVLTree0.delete((int)(short)1);
    int i11 = aVLTree0.height();
    aVLTree0.delete((int)(byte)0);
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node17 = aVLTree0.find(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test07"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree10.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete((int)(short)10);
    aVLTree0.delete(100);
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    AVLTree.Node node31 = aVLTree27.find((int)'4');
    aVLTree27.insert(0);
    aVLTree27.insert((int)(byte)10);
    AVLTree.Node node36 = aVLTree27.getRoot();
    int i37 = aVLTree0.getBalance(node36);
    int i38 = aVLTree0.height();
    aVLTree0.delete((int)(short)1);
    AVLTree aVLTree41 = new AVLTree();
    AVLTree.Node node42 = null;
    int i43 = aVLTree41.getBalance(node42);
    AVLTree.Node node45 = aVLTree41.find((int)'4');
    aVLTree41.insert(0);
    AVLTree.Node node48 = aVLTree41.getRoot();
    AVLTree.Node node49 = aVLTree41.getRoot();
    int i50 = aVLTree0.getBalance(node49);
    int i51 = aVLTree0.height();
    AVLTree aVLTree52 = new AVLTree();
    AVLTree.Node node53 = null;
    int i54 = aVLTree52.getBalance(node53);
    aVLTree52.insert(0);
    int i57 = aVLTree52.height();
    aVLTree52.delete((int)(byte)-1);
    AVLTree aVLTree60 = new AVLTree();
    AVLTree.Node node61 = null;
    int i62 = aVLTree60.getBalance(node61);
    AVLTree.Node node64 = aVLTree60.find((int)'4');
    aVLTree60.insert(0);
    AVLTree.Node node67 = aVLTree60.getRoot();
    int i68 = aVLTree52.getBalance(node67);
    AVLTree.Node node70 = aVLTree52.find((int)(short)0);
    int i71 = aVLTree0.getBalance(node70);
    AVLTree.Node node72 = aVLTree0.getRoot();
    AVLTree.Node node73 = aVLTree0.getRoot();
    int i74 = aVLTree0.height();
    aVLTree0.delete(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test08"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    int i25 = aVLTree0.height();
    aVLTree0.insert((int)'#');
    AVLTree.Node node29 = aVLTree0.find((int)' ');
    aVLTree0.delete((int)(byte)0);
    aVLTree0.delete(1);
    int i34 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test09"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    AVLTree.Node node16 = aVLTree0.getRoot();
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree aVLTree20 = new AVLTree();
    AVLTree.Node node21 = null;
    int i22 = aVLTree20.getBalance(node21);
    AVLTree.Node node24 = aVLTree20.find((int)'4');
    aVLTree20.insert(0);
    AVLTree.Node node27 = aVLTree20.getRoot();
    int i28 = aVLTree17.getBalance(node27);
    AVLTree aVLTree29 = new AVLTree();
    AVLTree.Node node30 = null;
    int i31 = aVLTree29.getBalance(node30);
    AVLTree.Node node33 = aVLTree29.find((int)'4');
    aVLTree29.insert(0);
    AVLTree.Node node36 = aVLTree29.getRoot();
    AVLTree.Node node37 = aVLTree29.getRoot();
    int i38 = aVLTree17.getBalance(node37);
    aVLTree17.insert(1);
    aVLTree17.delete((int)(short)-1);
    AVLTree aVLTree43 = new AVLTree();
    AVLTree.Node node44 = null;
    int i45 = aVLTree43.getBalance(node44);
    AVLTree.Node node47 = aVLTree43.find((int)'4');
    aVLTree43.insert(0);
    AVLTree.Node node50 = aVLTree43.getRoot();
    AVLTree.Node node51 = aVLTree43.getRoot();
    int i52 = aVLTree43.height();
    AVLTree.Node node53 = aVLTree43.getRoot();
    AVLTree.Node node54 = aVLTree43.getRoot();
    int i55 = aVLTree17.getBalance(node54);
    int i56 = aVLTree0.getBalance(node54);
    aVLTree0.insert((int)'a');
    AVLTree aVLTree59 = new AVLTree();
    aVLTree59.insert(0);
    AVLTree.Node node63 = aVLTree59.find((int)(short)-1);
    AVLTree aVLTree64 = new AVLTree();
    AVLTree.Node node65 = null;
    int i66 = aVLTree64.getBalance(node65);
    AVLTree aVLTree67 = new AVLTree();
    AVLTree.Node node68 = null;
    int i69 = aVLTree67.getBalance(node68);
    AVLTree.Node node71 = aVLTree67.find((int)'4');
    aVLTree67.insert(0);
    AVLTree.Node node74 = aVLTree67.getRoot();
    int i75 = aVLTree64.getBalance(node74);
    int i76 = aVLTree59.getBalance(node74);
    int i77 = aVLTree0.getBalance(node74);
    int i78 = aVLTree0.height();
    AVLTree.Node node80 = aVLTree0.find(1);
    AVLTree.Node node82 = aVLTree0.find(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node82);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test10"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node3 = null;
    int i4 = aVLTree0.getBalance(node3);
    aVLTree0.delete((int)(byte)0);
    aVLTree0.delete((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test11"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)' ');
    AVLTree.Node node13 = aVLTree0.find((int)(short)1);
    int i14 = aVLTree0.height();
    aVLTree0.delete((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test12"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node10 = aVLTree0.find((int)(short)1);
    AVLTree.Node node12 = aVLTree0.find((int)(byte)100);
    int i13 = aVLTree0.height();
    AVLTree.Node node14 = aVLTree0.getRoot();
    AVLTree.Node node15 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test13"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    aVLTree0.insert((int)(byte)1);
    int i11 = aVLTree0.height();
    AVLTree.Node node13 = aVLTree0.find((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test14"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    aVLTree0.delete((int)'4');
    aVLTree0.delete((int)' ');
    AVLTree.Node node30 = aVLTree0.find((int)(byte)0);
    AVLTree aVLTree31 = new AVLTree();
    AVLTree.Node node32 = null;
    int i33 = aVLTree31.getBalance(node32);
    AVLTree.Node node35 = aVLTree31.find((int)'4');
    aVLTree31.insert(0);
    int i38 = aVLTree31.height();
    AVLTree.Node node40 = aVLTree31.find((int)(short)-1);
    aVLTree31.insert((int)(short)1);
    AVLTree.Node node43 = aVLTree31.getRoot();
    aVLTree31.delete((int)(byte)0);
    aVLTree31.delete((int)(short)10);
    int i48 = aVLTree31.height();
    AVLTree aVLTree49 = new AVLTree();
    AVLTree.Node node50 = null;
    int i51 = aVLTree49.getBalance(node50);
    AVLTree.Node node53 = aVLTree49.find((int)'4');
    aVLTree49.insert(0);
    int i56 = aVLTree49.height();
    AVLTree.Node node58 = aVLTree49.find((int)(short)-1);
    aVLTree49.insert((int)(short)1);
    AVLTree.Node node61 = aVLTree49.getRoot();
    aVLTree49.delete((int)(byte)0);
    aVLTree49.delete((int)(short)10);
    int i66 = aVLTree49.height();
    AVLTree.Node node68 = aVLTree49.find(1);
    int i69 = aVLTree31.getBalance(node68);
    int i70 = aVLTree0.getBalance(node68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test15"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    aVLTree25.insert(0);
    AVLTree.Node node30 = aVLTree25.getRoot();
    AVLTree.Node node31 = aVLTree25.getRoot();
    int i32 = aVLTree0.getBalance(node31);
    aVLTree0.insert((int)(short)10);
    AVLTree.Node node35 = aVLTree0.getRoot();
    AVLTree.Node node37 = aVLTree0.find((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test16"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    int i10 = aVLTree0.height();
    aVLTree0.insert((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    aVLTree0.delete((int)' ');
    aVLTree0.delete(1);
    int i19 = aVLTree0.height();
    AVLTree aVLTree20 = new AVLTree();
    aVLTree20.insert(0);
    AVLTree.Node node24 = aVLTree20.find(100);
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    aVLTree25.insert(0);
    int i30 = aVLTree25.height();
    aVLTree25.delete((int)(byte)-1);
    AVLTree aVLTree33 = new AVLTree();
    AVLTree.Node node34 = null;
    int i35 = aVLTree33.getBalance(node34);
    AVLTree.Node node37 = aVLTree33.find((int)'4');
    aVLTree33.insert(0);
    AVLTree.Node node40 = aVLTree33.getRoot();
    int i41 = aVLTree25.getBalance(node40);
    int i42 = aVLTree20.getBalance(node40);
    aVLTree20.insert((int)(short)-1);
    aVLTree20.delete((int)'4');
    aVLTree20.delete((int)' ');
    AVLTree.Node node50 = aVLTree20.find((int)(byte)0);
    int i51 = aVLTree0.getBalance(node50);
    int i52 = aVLTree0.height();
    aVLTree0.insert((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test17"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node10 = aVLTree0.find((int)(short)1);
    AVLTree.Node node12 = aVLTree0.find((int)(byte)100);
    AVLTree.Node node13 = aVLTree0.getRoot();
    AVLTree.Node node15 = aVLTree0.find((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test18"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node8 = aVLTree0.getRoot();
    AVLTree aVLTree9 = new AVLTree();
    aVLTree9.insert(0);
    AVLTree.Node node13 = aVLTree9.find(100);
    AVLTree aVLTree14 = new AVLTree();
    AVLTree.Node node15 = null;
    int i16 = aVLTree14.getBalance(node15);
    aVLTree14.insert(0);
    int i19 = aVLTree14.height();
    aVLTree14.delete((int)(byte)-1);
    AVLTree aVLTree22 = new AVLTree();
    AVLTree.Node node23 = null;
    int i24 = aVLTree22.getBalance(node23);
    AVLTree.Node node26 = aVLTree22.find((int)'4');
    aVLTree22.insert(0);
    AVLTree.Node node29 = aVLTree22.getRoot();
    int i30 = aVLTree14.getBalance(node29);
    int i31 = aVLTree9.getBalance(node29);
    aVLTree9.insert((int)(short)-1);
    AVLTree.Node node35 = aVLTree9.find(10);
    aVLTree9.insert((int)' ');
    AVLTree aVLTree38 = new AVLTree();
    AVLTree.Node node39 = null;
    int i40 = aVLTree38.getBalance(node39);
    AVLTree.Node node42 = aVLTree38.find((int)'4');
    aVLTree38.insert(0);
    AVLTree.Node node45 = aVLTree38.getRoot();
    AVLTree.Node node46 = aVLTree38.getRoot();
    int i47 = aVLTree9.getBalance(node46);
    int i48 = aVLTree0.getBalance(node46);
    aVLTree0.delete((int)(byte)1);
    AVLTree.Node node52 = aVLTree0.find((int)(byte)1);
    AVLTree.Node node53 = aVLTree0.getRoot();
    aVLTree0.delete((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);

  }

}
