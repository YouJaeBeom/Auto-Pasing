//// Compiled from InputRecord.java (version 1.8 : 52.0, super bit)
//class sun.security.ssl.InputRecord extends java.io.ByteArrayInputStream implements sun.security.ssl.Record {
//  
//  // Field descriptor #209 Lsun/security/ssl/HandshakeHash;
//  private sun.security.ssl.HandshakeHash handshakeHash;
//  
//  // Field descriptor #62 I
//  private int lastHashed;
//  
//  // Field descriptor #76 Z
//  boolean formatVerified;
//  
//  // Field descriptor #76 Z
//  private boolean isClosed;
//  
//  // Field descriptor #76 Z
//  private boolean appDataValid;
//  
//  // Field descriptor #210 Lsun/security/ssl/ProtocolVersion;
//  private sun.security.ssl.ProtocolVersion helloVersion;
//  
//  // Field descriptor #208 Lsun/security/ssl/Debug;
//  static final sun.security.ssl.Debug debug;
//  
//  // Field descriptor #62 I
//  private int exlen;
//  
//  // Field descriptor #77 [B
//  private byte[] v2Buf;
//  
//  // Field descriptor #77 [B
//  private static final byte[] v2NoCipher;
//  
//  // Method descriptor #35 ()V
//  // Stack: 2, Locals: 1
//  InputRecord();
//     0  aload_0 [this]
//     1  sipush 16921
//     4  newarray byte [8]
//     6  invokespecial java.io.ByteArrayInputStream(byte[]) [327]
//     9  aload_0 [this]
//    10  iconst_1
//    11  putfield sun.security.ssl.InputRecord.formatVerified : boolean [313]
//    14  aload_0 [this]
//    15  getstatic sun.security.ssl.ProtocolVersion.DEFAULT_HELLO : sun.security.ssl.ProtocolVersion [323]
//    18  invokevirtual sun.security.ssl.InputRecord.setHelloVersion(sun.security.ssl.ProtocolVersion) : void [372]
//    21  aload_0 [this]
//    22  iconst_5
//    23  putfield sun.security.ssl.InputRecord.pos : int [311]
//    26  aload_0 [this]
//    27  iconst_5
//    28  putfield sun.security.ssl.InputRecord.count : int [307]
//    31  aload_0 [this]
//    32  aload_0 [this]
//    33  getfield sun.security.ssl.InputRecord.count : int [307]
//    36  putfield sun.security.ssl.InputRecord.lastHashed : int [309]
//    39  aload_0 [this]
//    40  iconst_0
//    41  putfield sun.security.ssl.InputRecord.exlen : int [308]
//    44  aload_0 [this]
//    45  aconst_null
//    46  putfield sun.security.ssl.InputRecord.v2Buf : byte[] [316]
//    49  return
//      Line numbers:
//        [pc: 0, line: 93]
//        [pc: 9, line: 59]
//        [pc: 14, line: 94]
//        [pc: 21, line: 95]
//        [pc: 26, line: 96]
//        [pc: 31, line: 97]
//        [pc: 39, line: 98]
//        [pc: 44, line: 99]
//        [pc: 49, line: 100]
//  
//  // Method descriptor #228 (Lsun/security/ssl/ProtocolVersion;)V
//  // Stack: 2, Locals: 2
//  void setHelloVersion(sun.security.ssl.ProtocolVersion arg0);
//    0  aload_0 [this]
//    1  aload_1 [arg0]
//    2  putfield sun.security.ssl.InputRecord.helloVersion : sun.security.ssl.ProtocolVersion [320]
//    5  return
//      Line numbers:
//        [pc: 0, line: 103]
//        [pc: 5, line: 104]
//  
//  // Method descriptor #226 ()Lsun/security/ssl/ProtocolVersion;
//  // Stack: 1, Locals: 1
//  sun.security.ssl.ProtocolVersion getHelloVersion();
//    0  aload_0 [this]
//    1  getfield sun.security.ssl.InputRecord.helloVersion : sun.security.ssl.ProtocolVersion [320]
//    4  areturn
//      Line numbers:
//        [pc: 0, line: 107]
//  
//  // Method descriptor #35 ()V
//  // Stack: 2, Locals: 1
//  void enableFormatChecks();
//    0  aload_0 [this]
//    1  iconst_0
//    2  putfield sun.security.ssl.InputRecord.formatVerified : boolean [313]
//    5  return
//      Line numbers:
//        [pc: 0, line: 114]
//        [pc: 5, line: 115]
//  
//  // Method descriptor #36 ()Z
//  // Stack: 1, Locals: 1
//  boolean isAppDataValid();
//    0  aload_0 [this]
//    1  getfield sun.security.ssl.InputRecord.appDataValid : boolean [312]
//    4  ireturn
//      Line numbers:
//        [pc: 0, line: 119]
//  
//  // Method descriptor #40 (Z)V
//  // Stack: 2, Locals: 2
//  void setAppDataValid(boolean arg0);
//    0  aload_0 [this]
//    1  iload_1 [arg0]
//    2  putfield sun.security.ssl.InputRecord.appDataValid : boolean [312]
//    5  return
//      Line numbers:
//        [pc: 0, line: 123]
//        [pc: 5, line: 124]
//  
//  // Method descriptor #33 ()B
//  // Stack: 2, Locals: 1
//  byte contentType();
//    0  aload_0 [this]
//    1  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    4  iconst_0
//    5  baload
//    6  ireturn
//      Line numbers:
//        [pc: 0, line: 130]
//  
//  // Method descriptor #222 (Lsun/security/ssl/HandshakeHash;)V
//  // Stack: 2, Locals: 2
//  void setHandshakeHash(sun.security.ssl.HandshakeHash arg0);
//    0  aload_0 [this]
//    1  aload_1 [arg0]
//    2  putfield sun.security.ssl.InputRecord.handshakeHash : sun.security.ssl.HandshakeHash [319]
//    5  return
//      Line numbers:
//        [pc: 0, line: 140]
//        [pc: 5, line: 141]
//  
//  // Method descriptor #221 ()Lsun/security/ssl/HandshakeHash;
//  // Stack: 1, Locals: 1
//  sun.security.ssl.HandshakeHash getHandshakeHash();
//    0  aload_0 [this]
//    1  getfield sun.security.ssl.InputRecord.handshakeHash : sun.security.ssl.HandshakeHash [319]
//    4  areturn
//      Line numbers:
//        [pc: 0, line: 144]
//  
//  // Method descriptor #235 (Lsun/security/ssl/Authenticator;Lsun/security/ssl/CipherBox;)V
//  // Stack: 7, Locals: 10
//  void decrypt(sun.security.ssl.Authenticator arg0, sun.security.ssl.CipherBox arg1) throws javax.crypto.BadPaddingException;
//      0  aconst_null
//      1  astore_3
//      2  aload_1 [arg0]
//      3  instanceof sun.security.ssl.MAC [204]
//      6  ifeq 19
//      9  aload_1 [arg0]
//     10  checkcast sun.security.ssl.MAC [204]
//     13  invokevirtual sun.security.ssl.MAC.MAClen() : int [376]
//     16  goto 20
//     19  iconst_0
//     20  istore 4
//     22  aload_0 [this]
//     23  getfield sun.security.ssl.InputRecord.count : int [307]
//     26  iconst_5
//     27  isub
//     28  istore 5
//     30  aload_2 [arg1]
//     31  invokevirtual sun.security.ssl.CipherBox.isNullCipher() : boolean [355]
//     34  ifne 122
//     37  aload_2 [arg1]
//     38  aload_1 [arg0]
//     39  aload_0 [this]
//     40  invokevirtual sun.security.ssl.InputRecord.contentType() : byte [361]
//     43  aload_0 [this]
//     44  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     47  iconst_5
//     48  iload 5
//     50  invokevirtual sun.security.ssl.CipherBox.applyExplicitNonce(sun.security.ssl.Authenticator, byte, byte[], int, int) : int [357]
//     53  istore 6
//     55  aload_0 [this]
//     56  iconst_5
//     57  iload 6
//     59  iadd
//     60  putfield sun.security.ssl.InputRecord.pos : int [311]
//     63  aload_0 [this]
//     64  aload_0 [this]
//     65  getfield sun.security.ssl.InputRecord.pos : int [311]
//     68  putfield sun.security.ssl.InputRecord.lastHashed : int [309]
//     71  iconst_5
//     72  istore 7
//     74  aload_2 [arg1]
//     75  invokevirtual sun.security.ssl.CipherBox.isAEADMode() : boolean [353]
//     78  ifeq 88
//     81  iload 7
//     83  iload 6
//     85  iadd
//     86  istore 7
//     88  aload_0 [this]
//     89  iload 7
//     91  aload_2 [arg1]
//     92  aload_0 [this]
//     93  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     96  iload 7
//     98  aload_0 [this]
//     99  getfield sun.security.ssl.InputRecord.count : int [307]
//    102  iload 7
//    104  isub
//    105  iload 4
//    107  invokevirtual sun.security.ssl.CipherBox.decrypt(byte[], int, int, int) : int [356]
//    110  iadd
//    111  putfield sun.security.ssl.InputRecord.count : int [307]
//    114  goto 122
//    117  astore 6
//    119  aload 6
//    121  astore_3
//    122  aload_1 [arg0]
//    123  instanceof sun.security.ssl.MAC [204]
//    126  ifeq 296
//    129  iload 4
//    131  ifeq 296
//    134  aload_1 [arg0]
//    135  checkcast sun.security.ssl.MAC [204]
//    138  astore 6
//    140  aload_0 [this]
//    141  getfield sun.security.ssl.InputRecord.count : int [307]
//    144  iload 4
//    146  isub
//    147  istore 7
//    149  iload 7
//    151  aload_0 [this]
//    152  getfield sun.security.ssl.InputRecord.pos : int [311]
//    155  isub
//    156  istore 8
//    158  iload 8
//    160  ifge 192
//    163  aload_3
//    164  ifnonnull 177
//    167  new javax.crypto.BadPaddingException [194]
//    170  dup
//    171  ldc <String "bad record"> [25]
//    173  invokespecial javax.crypto.BadPaddingException(java.lang.String) [346]
//    176  astore_3
//    177  iconst_5
//    178  iload 5
//    180  iadd
//    181  iload 4
//    183  isub
//    184  istore 7
//    186  iload 7
//    188  iconst_5
//    189  isub
//    190  istore 8
//    192  aload_0 [this]
//    193  dup
//    194  getfield sun.security.ssl.InputRecord.count : int [307]
//    197  iload 4
//    199  isub
//    200  putfield sun.security.ssl.InputRecord.count : int [307]
//    203  aload_0 [this]
//    204  invokevirtual sun.security.ssl.InputRecord.contentType() : byte [361]
//    207  aload_0 [this]
//    208  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    211  aload_0 [this]
//    212  getfield sun.security.ssl.InputRecord.pos : int [311]
//    215  iload 8
//    217  aload 6
//    219  iconst_0
//    220  invokestatic sun.security.ssl.InputRecord.checkMacTags(byte, byte[], int, int, sun.security.ssl.MAC, boolean) : boolean [370]
//    223  ifeq 240
//    226  aload_3
//    227  ifnonnull 240
//    230  new javax.crypto.BadPaddingException [194]
//    233  dup
//    234  ldc <String "bad record MAC"> [26]
//    236  invokespecial javax.crypto.BadPaddingException(java.lang.String) [346]
//    239  astore_3
//    240  aload_2 [arg1]
//    241  invokevirtual sun.security.ssl.CipherBox.isCBCMode() : boolean [354]
//    244  ifeq 296
//    247  aload 6
//    249  iload 5
//    251  iload 8
//    253  invokestatic sun.security.ssl.InputRecord.calculateRemainingLen(sun.security.ssl.MAC, int, int) : int [371]
//    256  istore 9
//    258  iload 9
//    260  aload_0 [this]
//    261  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    264  arraylength
//    265  if_icmple 278
//    268  new java.lang.RuntimeException [189]
//    271  dup
//    272  ldc <String "Internal buffer capacity error"> [16]
//    274  invokespecial java.lang.RuntimeException(java.lang.String) [335]
//    277  athrow
//    278  aload_0 [this]
//    279  invokevirtual sun.security.ssl.InputRecord.contentType() : byte [361]
//    282  aload_0 [this]
//    283  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    286  iconst_0
//    287  iload 9
//    289  aload 6
//    291  iconst_1
//    292  invokestatic sun.security.ssl.InputRecord.checkMacTags(byte, byte[], int, int, sun.security.ssl.MAC, boolean) : boolean [370]
//    295  pop
//    296  aload_3
//    297  ifnull 302
//    300  aload_3
//    301  athrow
//    302  return
//      Exception Table:
//        [pc: 37, pc: 114] -> 117 when : javax.crypto.BadPaddingException
//      Line numbers:
//        [pc: 0, line: 149]
//        [pc: 2, line: 150]
//        [pc: 13, line: 151]
//        [pc: 22, line: 152]
//        [pc: 30, line: 154]
//        [pc: 37, line: 157]
//        [pc: 40, line: 158]
//        [pc: 50, line: 157]
//        [pc: 55, line: 159]
//        [pc: 63, line: 160]
//        [pc: 71, line: 163]
//        [pc: 74, line: 164]
//        [pc: 81, line: 166]
//        [pc: 88, line: 171]
//        [pc: 107, line: 172]
//        [pc: 114, line: 185]
//        [pc: 117, line: 175]
//        [pc: 119, line: 184]
//        [pc: 122, line: 190]
//        [pc: 134, line: 191]
//        [pc: 140, line: 192]
//        [pc: 149, line: 193]
//        [pc: 158, line: 198]
//        [pc: 163, line: 200]
//        [pc: 167, line: 201]
//        [pc: 177, line: 205]
//        [pc: 186, line: 206]
//        [pc: 192, line: 209]
//        [pc: 203, line: 216]
//        [pc: 226, line: 218]
//        [pc: 230, line: 219]
//        [pc: 240, line: 227]
//        [pc: 247, line: 228]
//        [pc: 258, line: 236]
//        [pc: 268, line: 238]
//        [pc: 278, line: 246]
//        [pc: 296, line: 251]
//        [pc: 300, line: 252]
//        [pc: 302, line: 254]
//      Stack map table: number of frames 11
//        [pc: 19, append: {javax.crypto.BadPaddingException}]
//        [pc: 20, same_locals_1_stack_item, stack: {int}]
//        [pc: 88, full, stack: {}, locals: {sun.security.ssl.InputRecord, sun.security.ssl.Authenticator, sun.security.ssl.CipherBox, javax.crypto.BadPaddingException, int, int, int, int}]
//        [pc: 117, full, stack: {javax.crypto.BadPaddingException}, locals: {sun.security.ssl.InputRecord, sun.security.ssl.Authenticator, sun.security.ssl.CipherBox, javax.crypto.BadPaddingException, int, int}]
//        [pc: 122, same]
//        [pc: 177, append: {sun.security.ssl.MAC, int, int}]
//        [pc: 192, same]
//        [pc: 240, same]
//        [pc: 278, append: {int}]
//        [pc: 296, full, stack: {}, locals: {sun.security.ssl.InputRecord, sun.security.ssl.Authenticator, sun.security.ssl.CipherBox, javax.crypto.BadPaddingException, int, int}]
//        [pc: 302, same]
//  
//  // Method descriptor #224 (B[BIILsun/security/ssl/MAC;Z)Z
//  // Stack: 6, Locals: 9
//  static boolean checkMacTags(byte arg0, byte[] arg1, int arg2, int arg3, sun.security.ssl.MAC arg4, boolean arg5);
//     0  aload 4 [arg4]
//     2  invokevirtual sun.security.ssl.MAC.MAClen() : int [376]
//     5  istore 6
//     7  aload 4 [arg4]
//     9  iload_0 [arg0]
//    10  aload_1 [arg1]
//    11  iload_2 [arg2]
//    12  iload_3 [arg3]
//    13  iload 5 [arg5]
//    15  invokevirtual sun.security.ssl.MAC.compute(byte, byte[], int, int, boolean) : byte[] [379]
//    18  astore 7
//    20  aload 7
//    22  ifnull 33
//    25  iload 6
//    27  aload 7
//    29  arraylength
//    30  if_icmpeq 43
//    33  new java.lang.RuntimeException [189]
//    36  dup
//    37  ldc <String "Internal MAC error"> [15]
//    39  invokespecial java.lang.RuntimeException(java.lang.String) [335]
//    42  athrow
//    43  aload_1 [arg1]
//    44  iload_2 [arg2]
//    45  iload_3 [arg3]
//    46  iadd
//    47  aload 7
//    49  invokestatic sun.security.ssl.InputRecord.compareMacTags(byte[], int, byte[]) : int[] [366]
//    52  astore 8
//    54  aload 8
//    56  iconst_0
//    57  iaload
//    58  ifeq 65
//    61  iconst_1
//    62  goto 66
//    65  iconst_0
//    66  ireturn
//      Line numbers:
//        [pc: 0, line: 264]
//        [pc: 7, line: 265]
//        [pc: 20, line: 267]
//        [pc: 33, line: 269]
//        [pc: 43, line: 272]
//        [pc: 54, line: 273]
//      Stack map table: number of frames 4
//        [pc: 33, append: {int, byte[]}]
//        [pc: 43, same]
//        [pc: 65, append: {int[]}]
//        [pc: 66, same_locals_1_stack_item, stack: {int}]
//  
//  // Method descriptor #45 ([BI[B)[I
//  // Stack: 4, Locals: 5
//  private static int[] compareMacTags(byte[] arg0, int arg1, byte[] arg2);
//     0  iconst_2
//     1  newarray int [10]
//     3  dup
//     4  iconst_0
//     5  iconst_0
//     6  iastore
//     7  dup
//     8  iconst_1
//     9  iconst_0
//    10  iastore
//    11  astore_3
//    12  iconst_0
//    13  istore 4
//    15  iload 4
//    17  aload_2 [arg2]
//    18  arraylength
//    19  if_icmpge 58
//    22  aload_0 [arg0]
//    23  iload_1 [arg1]
//    24  iload 4
//    26  iadd
//    27  baload
//    28  aload_2 [arg2]
//    29  iload 4
//    31  baload
//    32  if_icmpeq 45
//    35  aload_3
//    36  iconst_0
//    37  dup2
//    38  iaload
//    39  iconst_1
//    40  iadd
//    41  iastore
//    42  goto 52
//    45  aload_3
//    46  iconst_1
//    47  dup2
//    48  iaload
//    49  iconst_1
//    50  iadd
//    51  iastore
//    52  iinc 4 1
//    55  goto 15
//    58  aload_3
//    59  areturn
//      Line numbers:
//        [pc: 0, line: 286]
//        [pc: 12, line: 290]
//        [pc: 22, line: 291]
//        [pc: 35, line: 292]
//        [pc: 45, line: 294]
//        [pc: 52, line: 290]
//        [pc: 58, line: 298]
//      Stack map table: number of frames 4
//        [pc: 15, append: {int[], int}]
//        [pc: 45, same]
//        [pc: 52, same]
//        [pc: 58, chop 1 local(s)]
//  
//  // Method descriptor #225 (Lsun/security/ssl/MAC;II)I
//  // Stack: 9, Locals: 5
//  static int calculateRemainingLen(sun.security.ssl.MAC arg0, int arg1, int arg2);
//     0  aload_0 [arg0]
//     1  invokevirtual sun.security.ssl.MAC.hashBlockLen() : int [377]
//     4  istore_3
//     5  aload_0 [arg0]
//     6  invokevirtual sun.security.ssl.MAC.minimalPaddingLen() : int [378]
//     9  istore 4
//    11  iload_1 [arg1]
//    12  bipush 13
//    14  iload_3
//    15  iload 4
//    17  isub
//    18  isub
//    19  iadd
//    20  istore_1 [arg1]
//    21  iload_2 [arg2]
//    22  bipush 13
//    24  iload_3
//    25  iload 4
//    27  isub
//    28  isub
//    29  iadd
//    30  istore_2 [arg2]
//    31  iconst_1
//    32  iload_1 [arg1]
//    33  i2d
//    34  dconst_1
//    35  iload_3
//    36  i2d
//    37  dmul
//    38  ddiv
//    39  invokestatic java.lang.Math.ceil(double) : double [334]
//    42  iload_2 [arg2]
//    43  i2d
//    44  dconst_1
//    45  iload_3
//    46  i2d
//    47  dmul
//    48  ddiv
//    49  invokestatic java.lang.Math.ceil(double) : double [334]
//    52  dsub
//    53  d2i
//    54  aload_0 [arg0]
//    55  invokevirtual sun.security.ssl.MAC.hashBlockLen() : int [377]
//    58  imul
//    59  iadd
//    60  ireturn
//      Line numbers:
//        [pc: 0, line: 310]
//        [pc: 5, line: 311]
//        [pc: 11, line: 316]
//        [pc: 21, line: 317]
//        [pc: 31, line: 324]
//        [pc: 49, line: 325]
//        [pc: 60, line: 324]
//  
//  // Method descriptor #39 (I)V
//  // Stack: 3, Locals: 2
//  void ignore(int arg0);
//     0  iload_1 [arg0]
//     1  ifle 22
//     4  aload_0 [this]
//     5  dup
//     6  getfield sun.security.ssl.InputRecord.pos : int [311]
//     9  iload_1 [arg0]
//    10  iadd
//    11  putfield sun.security.ssl.InputRecord.pos : int [311]
//    14  aload_0 [this]
//    15  aload_0 [this]
//    16  getfield sun.security.ssl.InputRecord.pos : int [311]
//    19  putfield sun.security.ssl.InputRecord.lastHashed : int [309]
//    22  return
//      Line numbers:
//        [pc: 0, line: 333]
//        [pc: 4, line: 334]
//        [pc: 14, line: 335]
//        [pc: 22, line: 337]
//      Stack map table: number of frames 1
//        [pc: 22, same]
//  
//  // Method descriptor #35 ()V
//  // Stack: 4, Locals: 2
//  void doHashes();
//     0  aload_0 [this]
//     1  getfield sun.security.ssl.InputRecord.pos : int [311]
//     4  aload_0 [this]
//     5  getfield sun.security.ssl.InputRecord.lastHashed : int [309]
//     8  isub
//     9  istore_1
//    10  iload_1
//    11  ifle 35
//    14  aload_0 [this]
//    15  aload_0 [this]
//    16  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    19  aload_0 [this]
//    20  getfield sun.security.ssl.InputRecord.lastHashed : int [309]
//    23  iload_1
//    24  invokespecial sun.security.ssl.InputRecord.hashInternal(byte[], int, int) : void [365]
//    27  aload_0 [this]
//    28  aload_0 [this]
//    29  getfield sun.security.ssl.InputRecord.pos : int [311]
//    32  putfield sun.security.ssl.InputRecord.lastHashed : int [309]
//    35  return
//      Line numbers:
//        [pc: 0, line: 348]
//        [pc: 10, line: 350]
//        [pc: 14, line: 351]
//        [pc: 27, line: 352]
//        [pc: 35, line: 354]
//      Stack map table: number of frames 1
//        [pc: 35, append: {int}]
//  
//  // Method descriptor #43 ([BII)V
//  // Stack: 6, Locals: 5
//  private void hashInternal(byte[] arg0, int arg1, int arg2);
//     0  getstatic sun.security.ssl.InputRecord.debug : sun.security.ssl.Debug [318]
//     3  ifnull 71
//     6  ldc <String "data"> [28]
//     8  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [358]
//    11  ifeq 71
//    14  new sun.misc.HexDumpEncoder [198]
//    17  dup
//    18  invokespecial sun.misc.HexDumpEncoder() [350]
//    21  astore 4
//    23  getstatic java.lang.System.out : java.io.PrintStream [306]
//    26  new java.lang.StringBuilder [190]
//    29  dup
//    30  invokespecial java.lang.StringBuilder() [336]
//    33  ldc <String "[read] MD5 and SHA1 hashes:  len = "> [24]
//    35  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [340]
//    38  iload_3 [arg2]
//    39  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [338]
//    42  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [337]
//    45  invokevirtual java.io.PrintStream.println(java.lang.String) : void [333]
//    48  aload 4
//    50  new java.io.ByteArrayInputStream [181]
//    53  dup
//    54  aload_1 [arg0]
//    55  iload_2 [arg1]
//    56  iload_3 [arg2]
//    57  invokespecial java.io.ByteArrayInputStream(byte[], int, int) [328]
//    60  getstatic java.lang.System.out : java.io.PrintStream [306]
//    63  invokevirtual sun.misc.HexDumpEncoder.encodeBuffer(java.io.InputStream, java.io.OutputStream) : void [351]
//    66  goto 71
//    69  astore 4
//    71  aload_0 [this]
//    72  getfield sun.security.ssl.InputRecord.handshakeHash : sun.security.ssl.HandshakeHash [319]
//    75  aload_1 [arg0]
//    76  iload_2 [arg1]
//    77  iload_3 [arg2]
//    78  invokevirtual sun.security.ssl.HandshakeHash.update(byte[], int, int) : void [360]
//    81  return
//      Exception Table:
//        [pc: 14, pc: 66] -> 69 when : java.io.IOException
//      Line numbers:
//        [pc: 0, line: 360]
//        [pc: 14, line: 362]
//        [pc: 23, line: 364]
//        [pc: 48, line: 366]
//        [pc: 66, line: 368]
//        [pc: 71, line: 370]
//        [pc: 81, line: 371]
//      Stack map table: number of frames 2
//        [pc: 69, same_locals_1_stack_item_extended, stack: {java.io.IOException}]
//        [pc: 71, same]
//  
//  // Method descriptor #223 (Lsun/security/ssl/InputRecord;)V
//  // Stack: 6, Locals: 4
//  void queueHandshake(sun.security.ssl.InputRecord arg0) throws java.io.IOException;
//      0  aload_0 [this]
//      1  invokevirtual sun.security.ssl.InputRecord.doHashes() : void [363]
//      4  aload_0 [this]
//      5  getfield sun.security.ssl.InputRecord.pos : int [311]
//      8  iconst_5
//      9  if_icmple 63
//     12  aload_0 [this]
//     13  getfield sun.security.ssl.InputRecord.count : int [307]
//     16  aload_0 [this]
//     17  getfield sun.security.ssl.InputRecord.pos : int [311]
//     20  isub
//     21  istore_2
//     22  iload_2
//     23  ifeq 43
//     26  aload_0 [this]
//     27  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     30  aload_0 [this]
//     31  getfield sun.security.ssl.InputRecord.pos : int [311]
//     34  aload_0 [this]
//     35  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     38  iconst_5
//     39  iload_2
//     40  invokestatic java.lang.System.arraycopy(java.lang.Object, int, java.lang.Object, int, int) : void [341]
//     43  aload_0 [this]
//     44  iconst_5
//     45  putfield sun.security.ssl.InputRecord.pos : int [311]
//     48  aload_0 [this]
//     49  aload_0 [this]
//     50  getfield sun.security.ssl.InputRecord.pos : int [311]
//     53  putfield sun.security.ssl.InputRecord.lastHashed : int [309]
//     56  aload_0 [this]
//     57  iconst_5
//     58  iload_2
//     59  iadd
//     60  putfield sun.security.ssl.InputRecord.count : int [307]
//     63  aload_1 [arg0]
//     64  invokevirtual sun.security.ssl.InputRecord.available() : int [362]
//     67  aload_0 [this]
//     68  getfield sun.security.ssl.InputRecord.count : int [307]
//     71  iadd
//     72  istore_2
//     73  aload_0 [this]
//     74  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     77  arraylength
//     78  iload_2
//     79  if_icmpge 105
//     82  iload_2
//     83  newarray byte [8]
//     85  astore_3
//     86  aload_0 [this]
//     87  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     90  iconst_0
//     91  aload_3
//     92  iconst_0
//     93  aload_0 [this]
//     94  getfield sun.security.ssl.InputRecord.count : int [307]
//     97  invokestatic java.lang.System.arraycopy(java.lang.Object, int, java.lang.Object, int, int) : void [341]
//    100  aload_0 [this]
//    101  aload_3
//    102  putfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    105  aload_1 [arg0]
//    106  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    109  aload_1 [arg0]
//    110  getfield sun.security.ssl.InputRecord.pos : int [311]
//    113  aload_0 [this]
//    114  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    117  aload_0 [this]
//    118  getfield sun.security.ssl.InputRecord.count : int [307]
//    121  iload_2
//    122  aload_0 [this]
//    123  getfield sun.security.ssl.InputRecord.count : int [307]
//    126  isub
//    127  invokestatic java.lang.System.arraycopy(java.lang.Object, int, java.lang.Object, int, int) : void [341]
//    130  aload_0 [this]
//    131  iload_2
//    132  putfield sun.security.ssl.InputRecord.count : int [307]
//    135  aload_1 [arg0]
//    136  getfield sun.security.ssl.InputRecord.lastHashed : int [309]
//    139  aload_1 [arg0]
//    140  getfield sun.security.ssl.InputRecord.pos : int [311]
//    143  isub
//    144  istore_2
//    145  aload_0 [this]
//    146  getfield sun.security.ssl.InputRecord.pos : int [311]
//    149  iconst_5
//    150  if_icmpne 166
//    153  aload_0 [this]
//    154  dup
//    155  getfield sun.security.ssl.InputRecord.lastHashed : int [309]
//    158  iload_2
//    159  iadd
//    160  putfield sun.security.ssl.InputRecord.lastHashed : int [309]
//    163  goto 176
//    166  new javax.net.ssl.SSLProtocolException [197]
//    169  dup
//    170  ldc <String "?? confused buffer hashing ??"> [9]
//    172  invokespecial javax.net.ssl.SSLProtocolException(java.lang.String) [349]
//    175  athrow
//    176  aload_1 [arg0]
//    177  aload_1 [arg0]
//    178  getfield sun.security.ssl.InputRecord.count : int [307]
//    181  putfield sun.security.ssl.InputRecord.pos : int [311]
//    184  return
//      Line numbers:
//        [pc: 0, line: 386]
//        [pc: 4, line: 392]
//        [pc: 12, line: 393]
//        [pc: 22, line: 394]
//        [pc: 26, line: 395]
//        [pc: 43, line: 397]
//        [pc: 48, line: 398]
//        [pc: 56, line: 399]
//        [pc: 63, line: 405]
//        [pc: 73, line: 406]
//        [pc: 82, line: 409]
//        [pc: 86, line: 410]
//        [pc: 100, line: 411]
//        [pc: 105, line: 417]
//        [pc: 130, line: 418]
//        [pc: 135, line: 425]
//        [pc: 145, line: 426]
//        [pc: 153, line: 427]
//        [pc: 166, line: 429]
//        [pc: 176, line: 432]
//        [pc: 184, line: 433]
//      Stack map table: number of frames 5
//        [pc: 43, append: {int}]
//        [pc: 63, chop 1 local(s)]
//        [pc: 105, append: {int}]
//        [pc: 166, same]
//        [pc: 176, same]
//  
//  // Method descriptor #35 ()V
//  // Stack: 2, Locals: 1
//  public void close();
//     0  aload_0 [this]
//     1  iconst_0
//     2  putfield sun.security.ssl.InputRecord.appDataValid : boolean [312]
//     5  aload_0 [this]
//     6  iconst_1
//     7  putfield sun.security.ssl.InputRecord.isClosed : boolean [314]
//    10  aload_0 [this]
//    11  iconst_0
//    12  putfield sun.security.ssl.InputRecord.mark : int [310]
//    15  aload_0 [this]
//    16  iconst_0
//    17  putfield sun.security.ssl.InputRecord.pos : int [311]
//    20  aload_0 [this]
//    21  iconst_0
//    22  putfield sun.security.ssl.InputRecord.count : int [307]
//    25  return
//      Line numbers:
//        [pc: 0, line: 442]
//        [pc: 5, line: 443]
//        [pc: 10, line: 444]
//        [pc: 15, line: 445]
//        [pc: 20, line: 446]
//        [pc: 25, line: 447]
//  
//  // Method descriptor #211 (Ljava/io/InputStream;[BII)I
//  // Stack: 5, Locals: 9
//  private int readFully(java.io.InputStream arg0, byte[] arg1, int arg2, int arg3) throws java.io.IOException;
//      0  iconst_0
//      1  istore 5
//      3  iload 5
//      5  iload 4 [arg3]
//      7  if_icmpge 134
//     10  aload_1 [arg0]
//     11  aload_2 [arg1]
//     12  iload_3 [arg2]
//     13  iload 5
//     15  iadd
//     16  iload 4 [arg3]
//     18  iload 5
//     20  isub
//     21  invokevirtual java.io.InputStream.read(byte[], int, int) : int [330]
//     24  istore 6
//     26  iload 6
//     28  ifge 34
//     31  iload 6
//     33  ireturn
//     34  getstatic sun.security.ssl.InputRecord.debug : sun.security.ssl.Debug [318]
//     37  ifnull 113
//     40  ldc <String "packet"> [29]
//     42  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [358]
//     45  ifeq 113
//     48  new sun.misc.HexDumpEncoder [198]
//     51  dup
//     52  invokespecial sun.misc.HexDumpEncoder() [350]
//     55  astore 7
//     57  aload_2 [arg1]
//     58  iload_3 [arg2]
//     59  iload 5
//     61  iadd
//     62  iload 6
//     64  invokestatic java.nio.ByteBuffer.wrap(byte[], int, int) : java.nio.ByteBuffer [345]
//     67  astore 8
//     69  getstatic java.lang.System.out : java.io.PrintStream [306]
//     72  new java.lang.StringBuilder [190]
//     75  dup
//     76  invokespecial java.lang.StringBuilder() [336]
//     79  ldc <String "[Raw read]: length = "> [23]
//     81  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [340]
//     84  aload 8
//     86  invokevirtual java.nio.ByteBuffer.remaining() : int [344]
//     89  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [338]
//     92  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [337]
//     95  invokevirtual java.io.PrintStream.println(java.lang.String) : void [333]
//     98  aload 7
//    100  aload 8
//    102  getstatic java.lang.System.out : java.io.PrintStream [306]
//    105  invokevirtual sun.misc.HexDumpEncoder.encodeBuffer(java.nio.ByteBuffer, java.io.OutputStream) : void [352]
//    108  goto 113
//    111  astore 7
//    113  iload 5
//    115  iload 6
//    117  iadd
//    118  istore 5
//    120  aload_0 [this]
//    121  dup
//    122  getfield sun.security.ssl.InputRecord.exlen : int [308]
//    125  iload 6
//    127  iadd
//    128  putfield sun.security.ssl.InputRecord.exlen : int [308]
//    131  goto 3
//    134  iload 5
//    136  ireturn
//      Exception Table:
//        [pc: 48, pc: 108] -> 111 when : java.io.IOException
//      Line numbers:
//        [pc: 0, line: 463]
//        [pc: 3, line: 464]
//        [pc: 10, line: 465]
//        [pc: 26, line: 466]
//        [pc: 31, line: 467]
//        [pc: 34, line: 470]
//        [pc: 48, line: 472]
//        [pc: 57, line: 473]
//        [pc: 69, line: 475]
//        [pc: 86, line: 476]
//        [pc: 95, line: 475]
//        [pc: 98, line: 477]
//        [pc: 108, line: 478]
//        [pc: 113, line: 481]
//        [pc: 120, line: 482]
//        [pc: 131, line: 483]
//        [pc: 134, line: 485]
//      Stack map table: number of frames 5
//        [pc: 3, append: {int}]
//        [pc: 34, append: {int}]
//        [pc: 111, same_locals_1_stack_item_extended, stack: {java.io.IOException}]
//        [pc: 113, same]
//        [pc: 134, chop 1 local(s)]
//  
//  // Method descriptor #230 (Ljava/io/InputStream;Ljava/io/OutputStream;)V
//  // Stack: 6, Locals: 4
//  void read(java.io.InputStream arg0, java.io.OutputStream arg1) throws java.io.IOException;
//      0  aload_0 [this]
//      1  getfield sun.security.ssl.InputRecord.isClosed : boolean [314]
//      4  ifeq 8
//      7  return
//      8  aload_0 [this]
//      9  getfield sun.security.ssl.InputRecord.exlen : int [308]
//     12  iconst_5
//     13  if_icmpge 68
//     16  aload_0 [this]
//     17  aload_1 [arg0]
//     18  aload_0 [this]
//     19  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     22  aload_0 [this]
//     23  getfield sun.security.ssl.InputRecord.exlen : int [308]
//     26  iconst_5
//     27  aload_0 [this]
//     28  getfield sun.security.ssl.InputRecord.exlen : int [308]
//     31  isub
//     32  invokespecial sun.security.ssl.InputRecord.readFully(java.io.InputStream, byte[], int, int) : int [367]
//     35  istore_3
//     36  iload_3
//     37  ifge 50
//     40  new java.io.EOFException [182]
//     43  dup
//     44  ldc <String "SSL peer shut down incorrectly"> [18]
//     46  invokespecial java.io.EOFException(java.lang.String) [329]
//     49  athrow
//     50  aload_0 [this]
//     51  iconst_5
//     52  putfield sun.security.ssl.InputRecord.pos : int [311]
//     55  aload_0 [this]
//     56  iconst_5
//     57  putfield sun.security.ssl.InputRecord.count : int [307]
//     60  aload_0 [this]
//     61  aload_0 [this]
//     62  getfield sun.security.ssl.InputRecord.pos : int [311]
//     65  putfield sun.security.ssl.InputRecord.lastHashed : int [309]
//     68  aload_0 [this]
//     69  getfield sun.security.ssl.InputRecord.formatVerified : boolean [313]
//     72  ifne 120
//     75  aload_0 [this]
//     76  iconst_1
//     77  putfield sun.security.ssl.InputRecord.formatVerified : boolean [313]
//     80  aload_0 [this]
//     81  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     84  iconst_0
//     85  baload
//     86  bipush 22
//     88  if_icmpeq 111
//     91  aload_0 [this]
//     92  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     95  iconst_0
//     96  baload
//     97  bipush 21
//     99  if_icmpeq 111
//    102  aload_0 [this]
//    103  aload_1 [arg0]
//    104  aload_2 [arg1]
//    105  invokespecial sun.security.ssl.InputRecord.handleUnknownRecord(java.io.InputStream, java.io.OutputStream) : void [374]
//    108  goto 126
//    111  aload_0 [this]
//    112  aload_1 [arg0]
//    113  aload_2 [arg1]
//    114  invokespecial sun.security.ssl.InputRecord.readV3Record(java.io.InputStream, java.io.OutputStream) : void [375]
//    117  goto 126
//    120  aload_0 [this]
//    121  aload_1 [arg0]
//    122  aload_2 [arg1]
//    123  invokespecial sun.security.ssl.InputRecord.readV3Record(java.io.InputStream, java.io.OutputStream) : void [375]
//    126  return
//      Line numbers:
//        [pc: 0, line: 494]
//        [pc: 7, line: 495]
//        [pc: 8, line: 502]
//        [pc: 16, line: 503]
//        [pc: 36, line: 504]
//        [pc: 40, line: 505]
//        [pc: 50, line: 508]
//        [pc: 55, line: 509]
//        [pc: 60, line: 510]
//        [pc: 68, line: 519]
//        [pc: 75, line: 520]
//        [pc: 80, line: 526]
//        [pc: 102, line: 527]
//        [pc: 111, line: 529]
//        [pc: 120, line: 532]
//        [pc: 126, line: 534]
//      Stack map table: number of frames 6
//        [pc: 8, same]
//        [pc: 50, append: {int}]
//        [pc: 68, chop 1 local(s)]
//        [pc: 111, same]
//        [pc: 120, same]
//        [pc: 126, same]
//  
//  // Method descriptor #229 (Lsun/security/ssl/ProtocolVersion;Z)V
//  // Stack: 4, Locals: 2
//  static void checkRecordVersion(sun.security.ssl.ProtocolVersion arg0, boolean arg1) throws javax.net.ssl.SSLException;
//     0  aload_0 [arg0]
//     1  getfield sun.security.ssl.ProtocolVersion.v : int [322]
//     4  getstatic sun.security.ssl.ProtocolVersion.MIN : sun.security.ssl.ProtocolVersion [325]
//     7  getfield sun.security.ssl.ProtocolVersion.v : int [322]
//    10  if_icmplt 34
//    13  aload_0 [arg0]
//    14  getfield sun.security.ssl.ProtocolVersion.major : byte [321]
//    17  sipush 255
//    20  iand
//    21  getstatic sun.security.ssl.ProtocolVersion.MAX : sun.security.ssl.ProtocolVersion [324]
//    24  getfield sun.security.ssl.ProtocolVersion.major : byte [321]
//    27  sipush 255
//    30  iand
//    31  if_icmple 78
//    34  iload_1 [arg1]
//    35  ifeq 51
//    38  aload_0 [arg0]
//    39  getfield sun.security.ssl.ProtocolVersion.v : int [322]
//    42  getstatic sun.security.ssl.ProtocolVersion.SSL20Hello : sun.security.ssl.ProtocolVersion [326]
//    45  getfield sun.security.ssl.ProtocolVersion.v : int [322]
//    48  if_icmpeq 78
//    51  new javax.net.ssl.SSLException [195]
//    54  dup
//    55  new java.lang.StringBuilder [190]
//    58  dup
//    59  invokespecial java.lang.StringBuilder() [336]
//    62  ldc <String "Unsupported record version "> [22]
//    64  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [340]
//    67  aload_0 [arg0]
//    68  invokevirtual java.lang.StringBuilder.append(java.lang.Object) : java.lang.StringBuilder [339]
//    71  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [337]
//    74  invokespecial javax.net.ssl.SSLException(java.lang.String) [347]
//    77  athrow
//    78  return
//      Line numbers:
//        [pc: 0, line: 546]
//        [pc: 34, line: 550]
//        [pc: 51, line: 552]
//        [pc: 78, line: 555]
//      Stack map table: number of frames 3
//        [pc: 34, same]
//        [pc: 51, same]
//        [pc: 78, same]
//  
//  // Method descriptor #230 (Ljava/io/InputStream;Ljava/io/OutputStream;)V
//  // Stack: 6, Locals: 6
//  private void readV3Record(java.io.InputStream arg0, java.io.OutputStream arg1) throws java.io.IOException;
//      0  aload_0 [this]
//      1  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//      4  iconst_1
//      5  baload
//      6  aload_0 [this]
//      7  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     10  iconst_2
//     11  baload
//     12  invokestatic sun.security.ssl.ProtocolVersion.valueOf(int, int) : sun.security.ssl.ProtocolVersion [380]
//     15  astore_3
//     16  aload_3
//     17  iconst_0
//     18  invokestatic sun.security.ssl.InputRecord.checkRecordVersion(sun.security.ssl.ProtocolVersion, boolean) : void [373]
//     21  aload_0 [this]
//     22  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     25  iconst_3
//     26  baload
//     27  sipush 255
//     30  iand
//     31  bipush 8
//     33  ishl
//     34  aload_0 [this]
//     35  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     38  iconst_4
//     39  baload
//     40  sipush 255
//     43  iand
//     44  iadd
//     45  istore 4
//     47  iload 4
//     49  iflt 59
//     52  iload 4
//     54  ldc <Integer 33300> [1]
//     56  if_icmple 100
//     59  new javax.net.ssl.SSLProtocolException [197]
//     62  dup
//     63  new java.lang.StringBuilder [190]
//     66  dup
//     67  invokespecial java.lang.StringBuilder() [336]
//     70  ldc <String "Bad InputRecord size, count = "> [12]
//     72  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [340]
//     75  iload 4
//     77  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [338]
//     80  ldc <String ", buf.length = "> [6]
//     82  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [340]
//     85  aload_0 [this]
//     86  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     89  arraylength
//     90  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [338]
//     93  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [337]
//     96  invokespecial javax.net.ssl.SSLProtocolException(java.lang.String) [349]
//     99  athrow
//    100  iload 4
//    102  aload_0 [this]
//    103  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    106  arraylength
//    107  iconst_5
//    108  isub
//    109  if_icmple 138
//    112  iload 4
//    114  iconst_5
//    115  iadd
//    116  newarray byte [8]
//    118  astore 5
//    120  aload_0 [this]
//    121  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    124  iconst_0
//    125  aload 5
//    127  iconst_0
//    128  iconst_5
//    129  invokestatic java.lang.System.arraycopy(java.lang.Object, int, java.lang.Object, int, int) : void [341]
//    132  aload_0 [this]
//    133  aload 5
//    135  putfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    138  aload_0 [this]
//    139  getfield sun.security.ssl.InputRecord.exlen : int [308]
//    142  iload 4
//    144  iconst_5
//    145  iadd
//    146  if_icmpge 188
//    149  aload_0 [this]
//    150  aload_1 [arg0]
//    151  aload_0 [this]
//    152  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    155  aload_0 [this]
//    156  getfield sun.security.ssl.InputRecord.exlen : int [308]
//    159  iload 4
//    161  iconst_5
//    162  iadd
//    163  aload_0 [this]
//    164  getfield sun.security.ssl.InputRecord.exlen : int [308]
//    167  isub
//    168  invokespecial sun.security.ssl.InputRecord.readFully(java.io.InputStream, byte[], int, int) : int [367]
//    171  istore 5
//    173  iload 5
//    175  ifge 188
//    178  new javax.net.ssl.SSLException [195]
//    181  dup
//    182  ldc <String "SSL peer shut down incorrectly"> [18]
//    184  invokespecial javax.net.ssl.SSLException(java.lang.String) [347]
//    187  athrow
//    188  aload_0 [this]
//    189  iload 4
//    191  iconst_5
//    192  iadd
//    193  putfield sun.security.ssl.InputRecord.count : int [307]
//    196  aload_0 [this]
//    197  iconst_0
//    198  putfield sun.security.ssl.InputRecord.exlen : int [308]
//    201  getstatic sun.security.ssl.InputRecord.debug : sun.security.ssl.Debug [318]
//    204  ifnull 330
//    207  ldc <String "record"> [30]
//    209  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [358]
//    212  ifeq 330
//    215  aload_0 [this]
//    216  getfield sun.security.ssl.InputRecord.count : int [307]
//    219  iflt 232
//    222  aload_0 [this]
//    223  getfield sun.security.ssl.InputRecord.count : int [307]
//    226  sipush 16916
//    229  if_icmple 269
//    232  getstatic java.lang.System.out : java.io.PrintStream [306]
//    235  new java.lang.StringBuilder [190]
//    238  dup
//    239  invokespecial java.lang.StringBuilder() [336]
//    242  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [343]
//    245  invokevirtual java.lang.Thread.getName() : java.lang.String [342]
//    248  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [340]
//    251  ldc <String ", Bad InputRecord size, count = "> [3]
//    253  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [340]
//    256  aload_0 [this]
//    257  getfield sun.security.ssl.InputRecord.count : int [307]
//    260  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [338]
//    263  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [337]
//    266  invokevirtual java.io.PrintStream.println(java.lang.String) : void [333]
//    269  getstatic java.lang.System.out : java.io.PrintStream [306]
//    272  new java.lang.StringBuilder [190]
//    275  dup
//    276  invokespecial java.lang.StringBuilder() [336]
//    279  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [343]
//    282  invokevirtual java.lang.Thread.getName() : java.lang.String [342]
//    285  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [340]
//    288  ldc <String ", READ: "> [4]
//    290  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [340]
//    293  aload_3
//    294  invokevirtual java.lang.StringBuilder.append(java.lang.Object) : java.lang.StringBuilder [339]
//    297  ldc <String " "> [2]
//    299  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [340]
//    302  aload_0 [this]
//    303  invokevirtual sun.security.ssl.InputRecord.contentType() : byte [361]
//    306  invokestatic sun.security.ssl.InputRecord.contentName(int) : java.lang.String [369]
//    309  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [340]
//    312  ldc <String ", length = "> [7]
//    314  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [340]
//    317  aload_0 [this]
//    318  invokevirtual sun.security.ssl.InputRecord.available() : int [362]
//    321  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [338]
//    324  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [337]
//    327  invokevirtual java.io.PrintStream.println(java.lang.String) : void [333]
//    330  return
//      Line numbers:
//        [pc: 0, line: 562]
//        [pc: 16, line: 565]
//        [pc: 21, line: 570]
//        [pc: 47, line: 575]
//        [pc: 59, line: 576]
//        [pc: 100, line: 586]
//        [pc: 112, line: 587]
//        [pc: 120, line: 588]
//        [pc: 132, line: 589]
//        [pc: 138, line: 592]
//        [pc: 149, line: 593]
//        [pc: 173, line: 595]
//        [pc: 178, line: 596]
//        [pc: 188, line: 601]
//        [pc: 196, line: 602]
//        [pc: 201, line: 604]
//        [pc: 215, line: 605]
//        [pc: 232, line: 606]
//        [pc: 269, line: 609]
//        [pc: 303, line: 611]
//        [pc: 327, line: 609]
//        [pc: 330, line: 616]
//      Stack map table: number of frames 7
//        [pc: 59, append: {sun.security.ssl.ProtocolVersion, int}]
//        [pc: 100, same]
//        [pc: 138, same]
//        [pc: 188, same]
//        [pc: 232, same]
//        [pc: 269, same]
//        [pc: 330, same]
//  
//  // Method descriptor #230 (Ljava/io/InputStream;Ljava/io/OutputStream;)V
//  // Stack: 6, Locals: 6
//  private void handleUnknownRecord(java.io.InputStream arg0, java.io.OutputStream arg1) throws java.io.IOException;
//      0  aload_0 [this]
//      1  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//      4  iconst_0
//      5  baload
//      6  sipush 128
//      9  iand
//     10  ifeq 302
//     13  aload_0 [this]
//     14  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     17  iconst_2
//     18  baload
//     19  iconst_1
//     20  if_icmpne 302
//     23  aload_0 [this]
//     24  getfield sun.security.ssl.InputRecord.helloVersion : sun.security.ssl.ProtocolVersion [320]
//     27  getstatic sun.security.ssl.ProtocolVersion.SSL20Hello : sun.security.ssl.ProtocolVersion [326]
//     30  if_acmpeq 43
//     33  new javax.net.ssl.SSLHandshakeException [196]
//     36  dup
//     37  ldc <String "SSLv2Hello is disabled"> [19]
//     39  invokespecial javax.net.ssl.SSLHandshakeException(java.lang.String) [348]
//     42  athrow
//     43  aload_0 [this]
//     44  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     47  iconst_3
//     48  baload
//     49  aload_0 [this]
//     50  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     53  iconst_4
//     54  baload
//     55  invokestatic sun.security.ssl.ProtocolVersion.valueOf(int, int) : sun.security.ssl.ProtocolVersion [380]
//     58  astore_3
//     59  aload_3
//     60  getstatic sun.security.ssl.ProtocolVersion.SSL20Hello : sun.security.ssl.ProtocolVersion [326]
//     63  if_acmpne 94
//     66  aload_0 [this]
//     67  aload_2 [arg1]
//     68  getstatic sun.security.ssl.InputRecord.v2NoCipher : byte[] [317]
//     71  iconst_0
//     72  getstatic sun.security.ssl.InputRecord.v2NoCipher : byte[] [317]
//     75  arraylength
//     76  invokevirtual sun.security.ssl.InputRecord.writeBuffer(java.io.OutputStream, byte[], int, int) : void [368]
//     79  goto 84
//     82  astore 4
//     84  new javax.net.ssl.SSLException [195]
//     87  dup
//     88  ldc <String "Unsupported SSL v2.0 ClientHello"> [21]
//     90  invokespecial javax.net.ssl.SSLException(java.lang.String) [347]
//     93  athrow
//     94  aload_0 [this]
//     95  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     98  iconst_0
//     99  baload
//    100  bipush 127
//    102  iand
//    103  bipush 8
//    105  ishl
//    106  aload_0 [this]
//    107  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    110  iconst_1
//    111  baload
//    112  sipush 255
//    115  iand
//    116  iadd
//    117  iconst_3
//    118  isub
//    119  istore 4
//    121  aload_0 [this]
//    122  getfield sun.security.ssl.InputRecord.v2Buf : byte[] [316]
//    125  ifnonnull 136
//    128  aload_0 [this]
//    129  iload 4
//    131  newarray byte [8]
//    133  putfield sun.security.ssl.InputRecord.v2Buf : byte[] [316]
//    136  aload_0 [this]
//    137  getfield sun.security.ssl.InputRecord.exlen : int [308]
//    140  iload 4
//    142  iconst_5
//    143  iadd
//    144  if_icmpge 188
//    147  aload_0 [this]
//    148  aload_1 [arg0]
//    149  aload_0 [this]
//    150  getfield sun.security.ssl.InputRecord.v2Buf : byte[] [316]
//    153  aload_0 [this]
//    154  getfield sun.security.ssl.InputRecord.exlen : int [308]
//    157  iconst_5
//    158  isub
//    159  iload 4
//    161  iconst_5
//    162  iadd
//    163  aload_0 [this]
//    164  getfield sun.security.ssl.InputRecord.exlen : int [308]
//    167  isub
//    168  invokespecial sun.security.ssl.InputRecord.readFully(java.io.InputStream, byte[], int, int) : int [367]
//    171  istore 5
//    173  iload 5
//    175  ifge 188
//    178  new java.io.EOFException [182]
//    181  dup
//    182  ldc <String "SSL peer shut down incorrectly"> [18]
//    184  invokespecial java.io.EOFException(java.lang.String) [329]
//    187  athrow
//    188  aload_0 [this]
//    189  iconst_0
//    190  putfield sun.security.ssl.InputRecord.exlen : int [308]
//    193  aload_0 [this]
//    194  aload_0 [this]
//    195  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    198  iconst_2
//    199  iconst_3
//    200  invokespecial sun.security.ssl.InputRecord.hashInternal(byte[], int, int) : void [365]
//    203  aload_0 [this]
//    204  aload_0 [this]
//    205  getfield sun.security.ssl.InputRecord.v2Buf : byte[] [316]
//    208  iconst_0
//    209  iload 4
//    211  invokespecial sun.security.ssl.InputRecord.hashInternal(byte[], int, int) : void [365]
//    214  aload_0 [this]
//    215  aload_0 [this]
//    216  getfield sun.security.ssl.InputRecord.v2Buf : byte[] [316]
//    219  invokespecial sun.security.ssl.InputRecord.V2toV3ClientHello(byte[]) : void [364]
//    222  aload_0 [this]
//    223  aconst_null
//    224  putfield sun.security.ssl.InputRecord.v2Buf : byte[] [316]
//    227  aload_0 [this]
//    228  aload_0 [this]
//    229  getfield sun.security.ssl.InputRecord.count : int [307]
//    232  putfield sun.security.ssl.InputRecord.lastHashed : int [309]
//    235  getstatic sun.security.ssl.InputRecord.debug : sun.security.ssl.Debug [318]
//    238  ifnull 301
//    241  ldc <String "record"> [30]
//    243  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [358]
//    246  ifeq 301
//    249  getstatic java.lang.System.out : java.io.PrintStream [306]
//    252  new java.lang.StringBuilder [190]
//    255  dup
//    256  invokespecial java.lang.StringBuilder() [336]
//    259  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [343]
//    262  invokevirtual java.lang.Thread.getName() : java.lang.String [342]
//    265  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [340]
//    268  ldc <String ", READ:  SSL v2, contentType = "> [5]
//    270  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [340]
//    273  aload_0 [this]
//    274  invokevirtual sun.security.ssl.InputRecord.contentType() : byte [361]
//    277  invokestatic sun.security.ssl.InputRecord.contentName(int) : java.lang.String [369]
//    280  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [340]
//    283  ldc <String ", translated length = "> [8]
//    285  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [340]
//    288  aload_0 [this]
//    289  invokevirtual sun.security.ssl.InputRecord.available() : int [362]
//    292  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [338]
//    295  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [337]
//    298  invokevirtual java.io.PrintStream.println(java.lang.String) : void [333]
//    301  return
//    302  aload_0 [this]
//    303  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    306  iconst_0
//    307  baload
//    308  sipush 128
//    311  iand
//    312  ifeq 335
//    315  aload_0 [this]
//    316  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    319  iconst_2
//    320  baload
//    321  iconst_4
//    322  if_icmpne 335
//    325  new javax.net.ssl.SSLException [195]
//    328  dup
//    329  ldc <String "SSL V2.0 servers are not supported."> [17]
//    331  invokespecial javax.net.ssl.SSLException(java.lang.String) [347]
//    334  athrow
//    335  iconst_0
//    336  istore_3
//    337  iload_3
//    338  getstatic sun.security.ssl.InputRecord.v2NoCipher : byte[] [317]
//    341  arraylength
//    342  if_icmpge 375
//    345  aload_0 [this]
//    346  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    349  iload_3
//    350  baload
//    351  getstatic sun.security.ssl.InputRecord.v2NoCipher : byte[] [317]
//    354  iload_3
//    355  baload
//    356  if_icmpeq 369
//    359  new javax.net.ssl.SSLException [195]
//    362  dup
//    363  ldc <String "Unrecognized SSL message, plaintext connection?"> [20]
//    365  invokespecial javax.net.ssl.SSLException(java.lang.String) [347]
//    368  athrow
//    369  iinc 3 1
//    372  goto 337
//    375  new javax.net.ssl.SSLException [195]
//    378  dup
//    379  ldc <String "SSL V2.0 servers are not supported."> [17]
//    381  invokespecial javax.net.ssl.SSLException(java.lang.String) [347]
//    384  athrow
//      Exception Table:
//        [pc: 66, pc: 79] -> 82 when : java.lang.Exception
//      Line numbers:
//        [pc: 0, line: 630]
//        [pc: 23, line: 636]
//        [pc: 33, line: 637]
//        [pc: 43, line: 640]
//        [pc: 55, line: 641]
//        [pc: 59, line: 643]
//        [pc: 66, line: 651]
//        [pc: 79, line: 654]
//        [pc: 82, line: 652]
//        [pc: 84, line: 655]
//        [pc: 94, line: 663]
//        [pc: 121, line: 665]
//        [pc: 128, line: 666]
//        [pc: 136, line: 668]
//        [pc: 147, line: 669]
//        [pc: 173, line: 671]
//        [pc: 178, line: 672]
//        [pc: 188, line: 677]
//        [pc: 193, line: 679]
//        [pc: 203, line: 680]
//        [pc: 214, line: 681]
//        [pc: 222, line: 682]
//        [pc: 227, line: 683]
//        [pc: 235, line: 685]
//        [pc: 249, line: 686]
//        [pc: 259, line: 687]
//        [pc: 274, line: 689]
//        [pc: 289, line: 690]
//        [pc: 298, line: 686]
//        [pc: 301, line: 692]
//        [pc: 302, line: 698]
//        [pc: 325, line: 699]
//        [pc: 335, line: 708]
//        [pc: 345, line: 709]
//        [pc: 359, line: 710]
//        [pc: 369, line: 708]
//        [pc: 375, line: 715]
//      Stack map table: number of frames 12
//        [pc: 43, same]
//        [pc: 82, full, stack: {java.lang.Exception}, locals: {sun.security.ssl.InputRecord, java.io.InputStream, java.io.OutputStream, sun.security.ssl.ProtocolVersion}]
//        [pc: 84, same]
//        [pc: 94, same]
//        [pc: 136, append: {int}]
//        [pc: 188, same]
//        [pc: 301, same_extended]
//        [pc: 302, chop 2 local(s)]
//        [pc: 335, same]
//        [pc: 337, append: {int}]
//        [pc: 369, same]
//        [pc: 375, chop 1 local(s)]
//  
//  // Method descriptor #212 (Ljava/io/OutputStream;[BII)V
//  // Stack: 4, Locals: 5
//  void writeBuffer(java.io.OutputStream arg0, byte[] arg1, int arg2, int arg3) throws java.io.IOException;
//     0  aload_1 [arg0]
//     1  aload_2 [arg1]
//     2  iconst_0
//     3  iload 4 [arg3]
//     5  invokevirtual java.io.OutputStream.write(byte[], int, int) : void [332]
//     8  aload_1 [arg0]
//     9  invokevirtual java.io.OutputStream.flush() : void [331]
//    12  return
//      Line numbers:
//        [pc: 0, line: 726]
//        [pc: 8, line: 727]
//        [pc: 12, line: 728]
//  
//  // Method descriptor #41 ([B)V
//  // Stack: 5, Locals: 8
//  private void V2toV3ClientHello(byte[] arg0) throws javax.net.ssl.SSLException;
//      0  aload_0 [this]
//      1  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//      4  iconst_0
//      5  bipush 22
//      7  bastore
//      8  aload_0 [this]
//      9  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     12  iconst_1
//     13  aload_0 [this]
//     14  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     17  iconst_3
//     18  baload
//     19  bastore
//     20  aload_0 [this]
//     21  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     24  iconst_2
//     25  aload_0 [this]
//     26  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     29  iconst_4
//     30  baload
//     31  bastore
//     32  aload_0 [this]
//     33  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     36  iconst_5
//     37  iconst_1
//     38  bastore
//     39  aload_0 [this]
//     40  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     43  bipush 9
//     45  aload_0 [this]
//     46  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     49  iconst_1
//     50  baload
//     51  bastore
//     52  aload_0 [this]
//     53  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     56  bipush 10
//     58  aload_0 [this]
//     59  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//     62  iconst_2
//     63  baload
//     64  bastore
//     65  aload_0 [this]
//     66  bipush 11
//     68  putfield sun.security.ssl.InputRecord.count : int [307]
//     71  aload_1 [arg0]
//     72  iconst_0
//     73  baload
//     74  sipush 255
//     77  iand
//     78  bipush 8
//     80  ishl
//     81  aload_1 [arg0]
//     82  iconst_1
//     83  baload
//     84  sipush 255
//     87  iand
//     88  iadd
//     89  istore_3
//     90  aload_1 [arg0]
//     91  iconst_2
//     92  baload
//     93  sipush 255
//     96  iand
//     97  bipush 8
//     99  ishl
//    100  aload_1 [arg0]
//    101  iconst_3
//    102  baload
//    103  sipush 255
//    106  iand
//    107  iadd
//    108  istore 4
//    110  aload_1 [arg0]
//    111  iconst_4
//    112  baload
//    113  sipush 255
//    116  iand
//    117  bipush 8
//    119  ishl
//    120  aload_1 [arg0]
//    121  iconst_5
//    122  baload
//    123  sipush 255
//    126  iand
//    127  iadd
//    128  istore 5
//    130  bipush 6
//    132  iload_3
//    133  iadd
//    134  iload 4
//    136  iadd
//    137  istore 6
//    139  iload 5
//    141  bipush 32
//    143  if_icmpge 210
//    146  iconst_0
//    147  istore_2
//    148  iload_2
//    149  bipush 32
//    151  iload 5
//    153  isub
//    154  if_icmpge 180
//    157  aload_0 [this]
//    158  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    161  aload_0 [this]
//    162  dup
//    163  getfield sun.security.ssl.InputRecord.count : int [307]
//    166  dup_x1
//    167  iconst_1
//    168  iadd
//    169  putfield sun.security.ssl.InputRecord.count : int [307]
//    172  iconst_0
//    173  bastore
//    174  iinc 2 1
//    177  goto 148
//    180  aload_1 [arg0]
//    181  iload 6
//    183  aload_0 [this]
//    184  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    187  aload_0 [this]
//    188  getfield sun.security.ssl.InputRecord.count : int [307]
//    191  iload 5
//    193  invokestatic java.lang.System.arraycopy(java.lang.Object, int, java.lang.Object, int, int) : void [341]
//    196  aload_0 [this]
//    197  dup
//    198  getfield sun.security.ssl.InputRecord.count : int [307]
//    201  iload 5
//    203  iadd
//    204  putfield sun.security.ssl.InputRecord.count : int [307]
//    207  goto 243
//    210  aload_1 [arg0]
//    211  iload 6
//    213  iload 5
//    215  bipush 32
//    217  isub
//    218  iadd
//    219  aload_0 [this]
//    220  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    223  aload_0 [this]
//    224  getfield sun.security.ssl.InputRecord.count : int [307]
//    227  bipush 32
//    229  invokestatic java.lang.System.arraycopy(java.lang.Object, int, java.lang.Object, int, int) : void [341]
//    232  aload_0 [this]
//    233  dup
//    234  getfield sun.security.ssl.InputRecord.count : int [307]
//    237  bipush 32
//    239  iadd
//    240  putfield sun.security.ssl.InputRecord.count : int [307]
//    243  iload 6
//    245  iload 4
//    247  isub
//    248  istore 6
//    250  aload_0 [this]
//    251  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    254  aload_0 [this]
//    255  dup
//    256  getfield sun.security.ssl.InputRecord.count : int [307]
//    259  dup_x1
//    260  iconst_1
//    261  iadd
//    262  putfield sun.security.ssl.InputRecord.count : int [307]
//    265  iload 4
//    267  i2b
//    268  bastore
//    269  aload_1 [arg0]
//    270  iload 6
//    272  aload_0 [this]
//    273  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    276  aload_0 [this]
//    277  getfield sun.security.ssl.InputRecord.count : int [307]
//    280  iload 4
//    282  invokestatic java.lang.System.arraycopy(java.lang.Object, int, java.lang.Object, int, int) : void [341]
//    285  aload_0 [this]
//    286  dup
//    287  getfield sun.security.ssl.InputRecord.count : int [307]
//    290  iload 4
//    292  iadd
//    293  putfield sun.security.ssl.InputRecord.count : int [307]
//    296  iload 6
//    298  iload_3
//    299  isub
//    300  istore 6
//    302  aload_0 [this]
//    303  getfield sun.security.ssl.InputRecord.count : int [307]
//    306  iconst_2
//    307  iadd
//    308  istore 7
//    310  iconst_0
//    311  istore_2
//    312  iload_2
//    313  iload_3
//    314  if_icmpge 371
//    317  aload_1 [arg0]
//    318  iload 6
//    320  iload_2
//    321  iadd
//    322  baload
//    323  ifeq 329
//    326  goto 365
//    329  aload_0 [this]
//    330  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    333  iload 7
//    335  iinc 7 1
//    338  aload_1 [arg0]
//    339  iload 6
//    341  iload_2
//    342  iadd
//    343  iconst_1
//    344  iadd
//    345  baload
//    346  bastore
//    347  aload_0 [this]
//    348  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    351  iload 7
//    353  iinc 7 1
//    356  aload_1 [arg0]
//    357  iload 6
//    359  iload_2
//    360  iadd
//    361  iconst_2
//    362  iadd
//    363  baload
//    364  bastore
//    365  iinc 2 3
//    368  goto 312
//    371  iload 7
//    373  aload_0 [this]
//    374  getfield sun.security.ssl.InputRecord.count : int [307]
//    377  iconst_2
//    378  iadd
//    379  isub
//    380  istore 7
//    382  aload_0 [this]
//    383  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    386  aload_0 [this]
//    387  dup
//    388  getfield sun.security.ssl.InputRecord.count : int [307]
//    391  dup_x1
//    392  iconst_1
//    393  iadd
//    394  putfield sun.security.ssl.InputRecord.count : int [307]
//    397  iload 7
//    399  bipush 8
//    401  iushr
//    402  i2b
//    403  bastore
//    404  aload_0 [this]
//    405  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    408  aload_0 [this]
//    409  dup
//    410  getfield sun.security.ssl.InputRecord.count : int [307]
//    413  dup_x1
//    414  iconst_1
//    415  iadd
//    416  putfield sun.security.ssl.InputRecord.count : int [307]
//    419  iload 7
//    421  i2b
//    422  bastore
//    423  aload_0 [this]
//    424  dup
//    425  getfield sun.security.ssl.InputRecord.count : int [307]
//    428  iload 7
//    430  iadd
//    431  putfield sun.security.ssl.InputRecord.count : int [307]
//    434  aload_0 [this]
//    435  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    438  aload_0 [this]
//    439  dup
//    440  getfield sun.security.ssl.InputRecord.count : int [307]
//    443  dup_x1
//    444  iconst_1
//    445  iadd
//    446  putfield sun.security.ssl.InputRecord.count : int [307]
//    449  iconst_1
//    450  bastore
//    451  aload_0 [this]
//    452  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    455  aload_0 [this]
//    456  dup
//    457  getfield sun.security.ssl.InputRecord.count : int [307]
//    460  dup_x1
//    461  iconst_1
//    462  iadd
//    463  putfield sun.security.ssl.InputRecord.count : int [307]
//    466  iconst_0
//    467  bastore
//    468  aload_0 [this]
//    469  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    472  iconst_3
//    473  aload_0 [this]
//    474  getfield sun.security.ssl.InputRecord.count : int [307]
//    477  iconst_5
//    478  isub
//    479  i2b
//    480  bastore
//    481  aload_0 [this]
//    482  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    485  iconst_4
//    486  aload_0 [this]
//    487  getfield sun.security.ssl.InputRecord.count : int [307]
//    490  iconst_5
//    491  isub
//    492  bipush 8
//    494  iushr
//    495  i2b
//    496  bastore
//    497  aload_0 [this]
//    498  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    501  bipush 6
//    503  iconst_0
//    504  bastore
//    505  aload_0 [this]
//    506  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    509  bipush 7
//    511  aload_0 [this]
//    512  getfield sun.security.ssl.InputRecord.count : int [307]
//    515  iconst_5
//    516  isub
//    517  iconst_4
//    518  isub
//    519  bipush 8
//    521  iushr
//    522  i2b
//    523  bastore
//    524  aload_0 [this]
//    525  getfield sun.security.ssl.InputRecord.buf : byte[] [315]
//    528  bipush 8
//    530  aload_0 [this]
//    531  getfield sun.security.ssl.InputRecord.count : int [307]
//    534  iconst_5
//    535  isub
//    536  iconst_4
//    537  isub
//    538  i2b
//    539  bastore
//    540  aload_0 [this]
//    541  iconst_5
//    542  putfield sun.security.ssl.InputRecord.pos : int [311]
//    545  return
//      Line numbers:
//        [pc: 0, line: 744]
//        [pc: 8, line: 745]
//        [pc: 20, line: 746]
//        [pc: 32, line: 753]
//        [pc: 39, line: 760]
//        [pc: 52, line: 761]
//        [pc: 65, line: 763]
//        [pc: 71, line: 770]
//        [pc: 90, line: 771]
//        [pc: 110, line: 772]
//        [pc: 130, line: 779]
//        [pc: 139, line: 781]
//        [pc: 146, line: 782]
//        [pc: 157, line: 783]
//        [pc: 174, line: 782]
//        [pc: 180, line: 784]
//        [pc: 196, line: 785]
//        [pc: 210, line: 787]
//        [pc: 232, line: 789]
//        [pc: 243, line: 795]
//        [pc: 250, line: 796]
//        [pc: 269, line: 798]
//        [pc: 285, line: 799]
//        [pc: 296, line: 817]
//        [pc: 302, line: 818]
//        [pc: 310, line: 820]
//        [pc: 317, line: 821]
//        [pc: 326, line: 822]
//        [pc: 329, line: 823]
//        [pc: 347, line: 824]
//        [pc: 365, line: 820]
//        [pc: 371, line: 827]
//        [pc: 382, line: 828]
//        [pc: 404, line: 829]
//        [pc: 423, line: 830]
//        [pc: 434, line: 835]
//        [pc: 451, line: 836]
//        [pc: 468, line: 842]
//        [pc: 481, line: 843]
//        [pc: 497, line: 845]
//        [pc: 505, line: 846]
//        [pc: 524, line: 847]
//        [pc: 540, line: 849]
//        [pc: 545, line: 850]
//      Stack map table: number of frames 8
//        [pc: 148, full, stack: {}, locals: {sun.security.ssl.InputRecord, byte[], int, int, int, int, int}]
//        [pc: 180, same]
//        [pc: 210, full, stack: {}, locals: {sun.security.ssl.InputRecord, byte[], _, int, int, int, int}]
//        [pc: 243, same]
//        [pc: 312, full, stack: {}, locals: {sun.security.ssl.InputRecord, byte[], int, int, int, int, int, int}]
//        [pc: 329, same]
//        [pc: 365, same]
//        [pc: 371, same]
//  
//  // Method descriptor #214 (I)Ljava/lang/String;
//  // Stack: 2, Locals: 1
//  static java.lang.String contentName(int arg0);
//     0  iload_0 [arg0]
//     1  tableswitch default: 44
//          case 20: 32
//          case 21: 35
//          case 22: 38
//          case 23: 41
//    32  ldc <String "Change Cipher Spec"> [13]
//    34  areturn
//    35  ldc <String "Alert"> [10]
//    37  areturn
//    38  ldc <String "Handshake"> [14]
//    40  areturn
//    41  ldc <String "Application Data"> [11]
//    43  areturn
//    44  new java.lang.StringBuilder [190]
//    47  dup
//    48  invokespecial java.lang.StringBuilder() [336]
//    51  ldc <String "contentType = "> [27]
//    53  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [340]
//    56  iload_0 [arg0]
//    57  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [338]
//    60  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [337]
//    63  areturn
//      Line numbers:
//        [pc: 0, line: 858]
//        [pc: 32, line: 860]
//        [pc: 35, line: 862]
//        [pc: 38, line: 864]
//        [pc: 41, line: 866]
//        [pc: 44, line: 868]
//      Stack map table: number of frames 5
//        [pc: 32, same]
//        [pc: 35, same]
//        [pc: 38, same]
//        [pc: 41, same]
//        [pc: 44, same]
//  
//  // Method descriptor #35 ()V
//  // Stack: 4, Locals: 0
//  static {};
//     0  ldc <String "ssl"> [31]
//     2  invokestatic sun.security.ssl.Debug.getInstance(java.lang.String) : sun.security.ssl.Debug [359]
//     5  putstatic sun.security.ssl.InputRecord.debug : sun.security.ssl.Debug [318]
//     8  iconst_5
//     9  newarray byte [8]
//    11  dup
//    12  iconst_0
//    13  bipush -128
//    15  bastore
//    16  dup
//    17  iconst_1
//    18  iconst_3
//    19  bastore
//    20  dup
//    21  iconst_2
//    22  iconst_0
//    23  bastore
//    24  dup
//    25  iconst_3
//    26  iconst_0
//    27  bastore
//    28  dup
//    29  iconst_4
//    30  iconst_1
//    31  bastore
//    32  putstatic sun.security.ssl.InputRecord.v2NoCipher : byte[] [317]
//    35  return
//      Line numbers:
//        [pc: 0, line: 69]
//        [pc: 8, line: 455]
//}