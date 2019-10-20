//
//// Compiled from CommPortIdentifier.java (version 1.3 : 47.0, super bit)
//public class gnu.io.CommPortIdentifier {
//  
//  // Field descriptor #73 I
//  public static final int PORT_SERIAL = 1;
//  
//  // Field descriptor #73 I
//  public static final int PORT_PARALLEL = 2;
//  
//  // Field descriptor #73 I
//  public static final int PORT_I2C = 3;
//  
//  // Field descriptor #73 I
//  public static final int PORT_RS485 = 4;
//  
//  // Field descriptor #73 I
//  public static final int PORT_RAW = 5;
//  
//  // Field descriptor #85 Ljava/lang/String;
//  private java.lang.String PortName;
//  
//  // Field descriptor #87 Z
//  private boolean Available;
//  
//  // Field descriptor #85 Ljava/lang/String;
//  private java.lang.String Owner;
//  
//  // Field descriptor #90 Lgnu/io/CommPort;
//  private gnu.io.CommPort commport;
//  
//  // Field descriptor #92 Lgnu/io/CommDriver;
//  private gnu.io.CommDriver RXTXDriver;
//  
//  // Field descriptor #94 Lgnu/io/CommPortIdentifier;
//  static gnu.io.CommPortIdentifier CommPortIndex;
//  
//  // Field descriptor #94 Lgnu/io/CommPortIdentifier;
//  gnu.io.CommPortIdentifier next;
//  
//  // Field descriptor #73 I
//  private int PortType;
//  
//  // Field descriptor #87 Z
//  private static final boolean debug = false;
//  
//  // Field descriptor #100 Ljava/lang/Object;
//  static java.lang.Object Sync;
//  
//  // Field descriptor #102 Ljava/util/Vector;
//  java.util.Vector ownershipListener;
//  
//  // Field descriptor #87 Z
//  private boolean HideOwnerEvents;
//  
//  // Method descriptor #105 (Ljava/lang/String;Lgnu/io/CommPort;ILgnu/io/CommDriver;)V
//  // Stack: 2, Locals: 5
//  CommPortIdentifier(java.lang.String arg0, gnu.io.CommPort arg1, int arg2, gnu.io.CommDriver arg3);
//     0  aload_0 [this]
//     1  invokespecial java.lang.Object() [1]
//     4  aload_0 [this]
//     5  iconst_1
//     6  putfield gnu.io.CommPortIdentifier.Available : boolean [2]
//     9  aload_0 [this]
//    10  aload_1 [arg0]
//    11  putfield gnu.io.CommPortIdentifier.PortName : java.lang.String [3]
//    14  aload_0 [this]
//    15  aload_2 [arg1]
//    16  putfield gnu.io.CommPortIdentifier.commport : gnu.io.CommPort [4]
//    19  aload_0 [this]
//    20  iload_3 [arg2]
//    21  putfield gnu.io.CommPortIdentifier.PortType : int [5]
//    24  aload_0 [this]
//    25  aconst_null
//    26  putfield gnu.io.CommPortIdentifier.next : gnu.io.CommPortIdentifier [6]
//    29  aload_0 [this]
//    30  aload 4 [arg3]
//    32  putfield gnu.io.CommPortIdentifier.RXTXDriver : gnu.io.CommDriver [7]
//    35  return
//      Line numbers:
//        [pc: 0, line: 126]
//        [pc: 4, line: 79]
//        [pc: 9, line: 127]
//        [pc: 14, line: 128]
//        [pc: 19, line: 129]
//        [pc: 24, line: 130]
//        [pc: 29, line: 131]
//        [pc: 35, line: 133]
//  
//  // Method descriptor #109 (Ljava/lang/String;ILgnu/io/CommDriver;)V
//  // Stack: 6, Locals: 3
//  public static void addPortName(java.lang.String arg0, int arg1, gnu.io.CommDriver arg2);
//     0  new gnu.io.CommPortIdentifier [8]
//     3  dup
//     4  aload_0 [arg0]
//     5  aconst_null
//     6  iload_1 [arg1]
//     7  aload_2 [arg2]
//     8  invokespecial gnu.io.CommPortIdentifier(java.lang.String, gnu.io.CommPort, int, gnu.io.CommDriver) [9]
//    11  invokestatic gnu.io.CommPortIdentifier.AddIdentifierToList(gnu.io.CommPortIdentifier) : void [10]
//    14  return
//      Line numbers:
//        [pc: 0, line: 148]
//        [pc: 14, line: 149]
//  
//  // Method descriptor #111 (Lgnu/io/CommPortIdentifier;)V
//  // Stack: 2, Locals: 4
//  private static void AddIdentifierToList(gnu.io.CommPortIdentifier arg0);
//     0  getstatic gnu.io.CommPortIdentifier.Sync : java.lang.Object [11]
//     3  dup
//     4  astore_1
//     5  monitorenter
//     6  getstatic gnu.io.CommPortIdentifier.CommPortIndex : gnu.io.CommPortIdentifier [12]
//     9  ifnonnull 19
//    12  aload_0 [arg0]
//    13  putstatic gnu.io.CommPortIdentifier.CommPortIndex : gnu.io.CommPortIdentifier [12]
//    16  goto 43
//    19  getstatic gnu.io.CommPortIdentifier.CommPortIndex : gnu.io.CommPortIdentifier [12]
//    22  astore_2
//    23  aload_2
//    24  getfield gnu.io.CommPortIdentifier.next : gnu.io.CommPortIdentifier [6]
//    27  ifnull 38
//    30  aload_2
//    31  getfield gnu.io.CommPortIdentifier.next : gnu.io.CommPortIdentifier [6]
//    34  astore_2
//    35  goto 23
//    38  aload_2
//    39  aload_0 [arg0]
//    40  putfield gnu.io.CommPortIdentifier.next : gnu.io.CommPortIdentifier [6]
//    43  aload_1
//    44  monitorexit
//    45  goto 53
//    48  astore_3
//    49  aload_1
//    50  monitorexit
//    51  aload_3
//    52  athrow
//    53  return
//      Exception Table:
//        [pc: 6, pc: 45] -> 48 when : any
//        [pc: 48, pc: 51] -> 48 when : any
//      Line numbers:
//        [pc: 0, line: 161]
//        [pc: 6, line: 163]
//        [pc: 12, line: 165]
//        [pc: 19, line: 170]
//        [pc: 23, line: 171]
//        [pc: 30, line: 173]
//        [pc: 38, line: 176]
//        [pc: 43, line: 178]
//        [pc: 53, line: 179]
//  
//  // Method descriptor #113 (Lgnu/io/CommPortOwnershipListener;)V
//  // Stack: 3, Locals: 2
//  public void addPortOwnershipListener(gnu.io.CommPortOwnershipListener arg0);
//     0  aload_0 [this]
//     1  getfield gnu.io.CommPortIdentifier.ownershipListener : java.util.Vector [13]
//     4  ifnonnull 18
//     7  aload_0 [this]
//     8  new java.util.Vector [14]
//    11  dup
//    12  invokespecial java.util.Vector() [15]
//    15  putfield gnu.io.CommPortIdentifier.ownershipListener : java.util.Vector [13]
//    18  aload_0 [this]
//    19  getfield gnu.io.CommPortIdentifier.ownershipListener : java.util.Vector [13]
//    22  aload_1 [arg0]
//    23  invokevirtual java.util.Vector.contains(java.lang.Object) : boolean [16]
//    26  ifne 37
//    29  aload_0 [this]
//    30  getfield gnu.io.CommPortIdentifier.ownershipListener : java.util.Vector [13]
//    33  aload_1 [arg0]
//    34  invokevirtual java.util.Vector.addElement(java.lang.Object) : void [17]
//    37  return
//      Line numbers:
//        [pc: 0, line: 194]
//        [pc: 7, line: 196]
//        [pc: 18, line: 201]
//        [pc: 29, line: 203]
//        [pc: 37, line: 205]
//  
//  // Method descriptor #115 ()Ljava/lang/String;
//  // Stack: 1, Locals: 1
//  public java.lang.String getCurrentOwner();
//    0  aload_0 [this]
//    1  getfield gnu.io.CommPortIdentifier.Owner : java.lang.String [18]
//    4  areturn
//      Line numbers:
//        [pc: 0, line: 217]
//  
//  // Method descriptor #115 ()Ljava/lang/String;
//  // Stack: 1, Locals: 1
//  public java.lang.String getName();
//    0  aload_0 [this]
//    1  getfield gnu.io.CommPortIdentifier.PortName : java.lang.String [3]
//    4  areturn
//      Line numbers:
//        [pc: 0, line: 230]
//  
//  // Method descriptor #118 (Ljava/lang/String;)Lgnu/io/CommPortIdentifier;
//  // Stack: 2, Locals: 4
//  public static gnu.io.CommPortIdentifier getPortIdentifier(java.lang.String arg0) throws gnu.io.NoSuchPortException;
//     0  getstatic gnu.io.CommPortIdentifier.Sync : java.lang.Object [11]
//     3  dup
//     4  astore_2
//     5  monitorenter
//     6  getstatic gnu.io.CommPortIdentifier.CommPortIndex : gnu.io.CommPortIdentifier [12]
//     9  astore_1
//    10  aload_1
//    11  ifnull 33
//    14  aload_1
//    15  getfield gnu.io.CommPortIdentifier.PortName : java.lang.String [3]
//    18  aload_0 [arg0]
//    19  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [19]
//    22  ifne 33
//    25  aload_1
//    26  getfield gnu.io.CommPortIdentifier.next : gnu.io.CommPortIdentifier [6]
//    29  astore_1
//    30  goto 10
//    33  aload_1
//    34  ifnonnull 68
//    37  invokestatic gnu.io.CommPortIdentifier.getPortIdentifiers() : java.util.Enumeration [20]
//    40  pop
//    41  getstatic gnu.io.CommPortIdentifier.CommPortIndex : gnu.io.CommPortIdentifier [12]
//    44  astore_1
//    45  aload_1
//    46  ifnull 68
//    49  aload_1
//    50  getfield gnu.io.CommPortIdentifier.PortName : java.lang.String [3]
//    53  aload_0 [arg0]
//    54  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [19]
//    57  ifne 68
//    60  aload_1
//    61  getfield gnu.io.CommPortIdentifier.next : gnu.io.CommPortIdentifier [6]
//    64  astore_1
//    65  goto 45
//    68  aload_2
//    69  monitorexit
//    70  goto 78
//    73  astore_3
//    74  aload_2
//    75  monitorexit
//    76  aload_3
//    77  athrow
//    78  aload_1
//    79  ifnull 84
//    82  aload_1
//    83  areturn
//    84  new gnu.io.NoSuchPortException [21]
//    87  dup
//    88  invokespecial gnu.io.NoSuchPortException() [22]
//    91  athrow
//      Exception Table:
//        [pc: 6, pc: 70] -> 73 when : any
//        [pc: 73, pc: 76] -> 73 when : any
//      Line numbers:
//        [pc: 0, line: 245]
//        [pc: 6, line: 247]
//        [pc: 10, line: 248]
//        [pc: 25, line: 249]
//        [pc: 33, line: 251]
//        [pc: 37, line: 257]
//        [pc: 41, line: 258]
//        [pc: 45, line: 259]
//        [pc: 60, line: 260]
//        [pc: 68, line: 263]
//        [pc: 78, line: 264]
//        [pc: 84, line: 269]
//  
//  // Method descriptor #120 (Lgnu/io/CommPort;)Lgnu/io/CommPortIdentifier;
//  // Stack: 2, Locals: 4
//  public static gnu.io.CommPortIdentifier getPortIdentifier(gnu.io.CommPort arg0) throws gnu.io.NoSuchPortException;
//     0  getstatic gnu.io.CommPortIdentifier.Sync : java.lang.Object [11]
//     3  dup
//     4  astore_2
//     5  monitorenter
//     6  getstatic gnu.io.CommPortIdentifier.CommPortIndex : gnu.io.CommPortIdentifier [12]
//     9  astore_1
//    10  aload_1
//    11  ifnull 30
//    14  aload_1
//    15  getfield gnu.io.CommPortIdentifier.commport : gnu.io.CommPort [4]
//    18  aload_0 [arg0]
//    19  if_acmpeq 30
//    22  aload_1
//    23  getfield gnu.io.CommPortIdentifier.next : gnu.io.CommPortIdentifier [6]
//    26  astore_1
//    27  goto 10
//    30  aload_2
//    31  monitorexit
//    32  goto 40
//    35  astore_3
//    36  aload_2
//    37  monitorexit
//    38  aload_3
//    39  athrow
//    40  aload_1
//    41  ifnull 46
//    44  aload_1
//    45  areturn
//    46  new gnu.io.NoSuchPortException [21]
//    49  dup
//    50  invokespecial gnu.io.NoSuchPortException() [22]
//    53  athrow
//      Exception Table:
//        [pc: 6, pc: 32] -> 35 when : any
//        [pc: 35, pc: 38] -> 35 when : any
//      Line numbers:
//        [pc: 0, line: 285]
//        [pc: 6, line: 287]
//        [pc: 10, line: 288]
//        [pc: 22, line: 289]
//        [pc: 30, line: 290]
//        [pc: 40, line: 291]
//        [pc: 44, line: 292]
//        [pc: 46, line: 296]
//  
//  // Method descriptor #122 ()Ljava/util/Enumeration;
//  // Stack: 3, Locals: 8
//  public static java.util.Enumeration getPortIdentifiers();
//      0  getstatic gnu.io.CommPortIdentifier.Sync : java.lang.Object [11]
//      3  dup
//      4  astore_0
//      5  monitorenter
//      6  new java.util.HashMap [23]
//      9  dup
//     10  invokespecial java.util.HashMap() [24]
//     13  astore_1
//     14  getstatic gnu.io.CommPortIdentifier.CommPortIndex : gnu.io.CommPortIdentifier [12]
//     17  astore_2
//     18  aload_2
//     19  ifnull 40
//     22  aload_1
//     23  aload_2
//     24  getfield gnu.io.CommPortIdentifier.PortName : java.lang.String [3]
//     27  aload_2
//     28  invokevirtual java.util.HashMap.put(java.lang.Object, java.lang.Object) : java.lang.Object [25]
//     31  pop
//     32  aload_2
//     33  getfield gnu.io.CommPortIdentifier.next : gnu.io.CommPortIdentifier [6]
//     36  astore_2
//     37  goto 18
//     40  aconst_null
//     41  putstatic gnu.io.CommPortIdentifier.CommPortIndex : gnu.io.CommPortIdentifier [12]
//     44  ldc <String "gnu.io.RXTXCommDriver"> [26]
//     46  invokestatic java.lang.Class.forName(java.lang.String) : java.lang.Class [27]
//     49  invokevirtual java.lang.Class.newInstance() : java.lang.Object [28]
//     52  checkcast gnu.io.CommDriver [29]
//     55  astore_3
//     56  aload_3
//     57  invokeinterface gnu.io.CommDriver.initialize() : void [30] [nargs: 1]
//     62  getstatic gnu.io.CommPortIdentifier.CommPortIndex : gnu.io.CommPortIdentifier [12]
//     65  astore 4
//     67  aconst_null
//     68  astore 5
//     70  aload 4
//     72  ifnull 168
//     75  aload_1
//     76  aload 4
//     78  getfield gnu.io.CommPortIdentifier.PortName : java.lang.String [3]
//     81  invokevirtual java.util.HashMap.get(java.lang.Object) : java.lang.Object [31]
//     84  checkcast gnu.io.CommPortIdentifier [8]
//     87  astore 6
//     89  aload 6
//     91  ifnull 154
//     94  aload 6
//     96  getfield gnu.io.CommPortIdentifier.PortType : int [5]
//     99  aload 4
//    101  getfield gnu.io.CommPortIdentifier.PortType : int [5]
//    104  if_icmpne 154
//    107  aload 6
//    109  aload 4
//    111  getfield gnu.io.CommPortIdentifier.RXTXDriver : gnu.io.CommDriver [7]
//    114  putfield gnu.io.CommPortIdentifier.RXTXDriver : gnu.io.CommDriver [7]
//    117  aload 6
//    119  aload 4
//    121  getfield gnu.io.CommPortIdentifier.next : gnu.io.CommPortIdentifier [6]
//    124  putfield gnu.io.CommPortIdentifier.next : gnu.io.CommPortIdentifier [6]
//    127  aload 5
//    129  ifnonnull 140
//    132  aload 6
//    134  putstatic gnu.io.CommPortIdentifier.CommPortIndex : gnu.io.CommPortIdentifier [12]
//    137  goto 147
//    140  aload 5
//    142  aload 6
//    144  putfield gnu.io.CommPortIdentifier.next : gnu.io.CommPortIdentifier [6]
//    147  aload 6
//    149  astore 5
//    151  goto 158
//    154  aload 4
//    156  astore 5
//    158  aload 4
//    160  getfield gnu.io.CommPortIdentifier.next : gnu.io.CommPortIdentifier [6]
//    163  astore 4
//    165  goto 70
//    168  goto 208
//    171  astore_3
//    172  getstatic java.lang.System.err : java.io.PrintStream [33]
//    175  new java.lang.StringBuffer [34]
//    178  dup
//    179  invokespecial java.lang.StringBuffer() [35]
//    182  aload_3
//    183  invokevirtual java.lang.StringBuffer.append(java.lang.Object) : java.lang.StringBuffer [36]
//    186  ldc <String " thrown while loading "> [37]
//    188  invokevirtual java.lang.StringBuffer.append(java.lang.String) : java.lang.StringBuffer [38]
//    191  ldc <String "gnu.io.RXTXCommDriver"> [26]
//    193  invokevirtual java.lang.StringBuffer.append(java.lang.String) : java.lang.StringBuffer [38]
//    196  invokevirtual java.lang.StringBuffer.toString() : java.lang.String [39]
//    199  invokevirtual java.io.PrintStream.println(java.lang.String) : void [40]
//    202  getstatic java.lang.System.err : java.io.PrintStream [33]
//    205  invokevirtual java.io.PrintStream.flush() : void [41]
//    208  aload_0
//    209  monitorexit
//    210  goto 220
//    213  astore 7
//    215  aload_0
//    216  monitorexit
//    217  aload 7
//    219  athrow
//    220  new gnu.io.CommPortEnumerator [42]
//    223  dup
//    224  invokespecial gnu.io.CommPortEnumerator() [43]
//    227  areturn
//      Exception Table:
//        [pc: 44, pc: 168] -> 171 when : java.lang.Throwable
//        [pc: 6, pc: 210] -> 213 when : any
//        [pc: 213, pc: 217] -> 213 when : any
//      Line numbers:
//        [pc: 0, line: 311]
//        [pc: 6, line: 313]
//        [pc: 14, line: 314]
//        [pc: 18, line: 315]
//        [pc: 22, line: 316]
//        [pc: 32, line: 317]
//        [pc: 40, line: 319]
//        [pc: 44, line: 326]
//        [pc: 56, line: 327]
//        [pc: 62, line: 331]
//        [pc: 67, line: 332]
//        [pc: 70, line: 333]
//        [pc: 75, line: 334]
//        [pc: 89, line: 335]
//        [pc: 107, line: 337]
//        [pc: 117, line: 338]
//        [pc: 127, line: 339]
//        [pc: 132, line: 340]
//        [pc: 140, line: 342]
//        [pc: 147, line: 344]
//        [pc: 154, line: 346]
//        [pc: 158, line: 348]
//        [pc: 165, line: 349]
//        [pc: 168, line: 355]
//        [pc: 171, line: 351]
//        [pc: 172, line: 353]
//        [pc: 202, line: 354]
//        [pc: 208, line: 356]
//        [pc: 220, line: 357]
//  
//  // Method descriptor #124 ()I
//  // Stack: 1, Locals: 1
//  public int getPortType();
//    0  aload_0 [this]
//    1  getfield gnu.io.CommPortIdentifier.PortType : int [5]
//    4  ireturn
//      Line numbers:
//        [pc: 0, line: 370]
//  
//  // Method descriptor #126 ()Z
//  // Stack: 1, Locals: 1
//  public synchronized boolean isCurrentlyOwned();
//     0  aload_0 [this]
//     1  getfield gnu.io.CommPortIdentifier.Available : boolean [2]
//     4  ifne 11
//     7  iconst_1
//     8  goto 12
//    11  iconst_0
//    12  ireturn
//      Line numbers:
//        [pc: 0, line: 383]
//  
//  // Method descriptor #128 (Ljava/io/FileDescriptor;)Lgnu/io/CommPort;
//  // Stack: 2, Locals: 2
//  public synchronized gnu.io.CommPort open(java.io.FileDescriptor arg0) throws gnu.io.UnsupportedCommOperationException;
//    0  new gnu.io.UnsupportedCommOperationException [44]
//    3  dup
//    4  invokespecial gnu.io.UnsupportedCommOperationException() [45]
//    7  athrow
//      Line numbers:
//        [pc: 0, line: 396]
//  
//  // Method descriptor #130 (Ljava/lang/String;)Ljava/lang/String;
//  private native java.lang.String native_psmisc_report_owner(java.lang.String arg0);
//  
//  // Method descriptor #131 (Ljava/lang/String;I)Lgnu/io/CommPort;
//  // Stack: 5, Locals: 15
//  public gnu.io.CommPort open(java.lang.String arg0, int arg1) throws gnu.io.PortInUseException;
//      0  aload_0 [this]
//      1  dup
//      2  astore 4
//      4  monitorenter
//      5  aload_0 [this]
//      6  getfield gnu.io.CommPortIdentifier.Available : boolean [2]
//      9  istore_3
//     10  iload_3
//     11  ifeq 24
//     14  aload_0 [this]
//     15  iconst_0
//     16  putfield gnu.io.CommPortIdentifier.Available : boolean [2]
//     19  aload_0 [this]
//     20  aload_1 [arg0]
//     21  putfield gnu.io.CommPortIdentifier.Owner : java.lang.String [18]
//     24  aload 4
//     26  monitorexit
//     27  goto 38
//     30  astore 5
//     32  aload 4
//     34  monitorexit
//     35  aload 5
//     37  athrow
//     38  iload_3
//     39  ifne 135
//     42  invokestatic java.lang.System.currentTimeMillis() : long [46]
//     45  iload_2 [arg1]
//     46  i2l
//     47  ladd
//     48  lstore 4
//     50  aload_0 [this]
//     51  iconst_3
//     52  invokevirtual gnu.io.CommPortIdentifier.fireOwnershipEvent(int) : void [47]
//     55  aload_0 [this]
//     56  dup
//     57  astore 8
//     59  monitorenter
//     60  aload_0 [this]
//     61  getfield gnu.io.CommPortIdentifier.Available : boolean [2]
//     64  ifne 102
//     67  invokestatic java.lang.System.currentTimeMillis() : long [46]
//     70  dup2
//     71  lstore 6
//     73  lload 4
//     75  lcmp
//     76  ifge 102
//     79  aload_0 [this]
//     80  lload 4
//     82  lload 6
//     84  lsub
//     85  invokevirtual java.lang.Object.wait(long) : void [48]
//     88  goto 60
//     91  astore 9
//     93  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [50]
//     96  invokevirtual java.lang.Thread.interrupt() : void [51]
//     99  goto 102
//    102  aload_0 [this]
//    103  getfield gnu.io.CommPortIdentifier.Available : boolean [2]
//    106  istore_3
//    107  iload_3
//    108  ifeq 121
//    111  aload_0 [this]
//    112  iconst_0
//    113  putfield gnu.io.CommPortIdentifier.Available : boolean [2]
//    116  aload_0 [this]
//    117  aload_1 [arg0]
//    118  putfield gnu.io.CommPortIdentifier.Owner : java.lang.String [18]
//    121  aload 8
//    123  monitorexit
//    124  goto 135
//    127  astore 10
//    129  aload 8
//    131  monitorexit
//    132  aload 10
//    134  athrow
//    135  iload_3
//    136  ifne 151
//    139  new gnu.io.PortInUseException [52]
//    142  dup
//    143  aload_0 [this]
//    144  invokevirtual gnu.io.CommPortIdentifier.getCurrentOwner() : java.lang.String [53]
//    147  invokespecial gnu.io.PortInUseException(java.lang.String) [54]
//    150  athrow
//    151  aload_0 [this]
//    152  getfield gnu.io.CommPortIdentifier.commport : gnu.io.CommPort [4]
//    155  ifnonnull 179
//    158  aload_0 [this]
//    159  aload_0 [this]
//    160  getfield gnu.io.CommPortIdentifier.RXTXDriver : gnu.io.CommDriver [7]
//    163  aload_0 [this]
//    164  getfield gnu.io.CommPortIdentifier.PortName : java.lang.String [3]
//    167  aload_0 [this]
//    168  getfield gnu.io.CommPortIdentifier.PortType : int [5]
//    171  invokeinterface gnu.io.CommDriver.getCommPort(java.lang.String, int) : gnu.io.CommPort [55] [nargs: 3]
//    176  putfield gnu.io.CommPortIdentifier.commport : gnu.io.CommPort [4]
//    179  aload_0 [this]
//    180  getfield gnu.io.CommPortIdentifier.commport : gnu.io.CommPort [4]
//    183  ifnull 236
//    186  aload_0 [this]
//    187  iconst_1
//    188  invokevirtual gnu.io.CommPortIdentifier.fireOwnershipEvent(int) : void [47]
//    191  aload_0 [this]
//    192  getfield gnu.io.CommPortIdentifier.commport : gnu.io.CommPort [4]
//    195  astore 4
//    197  aload_0 [this]
//    198  getfield gnu.io.CommPortIdentifier.commport : gnu.io.CommPort [4]
//    201  ifnonnull 233
//    204  aload_0 [this]
//    205  dup
//    206  astore 5
//    208  monitorenter
//    209  aload_0 [this]
//    210  iconst_1
//    211  putfield gnu.io.CommPortIdentifier.Available : boolean [2]
//    214  aload_0 [this]
//    215  aconst_null
//    216  putfield gnu.io.CommPortIdentifier.Owner : java.lang.String [18]
//    219  aload 5
//    221  monitorexit
//    222  goto 233
//    225  astore 11
//    227  aload 5
//    229  monitorexit
//    230  aload 11
//    232  athrow
//    233  aload 4
//    235  areturn
//    236  new gnu.io.PortInUseException [52]
//    239  dup
//    240  aload_0 [this]
//    241  aload_0 [this]
//    242  getfield gnu.io.CommPortIdentifier.PortName : java.lang.String [3]
//    245  invokespecial gnu.io.CommPortIdentifier.native_psmisc_report_owner(java.lang.String) : java.lang.String [56]
//    248  invokespecial gnu.io.PortInUseException(java.lang.String) [54]
//    251  athrow
//    252  astore 12
//    254  aload_0 [this]
//    255  getfield gnu.io.CommPortIdentifier.commport : gnu.io.CommPort [4]
//    258  ifnonnull 290
//    261  aload_0 [this]
//    262  dup
//    263  astore 13
//    265  monitorenter
//    266  aload_0 [this]
//    267  iconst_1
//    268  putfield gnu.io.CommPortIdentifier.Available : boolean [2]
//    271  aload_0 [this]
//    272  aconst_null
//    273  putfield gnu.io.CommPortIdentifier.Owner : java.lang.String [18]
//    276  aload 13
//    278  monitorexit
//    279  goto 290
//    282  astore 14
//    284  aload 13
//    286  monitorexit
//    287  aload 14
//    289  athrow
//    290  aload 12
//    292  athrow
//      Exception Table:
//        [pc: 5, pc: 27] -> 30 when : any
//        [pc: 30, pc: 35] -> 30 when : any
//        [pc: 79, pc: 88] -> 91 when : java.lang.InterruptedException
//        [pc: 60, pc: 124] -> 127 when : any
//        [pc: 127, pc: 132] -> 127 when : any
//        [pc: 209, pc: 222] -> 225 when : any
//        [pc: 225, pc: 230] -> 225 when : any
//        [pc: 151, pc: 197] -> 252 when : any
//        [pc: 266, pc: 279] -> 282 when : any
//        [pc: 282, pc: 287] -> 282 when : any
//        [pc: 236, pc: 254] -> 252 when : any
//      Line numbers:
//        [pc: 0, line: 416]
//        [pc: 5, line: 417]
//        [pc: 10, line: 418]
//        [pc: 14, line: 420]
//        [pc: 19, line: 421]
//        [pc: 24, line: 423]
//        [pc: 38, line: 424]
//        [pc: 42, line: 426]
//        [pc: 50, line: 428]
//        [pc: 55, line: 430]
//        [pc: 60, line: 431]
//        [pc: 79, line: 434]
//        [pc: 88, line: 440]
//        [pc: 91, line: 436]
//        [pc: 93, line: 438]
//        [pc: 99, line: 439]
//        [pc: 102, line: 442]
//        [pc: 107, line: 443]
//        [pc: 111, line: 445]
//        [pc: 116, line: 446]
//        [pc: 121, line: 448]
//        [pc: 135, line: 450]
//        [pc: 139, line: 452]
//        [pc: 151, line: 456]
//        [pc: 158, line: 458]
//        [pc: 179, line: 460]
//        [pc: 186, line: 462]
//        [pc: 191, line: 463]
//        [pc: 197, line: 471]
//        [pc: 204, line: 473]
//        [pc: 209, line: 474]
//        [pc: 214, line: 475]
//        [pc: 219, line: 476]
//        [pc: 236, line: 467]
//        [pc: 252, line: 471]
//        [pc: 261, line: 473]
//        [pc: 266, line: 474]
//        [pc: 271, line: 475]
//        [pc: 276, line: 476]
//  
//  // Method descriptor #113 (Lgnu/io/CommPortOwnershipListener;)V
//  // Stack: 2, Locals: 2
//  public void removePortOwnershipListener(gnu.io.CommPortOwnershipListener arg0);
//     0  aload_0 [this]
//     1  getfield gnu.io.CommPortIdentifier.ownershipListener : java.util.Vector [13]
//     4  ifnull 16
//     7  aload_0 [this]
//     8  getfield gnu.io.CommPortIdentifier.ownershipListener : java.util.Vector [13]
//    11  aload_1 [arg0]
//    12  invokevirtual java.util.Vector.removeElement(java.lang.Object) : boolean [57]
//    15  pop
//    16  return
//      Line numbers:
//        [pc: 0, line: 492]
//        [pc: 7, line: 493]
//        [pc: 16, line: 494]
//  
//  // Method descriptor #134 ()V
//  // Stack: 2, Locals: 3
//  void internalClosePort();
//     0  aload_0 [this]
//     1  dup
//     2  astore_1
//     3  monitorenter
//     4  aload_0 [this]
//     5  aconst_null
//     6  putfield gnu.io.CommPortIdentifier.Owner : java.lang.String [18]
//     9  aload_0 [this]
//    10  iconst_1
//    11  putfield gnu.io.CommPortIdentifier.Available : boolean [2]
//    14  aload_0 [this]
//    15  aconst_null
//    16  putfield gnu.io.CommPortIdentifier.commport : gnu.io.CommPort [4]
//    19  aload_0 [this]
//    20  invokevirtual java.lang.Object.notifyAll() : void [58]
//    23  aload_1
//    24  monitorexit
//    25  goto 33
//    28  astore_2
//    29  aload_1
//    30  monitorexit
//    31  aload_2
//    32  athrow
//    33  aload_0 [this]
//    34  iconst_2
//    35  invokevirtual gnu.io.CommPortIdentifier.fireOwnershipEvent(int) : void [47]
//    38  return
//      Exception Table:
//        [pc: 4, pc: 25] -> 28 when : any
//        [pc: 28, pc: 31] -> 28 when : any
//      Line numbers:
//        [pc: 0, line: 506]
//        [pc: 4, line: 508]
//        [pc: 9, line: 509]
//        [pc: 14, line: 510]
//        [pc: 19, line: 512]
//        [pc: 23, line: 513]
//        [pc: 33, line: 514]
//        [pc: 38, line: 515]
//  
//  // Method descriptor #136 (I)V
//  // Stack: 2, Locals: 4
//  void fireOwnershipEvent(int arg0);
//     0  aload_0 [this]
//     1  getfield gnu.io.CommPortIdentifier.ownershipListener : java.util.Vector [13]
//     4  ifnull 44
//     7  aload_0 [this]
//     8  getfield gnu.io.CommPortIdentifier.ownershipListener : java.util.Vector [13]
//    11  invokevirtual java.util.Vector.elements() : java.util.Enumeration [59]
//    14  astore_3
//    15  aload_3
//    16  invokeinterface java.util.Enumeration.hasMoreElements() : boolean [60] [nargs: 1]
//    21  ifeq 44
//    24  aload_3
//    25  invokeinterface java.util.Enumeration.nextElement() : java.lang.Object [61] [nargs: 1]
//    30  checkcast gnu.io.CommPortOwnershipListener [62]
//    33  astore_2
//    34  aload_2
//    35  iload_1 [arg0]
//    36  invokeinterface gnu.io.CommPortOwnershipListener.ownershipChange(int) : void [63] [nargs: 2]
//    41  goto 15
//    44  return
//      Line numbers:
//        [pc: 0, line: 527]
//        [pc: 7, line: 530]
//        [pc: 15, line: 531]
//        [pc: 24, line: 533]
//        [pc: 34, line: 532]
//        [pc: 44, line: 535]
//  
//  // Method descriptor #134 ()V
//  // Stack: 3, Locals: 1
//  static {};
//     0  new java.lang.Object [64]
//     3  dup
//     4  invokespecial java.lang.Object() [1]
//     7  putstatic gnu.io.CommPortIdentifier.Sync : java.lang.Object [11]
//    10  ldc <String "gnu.io.RXTXCommDriver"> [26]
//    12  invokestatic java.lang.Class.forName(java.lang.String) : java.lang.Class [27]
//    15  invokevirtual java.lang.Class.newInstance() : java.lang.Object [28]
//    18  checkcast gnu.io.CommDriver [29]
//    21  astore_0
//    22  aload_0
//    23  invokeinterface gnu.io.CommDriver.initialize() : void [30] [nargs: 1]
//    28  goto 62
//    31  astore_0
//    32  getstatic java.lang.System.err : java.io.PrintStream [33]
//    35  new java.lang.StringBuffer [34]
//    38  dup
//    39  invokespecial java.lang.StringBuffer() [35]
//    42  aload_0
//    43  invokevirtual java.lang.StringBuffer.append(java.lang.Object) : java.lang.StringBuffer [36]
//    46  ldc <String " thrown while loading "> [37]
//    48  invokevirtual java.lang.StringBuffer.append(java.lang.String) : java.lang.StringBuffer [38]
//    51  ldc <String "gnu.io.RXTXCommDriver"> [26]
//    53  invokevirtual java.lang.StringBuffer.append(java.lang.String) : java.lang.StringBuffer [38]
//    56  invokevirtual java.lang.StringBuffer.toString() : java.lang.String [39]
//    59  invokevirtual java.io.PrintStream.println(java.lang.String) : void [40]
//    62  ldc <String "os.name"> [65]
//    64  invokestatic java.lang.System.getProperty(java.lang.String) : java.lang.String [66]
//    67  astore_0
//    68  aload_0
//    69  invokevirtual java.lang.String.toLowerCase() : java.lang.String [67]
//    72  ldc <String "linux"> [68]
//    74  invokevirtual java.lang.String.indexOf(java.lang.String) : int [69]
//    77  iconst_m1
//    78  if_icmpne 81
//    81  ldc <String "rxtxSerial"> [70]
//    83  invokestatic java.lang.System.loadLibrary(java.lang.String) : void [71]
//    86  return
//      Exception Table:
//        [pc: 10, pc: 28] -> 31 when : java.lang.Throwable
//      Line numbers:
//        [pc: 0, line: 104]
//        [pc: 10, line: 107]
//        [pc: 22, line: 108]
//        [pc: 28, line: 113]
//        [pc: 31, line: 110]
//        [pc: 32, line: 112]
//        [pc: 62, line: 117]
//        [pc: 68, line: 118]
//        [pc: 81, line: 123]
//        [pc: 86, line: 124]
//}
//		 url=new URL(address); //url에 주소를 넣고
//		 conn=(HttpURLConnection)url.openConnection(); //http통신을 통해 웹서버 접속
//		 conn.setRequestMethod(protocol); //안에있는 값들을 
//		 br = new BufferedReader(new InputStreamReader(conn.getInputStream()));// 안에 있는값들을 버퍼리드로 가져온다.
//		 
//		 json = br.readLine();
//		 
//	}
//}
