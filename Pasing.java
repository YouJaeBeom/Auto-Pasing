//
//// Compiled from SSLSocketImpl.java (version 1.8 : 52.0, super bit)
//public final class sun.security.ssl.SSLSocketImpl extends sun.security.ssl.BaseSSLSocketImpl {
//  
//  // Field descriptor #101 I
//  private static final int cs_START = 0;
//  
//  // Field descriptor #101 I
//  private static final int cs_HANDSHAKE = 1;
//  
//  // Field descriptor #101 I
//  private static final int cs_DATA = 2;
//  
//  // Field descriptor #101 I
//  private static final int cs_RENEGOTIATE = 3;
//  
//  // Field descriptor #101 I
//  private static final int cs_ERROR = 4;
//  
//  // Field descriptor #101 I
//  private static final int cs_SENT_CLOSE = 5;
//  
//  // Field descriptor #101 I
//  private static final int cs_CLOSED = 6;
//  
//  // Field descriptor #101 I
//  private static final int cs_APP_CLOSED = 7;
//  
//  // Field descriptor #101 I
//  private volatile int connectionState;
//  
//  // Field descriptor #123 Z
//  private boolean receivedCCS;
//  
//  // Field descriptor #123 Z
//  private boolean expectingFinished;
//  
//  // Field descriptor #555 Ljavax/net/ssl/SSLException;
//  private javax.net.ssl.SSLException closeReason;
//  
//  // Field descriptor #91 B
//  private byte doClientAuth;
//  
//  // Field descriptor #123 Z
//  private boolean roleIsServer;
//  
//  // Field descriptor #123 Z
//  private boolean enableSessionCreation;
//  
//  // Field descriptor #547 Ljava/lang/String;
//  private java.lang.String host;
//  
//  // Field descriptor #123 Z
//  private boolean autoClose;
//  
//  // Field descriptor #548 Ljava/security/AccessControlContext;
//  private java.security.AccessControlContext acc;
//  
//  // Field descriptor #560 Lsun/security/ssl/CipherSuiteList;
//  private sun.security.ssl.CipherSuiteList enabledCipherSuites;
//  
//  // Field descriptor #547 Ljava/lang/String;
//  private java.lang.String identificationProtocol;
//  
//  // Field descriptor #549 Ljava/security/AlgorithmConstraints;
//  private java.security.AlgorithmConstraints algorithmConstraints;
//  
//  // Field descriptor #552 Ljava/util/List;
//  // Signature: Ljava/util/List<Ljavax/net/ssl/SNIServerName;>;
//  java.util.List serverNames;
//  
//  // Field descriptor #550 Ljava/util/Collection;
//  // Signature: Ljava/util/Collection<Ljavax/net/ssl/SNIMatcher;>;
//  java.util.Collection sniMatchers;
//  
//  // Field descriptor #123 Z
//  private boolean noSniExtension;
//  
//  // Field descriptor #123 Z
//  private boolean noSniMatcher;
//  
//  // Field descriptor #546 Ljava/lang/Object;
//  private final java.lang.Object handshakeLock;
//  
//  // Field descriptor #554 Ljava/util/concurrent/locks/ReentrantLock;
//  final java.util.concurrent.locks.ReentrantLock writeLock;
//  
//  // Field descriptor #546 Ljava/lang/Object;
//  private final java.lang.Object readLock;
//  
//  // Field descriptor #564 Lsun/security/ssl/InputRecord;
//  private sun.security.ssl.InputRecord inrec;
//  
//  // Field descriptor #558 Lsun/security/ssl/Authenticator;
//  private sun.security.ssl.Authenticator readAuthenticator;
//  
//  // Field descriptor #558 Lsun/security/ssl/Authenticator;
//  private sun.security.ssl.Authenticator writeAuthenticator;
//  
//  // Field descriptor #559 Lsun/security/ssl/CipherBox;
//  private sun.security.ssl.CipherBox readCipher;
//  
//  // Field descriptor #559 Lsun/security/ssl/CipherBox;
//  private sun.security.ssl.CipherBox writeCipher;
//  
//  // Field descriptor #123 Z
//  private boolean secureRenegotiation;
//  
//  // Field descriptor #125 [B
//  private byte[] clientVerifyData;
//  
//  // Field descriptor #125 [B
//  private byte[] serverVerifyData;
//  
//  // Field descriptor #569 Lsun/security/ssl/SSLContextImpl;
//  private sun.security.ssl.SSLContextImpl sslContext;
//  
//  // Field descriptor #563 Lsun/security/ssl/Handshaker;
//  private sun.security.ssl.Handshaker handshaker;
//  
//  // Field descriptor #570 Lsun/security/ssl/SSLSessionImpl;
//  private sun.security.ssl.SSLSessionImpl sess;
//  
//  // Field descriptor #570 Lsun/security/ssl/SSLSessionImpl;
//  private volatile sun.security.ssl.SSLSessionImpl handshakeSession;
//  
//  // Field descriptor #551 Ljava/util/HashMap;
//  // Signature: Ljava/util/HashMap<Ljavax/net/ssl/HandshakeCompletedListener;Ljava/security/AccessControlContext;>;
//  private java.util.HashMap handshakeListeners;
//  
//  // Field descriptor #543 Ljava/io/InputStream;
//  private java.io.InputStream sockInput;
//  
//  // Field descriptor #544 Ljava/io/OutputStream;
//  private java.io.OutputStream sockOutput;
//  
//  // Field descriptor #556 Lsun/security/ssl/AppInputStream;
//  private sun.security.ssl.AppInputStream input;
//  
//  // Field descriptor #557 Lsun/security/ssl/AppOutputStream;
//  private sun.security.ssl.AppOutputStream output;
//  
//  // Field descriptor #567 Lsun/security/ssl/ProtocolList;
//  private sun.security.ssl.ProtocolList enabledProtocols;
//  
//  // Field descriptor #568 Lsun/security/ssl/ProtocolVersion;
//  private sun.security.ssl.ProtocolVersion protocolVersion;
//  
//  // Field descriptor #561 Lsun/security/ssl/Debug;
//  private static final sun.security.ssl.Debug debug;
//  
//  // Field descriptor #123 Z
//  private boolean isFirstAppOutputRecord;
//  
//  // Field descriptor #542 Ljava/io/ByteArrayOutputStream;
//  private java.io.ByteArrayOutputStream heldRecordBuffer;
//  
//  // Field descriptor #123 Z
//  private boolean preferLocalCipherSuites;
//  
//  // Field descriptor #123 Z
//  static final boolean trustNameService;
//  
//  // Field descriptor #123 Z
//  static final synthetic boolean $assertionsDisabled;
//  
//  // Method descriptor #642 (Lsun/security/ssl/SSLContextImpl;Ljava/lang/String;I)V
//  // Stack: 4, Locals: 5
//  SSLSocketImpl(sun.security.ssl.SSLContextImpl arg0, java.lang.String arg1, int arg2) throws java.io.IOException, java.net.UnknownHostException;
//      0  aload_0 [this]
//      1  invokespecial sun.security.ssl.BaseSSLSocketImpl() [1029]
//      4  aload_0 [this]
//      5  iconst_1
//      6  putfield sun.security.ssl.SSLSocketImpl.enableSessionCreation : boolean [913]
//      9  aload_0 [this]
//     10  iconst_1
//     11  putfield sun.security.ssl.SSLSocketImpl.autoClose : boolean [912]
//     14  aload_0 [this]
//     15  aconst_null
//     16  putfield sun.security.ssl.SSLSocketImpl.identificationProtocol : java.lang.String [932]
//     19  aload_0 [this]
//     20  aconst_null
//     21  putfield sun.security.ssl.SSLSocketImpl.algorithmConstraints : java.security.AlgorithmConstraints [934]
//     24  aload_0 [this]
//     25  invokestatic java.util.Collections.emptyList() : java.util.List [994]
//     28  putfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//     31  aload_0 [this]
//     32  invokestatic java.util.Collections.emptyList() : java.util.List [994]
//     35  putfield sun.security.ssl.SSLSocketImpl.sniMatchers : java.util.Collection [935]
//     38  aload_0 [this]
//     39  iconst_0
//     40  putfield sun.security.ssl.SSLSocketImpl.noSniExtension : boolean [916]
//     43  aload_0 [this]
//     44  iconst_0
//     45  putfield sun.security.ssl.SSLSocketImpl.noSniMatcher : boolean [917]
//     48  aload_0 [this]
//     49  new java.lang.Object [489]
//     52  dup
//     53  invokespecial java.lang.Object() [968]
//     56  putfield sun.security.ssl.SSLSocketImpl.handshakeLock : java.lang.Object [929]
//     59  aload_0 [this]
//     60  new java.util.concurrent.locks.ReentrantLock [511]
//     63  dup
//     64  invokespecial java.util.concurrent.locks.ReentrantLock() [1000]
//     67  putfield sun.security.ssl.SSLSocketImpl.writeLock : java.util.concurrent.locks.ReentrantLock [938]
//     70  aload_0 [this]
//     71  new java.lang.Object [489]
//     74  dup
//     75  invokespecial java.lang.Object() [968]
//     78  putfield sun.security.ssl.SSLSocketImpl.readLock : java.lang.Object [930]
//     81  aload_0 [this]
//     82  getstatic sun.security.ssl.ProtocolVersion.DEFAULT : sun.security.ssl.ProtocolVersion [905]
//     85  putfield sun.security.ssl.SSLSocketImpl.protocolVersion : sun.security.ssl.ProtocolVersion [951]
//     88  aload_0 [this]
//     89  iconst_1
//     90  putfield sun.security.ssl.SSLSocketImpl.isFirstAppOutputRecord : boolean [915]
//     93  aload_0 [this]
//     94  aconst_null
//     95  putfield sun.security.ssl.SSLSocketImpl.heldRecordBuffer : java.io.ByteArrayOutputStream [926]
//     98  aload_0 [this]
//     99  iconst_0
//    100  putfield sun.security.ssl.SSLSocketImpl.preferLocalCipherSuites : boolean [918]
//    103  aload_0 [this]
//    104  aload_2 [arg1]
//    105  putfield sun.security.ssl.SSLSocketImpl.host : java.lang.String [931]
//    108  aload_0 [this]
//    109  aload_0 [this]
//    110  getfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//    113  aload_0 [this]
//    114  getfield sun.security.ssl.SSLSocketImpl.host : java.lang.String [931]
//    117  invokestatic sun.security.ssl.Utilities.addToSNIServerNameList(java.util.List, java.lang.String) : java.util.List [1147]
//    120  putfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//    123  aload_0 [this]
//    124  aload_1 [arg0]
//    125  iconst_0
//    126  invokespecial sun.security.ssl.SSLSocketImpl.init(sun.security.ssl.SSLContextImpl, boolean) : void [1142]
//    129  aload_2 [arg1]
//    130  ifnull 145
//    133  new java.net.InetSocketAddress [498]
//    136  dup
//    137  aload_2 [arg1]
//    138  iload_3 [arg2]
//    139  invokespecial java.net.InetSocketAddress(java.lang.String, int) [989]
//    142  goto 157
//    145  new java.net.InetSocketAddress [498]
//    148  dup
//    149  aconst_null
//    150  invokestatic java.net.InetAddress.getByName(java.lang.String) : java.net.InetAddress [988]
//    153  iload_3 [arg2]
//    154  invokespecial java.net.InetSocketAddress(java.net.InetAddress, int) [990]
//    157  astore 4
//    159  aload_0 [this]
//    160  aload 4
//    162  iconst_0
//    163  invokevirtual sun.security.ssl.SSLSocketImpl.connect(java.net.SocketAddress, int) : void [1135]
//    166  return
//      Line numbers:
//        [pc: 0, line: 424]
//        [pc: 4, line: 204]
//        [pc: 9, line: 206]
//        [pc: 14, line: 213]
//        [pc: 19, line: 216]
//        [pc: 24, line: 219]
//        [pc: 25, line: 220]
//        [pc: 31, line: 221]
//        [pc: 32, line: 222]
//        [pc: 38, line: 224]
//        [pc: 43, line: 227]
//        [pc: 48, line: 300]
//        [pc: 59, line: 301]
//        [pc: 70, line: 302]
//        [pc: 81, line: 378]
//        [pc: 88, line: 386]
//        [pc: 93, line: 392]
//        [pc: 98, line: 398]
//        [pc: 103, line: 425]
//        [pc: 108, line: 426]
//        [pc: 117, line: 427]
//        [pc: 123, line: 428]
//        [pc: 129, line: 429]
//        [pc: 150, line: 431]
//        [pc: 159, line: 432]
//        [pc: 166, line: 433]
//      Stack map table: number of frames 2
//        [pc: 145, full, stack: {}, locals: {sun.security.ssl.SSLSocketImpl, sun.security.ssl.SSLContextImpl, java.lang.String, int}]
//        [pc: 157, same_locals_1_stack_item, stack: {java.net.SocketAddress}]
//  
//  // Method descriptor #650 (Lsun/security/ssl/SSLContextImpl;Ljava/net/InetAddress;I)V
//  // Stack: 4, Locals: 5
//  SSLSocketImpl(sun.security.ssl.SSLContextImpl arg0, java.net.InetAddress arg1, int arg2) throws java.io.IOException;
//      0  aload_0 [this]
//      1  invokespecial sun.security.ssl.BaseSSLSocketImpl() [1029]
//      4  aload_0 [this]
//      5  iconst_1
//      6  putfield sun.security.ssl.SSLSocketImpl.enableSessionCreation : boolean [913]
//      9  aload_0 [this]
//     10  iconst_1
//     11  putfield sun.security.ssl.SSLSocketImpl.autoClose : boolean [912]
//     14  aload_0 [this]
//     15  aconst_null
//     16  putfield sun.security.ssl.SSLSocketImpl.identificationProtocol : java.lang.String [932]
//     19  aload_0 [this]
//     20  aconst_null
//     21  putfield sun.security.ssl.SSLSocketImpl.algorithmConstraints : java.security.AlgorithmConstraints [934]
//     24  aload_0 [this]
//     25  invokestatic java.util.Collections.emptyList() : java.util.List [994]
//     28  putfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//     31  aload_0 [this]
//     32  invokestatic java.util.Collections.emptyList() : java.util.List [994]
//     35  putfield sun.security.ssl.SSLSocketImpl.sniMatchers : java.util.Collection [935]
//     38  aload_0 [this]
//     39  iconst_0
//     40  putfield sun.security.ssl.SSLSocketImpl.noSniExtension : boolean [916]
//     43  aload_0 [this]
//     44  iconst_0
//     45  putfield sun.security.ssl.SSLSocketImpl.noSniMatcher : boolean [917]
//     48  aload_0 [this]
//     49  new java.lang.Object [489]
//     52  dup
//     53  invokespecial java.lang.Object() [968]
//     56  putfield sun.security.ssl.SSLSocketImpl.handshakeLock : java.lang.Object [929]
//     59  aload_0 [this]
//     60  new java.util.concurrent.locks.ReentrantLock [511]
//     63  dup
//     64  invokespecial java.util.concurrent.locks.ReentrantLock() [1000]
//     67  putfield sun.security.ssl.SSLSocketImpl.writeLock : java.util.concurrent.locks.ReentrantLock [938]
//     70  aload_0 [this]
//     71  new java.lang.Object [489]
//     74  dup
//     75  invokespecial java.lang.Object() [968]
//     78  putfield sun.security.ssl.SSLSocketImpl.readLock : java.lang.Object [930]
//     81  aload_0 [this]
//     82  getstatic sun.security.ssl.ProtocolVersion.DEFAULT : sun.security.ssl.ProtocolVersion [905]
//     85  putfield sun.security.ssl.SSLSocketImpl.protocolVersion : sun.security.ssl.ProtocolVersion [951]
//     88  aload_0 [this]
//     89  iconst_1
//     90  putfield sun.security.ssl.SSLSocketImpl.isFirstAppOutputRecord : boolean [915]
//     93  aload_0 [this]
//     94  aconst_null
//     95  putfield sun.security.ssl.SSLSocketImpl.heldRecordBuffer : java.io.ByteArrayOutputStream [926]
//     98  aload_0 [this]
//     99  iconst_0
//    100  putfield sun.security.ssl.SSLSocketImpl.preferLocalCipherSuites : boolean [918]
//    103  aload_0 [this]
//    104  aload_1 [arg0]
//    105  iconst_0
//    106  invokespecial sun.security.ssl.SSLSocketImpl.init(sun.security.ssl.SSLContextImpl, boolean) : void [1142]
//    109  new java.net.InetSocketAddress [498]
//    112  dup
//    113  aload_2 [arg1]
//    114  iload_3 [arg2]
//    115  invokespecial java.net.InetSocketAddress(java.net.InetAddress, int) [990]
//    118  astore 4
//    120  aload_0 [this]
//    121  aload 4
//    123  iconst_0
//    124  invokevirtual sun.security.ssl.SSLSocketImpl.connect(java.net.SocketAddress, int) : void [1135]
//    127  return
//      Line numbers:
//        [pc: 0, line: 448]
//        [pc: 4, line: 204]
//        [pc: 9, line: 206]
//        [pc: 14, line: 213]
//        [pc: 19, line: 216]
//        [pc: 24, line: 219]
//        [pc: 25, line: 220]
//        [pc: 31, line: 221]
//        [pc: 32, line: 222]
//        [pc: 38, line: 224]
//        [pc: 43, line: 227]
//        [pc: 48, line: 300]
//        [pc: 59, line: 301]
//        [pc: 70, line: 302]
//        [pc: 81, line: 378]
//        [pc: 88, line: 386]
//        [pc: 93, line: 392]
//        [pc: 98, line: 398]
//        [pc: 103, line: 449]
//        [pc: 109, line: 450]
//        [pc: 120, line: 451]
//        [pc: 127, line: 452]
//  
//  // Method descriptor #659 (Lsun/security/ssl/SSLContextImpl;Ljava/lang/String;ILjava/net/InetAddress;I)V
//  // Stack: 5, Locals: 7
//  SSLSocketImpl(sun.security.ssl.SSLContextImpl arg0, java.lang.String arg1, int arg2, java.net.InetAddress arg3, int arg4) throws java.io.IOException, java.net.UnknownHostException;
//      0  aload_0 [this]
//      1  invokespecial sun.security.ssl.BaseSSLSocketImpl() [1029]
//      4  aload_0 [this]
//      5  iconst_1
//      6  putfield sun.security.ssl.SSLSocketImpl.enableSessionCreation : boolean [913]
//      9  aload_0 [this]
//     10  iconst_1
//     11  putfield sun.security.ssl.SSLSocketImpl.autoClose : boolean [912]
//     14  aload_0 [this]
//     15  aconst_null
//     16  putfield sun.security.ssl.SSLSocketImpl.identificationProtocol : java.lang.String [932]
//     19  aload_0 [this]
//     20  aconst_null
//     21  putfield sun.security.ssl.SSLSocketImpl.algorithmConstraints : java.security.AlgorithmConstraints [934]
//     24  aload_0 [this]
//     25  invokestatic java.util.Collections.emptyList() : java.util.List [994]
//     28  putfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//     31  aload_0 [this]
//     32  invokestatic java.util.Collections.emptyList() : java.util.List [994]
//     35  putfield sun.security.ssl.SSLSocketImpl.sniMatchers : java.util.Collection [935]
//     38  aload_0 [this]
//     39  iconst_0
//     40  putfield sun.security.ssl.SSLSocketImpl.noSniExtension : boolean [916]
//     43  aload_0 [this]
//     44  iconst_0
//     45  putfield sun.security.ssl.SSLSocketImpl.noSniMatcher : boolean [917]
//     48  aload_0 [this]
//     49  new java.lang.Object [489]
//     52  dup
//     53  invokespecial java.lang.Object() [968]
//     56  putfield sun.security.ssl.SSLSocketImpl.handshakeLock : java.lang.Object [929]
//     59  aload_0 [this]
//     60  new java.util.concurrent.locks.ReentrantLock [511]
//     63  dup
//     64  invokespecial java.util.concurrent.locks.ReentrantLock() [1000]
//     67  putfield sun.security.ssl.SSLSocketImpl.writeLock : java.util.concurrent.locks.ReentrantLock [938]
//     70  aload_0 [this]
//     71  new java.lang.Object [489]
//     74  dup
//     75  invokespecial java.lang.Object() [968]
//     78  putfield sun.security.ssl.SSLSocketImpl.readLock : java.lang.Object [930]
//     81  aload_0 [this]
//     82  getstatic sun.security.ssl.ProtocolVersion.DEFAULT : sun.security.ssl.ProtocolVersion [905]
//     85  putfield sun.security.ssl.SSLSocketImpl.protocolVersion : sun.security.ssl.ProtocolVersion [951]
//     88  aload_0 [this]
//     89  iconst_1
//     90  putfield sun.security.ssl.SSLSocketImpl.isFirstAppOutputRecord : boolean [915]
//     93  aload_0 [this]
//     94  aconst_null
//     95  putfield sun.security.ssl.SSLSocketImpl.heldRecordBuffer : java.io.ByteArrayOutputStream [926]
//     98  aload_0 [this]
//     99  iconst_0
//    100  putfield sun.security.ssl.SSLSocketImpl.preferLocalCipherSuites : boolean [918]
//    103  aload_0 [this]
//    104  aload_2 [arg1]
//    105  putfield sun.security.ssl.SSLSocketImpl.host : java.lang.String [931]
//    108  aload_0 [this]
//    109  aload_0 [this]
//    110  getfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//    113  aload_0 [this]
//    114  getfield sun.security.ssl.SSLSocketImpl.host : java.lang.String [931]
//    117  invokestatic sun.security.ssl.Utilities.addToSNIServerNameList(java.util.List, java.lang.String) : java.util.List [1147]
//    120  putfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//    123  aload_0 [this]
//    124  aload_1 [arg0]
//    125  iconst_0
//    126  invokespecial sun.security.ssl.SSLSocketImpl.init(sun.security.ssl.SSLContextImpl, boolean) : void [1142]
//    129  aload_0 [this]
//    130  new java.net.InetSocketAddress [498]
//    133  dup
//    134  aload 4 [arg3]
//    136  iload 5 [arg4]
//    138  invokespecial java.net.InetSocketAddress(java.net.InetAddress, int) [990]
//    141  invokevirtual sun.security.ssl.SSLSocketImpl.bind(java.net.SocketAddress) : void [1134]
//    144  aload_2 [arg1]
//    145  ifnull 160
//    148  new java.net.InetSocketAddress [498]
//    151  dup
//    152  aload_2 [arg1]
//    153  iload_3 [arg2]
//    154  invokespecial java.net.InetSocketAddress(java.lang.String, int) [989]
//    157  goto 172
//    160  new java.net.InetSocketAddress [498]
//    163  dup
//    164  aconst_null
//    165  invokestatic java.net.InetAddress.getByName(java.lang.String) : java.net.InetAddress [988]
//    168  iload_3 [arg2]
//    169  invokespecial java.net.InetSocketAddress(java.net.InetAddress, int) [990]
//    172  astore 6
//    174  aload_0 [this]
//    175  aload 6
//    177  iconst_0
//    178  invokevirtual sun.security.ssl.SSLSocketImpl.connect(java.net.SocketAddress, int) : void [1135]
//    181  return
//      Line numbers:
//        [pc: 0, line: 468]
//        [pc: 4, line: 204]
//        [pc: 9, line: 206]
//        [pc: 14, line: 213]
//        [pc: 19, line: 216]
//        [pc: 24, line: 219]
//        [pc: 25, line: 220]
//        [pc: 31, line: 221]
//        [pc: 32, line: 222]
//        [pc: 38, line: 224]
//        [pc: 43, line: 227]
//        [pc: 48, line: 300]
//        [pc: 59, line: 301]
//        [pc: 70, line: 302]
//        [pc: 81, line: 378]
//        [pc: 88, line: 386]
//        [pc: 93, line: 392]
//        [pc: 98, line: 398]
//        [pc: 103, line: 469]
//        [pc: 108, line: 470]
//        [pc: 117, line: 471]
//        [pc: 123, line: 472]
//        [pc: 129, line: 473]
//        [pc: 144, line: 474]
//        [pc: 165, line: 476]
//        [pc: 174, line: 477]
//        [pc: 181, line: 478]
//      Stack map table: number of frames 2
//        [pc: 160, full, stack: {}, locals: {sun.security.ssl.SSLSocketImpl, sun.security.ssl.SSLContextImpl, java.lang.String, int, java.net.InetAddress, int}]
//        [pc: 172, same_locals_1_stack_item, stack: {java.net.SocketAddress}]
//  
//  // Method descriptor #660 (Lsun/security/ssl/SSLContextImpl;Ljava/net/InetAddress;ILjava/net/InetAddress;I)V
//  // Stack: 5, Locals: 7
//  SSLSocketImpl(sun.security.ssl.SSLContextImpl arg0, java.net.InetAddress arg1, int arg2, java.net.InetAddress arg3, int arg4) throws java.io.IOException;
//      0  aload_0 [this]
//      1  invokespecial sun.security.ssl.BaseSSLSocketImpl() [1029]
//      4  aload_0 [this]
//      5  iconst_1
//      6  putfield sun.security.ssl.SSLSocketImpl.enableSessionCreation : boolean [913]
//      9  aload_0 [this]
//     10  iconst_1
//     11  putfield sun.security.ssl.SSLSocketImpl.autoClose : boolean [912]
//     14  aload_0 [this]
//     15  aconst_null
//     16  putfield sun.security.ssl.SSLSocketImpl.identificationProtocol : java.lang.String [932]
//     19  aload_0 [this]
//     20  aconst_null
//     21  putfield sun.security.ssl.SSLSocketImpl.algorithmConstraints : java.security.AlgorithmConstraints [934]
//     24  aload_0 [this]
//     25  invokestatic java.util.Collections.emptyList() : java.util.List [994]
//     28  putfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//     31  aload_0 [this]
//     32  invokestatic java.util.Collections.emptyList() : java.util.List [994]
//     35  putfield sun.security.ssl.SSLSocketImpl.sniMatchers : java.util.Collection [935]
//     38  aload_0 [this]
//     39  iconst_0
//     40  putfield sun.security.ssl.SSLSocketImpl.noSniExtension : boolean [916]
//     43  aload_0 [this]
//     44  iconst_0
//     45  putfield sun.security.ssl.SSLSocketImpl.noSniMatcher : boolean [917]
//     48  aload_0 [this]
//     49  new java.lang.Object [489]
//     52  dup
//     53  invokespecial java.lang.Object() [968]
//     56  putfield sun.security.ssl.SSLSocketImpl.handshakeLock : java.lang.Object [929]
//     59  aload_0 [this]
//     60  new java.util.concurrent.locks.ReentrantLock [511]
//     63  dup
//     64  invokespecial java.util.concurrent.locks.ReentrantLock() [1000]
//     67  putfield sun.security.ssl.SSLSocketImpl.writeLock : java.util.concurrent.locks.ReentrantLock [938]
//     70  aload_0 [this]
//     71  new java.lang.Object [489]
//     74  dup
//     75  invokespecial java.lang.Object() [968]
//     78  putfield sun.security.ssl.SSLSocketImpl.readLock : java.lang.Object [930]
//     81  aload_0 [this]
//     82  getstatic sun.security.ssl.ProtocolVersion.DEFAULT : sun.security.ssl.ProtocolVersion [905]
//     85  putfield sun.security.ssl.SSLSocketImpl.protocolVersion : sun.security.ssl.ProtocolVersion [951]
//     88  aload_0 [this]
//     89  iconst_1
//     90  putfield sun.security.ssl.SSLSocketImpl.isFirstAppOutputRecord : boolean [915]
//     93  aload_0 [this]
//     94  aconst_null
//     95  putfield sun.security.ssl.SSLSocketImpl.heldRecordBuffer : java.io.ByteArrayOutputStream [926]
//     98  aload_0 [this]
//     99  iconst_0
//    100  putfield sun.security.ssl.SSLSocketImpl.preferLocalCipherSuites : boolean [918]
//    103  aload_0 [this]
//    104  aload_1 [arg0]
//    105  iconst_0
//    106  invokespecial sun.security.ssl.SSLSocketImpl.init(sun.security.ssl.SSLContextImpl, boolean) : void [1142]
//    109  aload_0 [this]
//    110  new java.net.InetSocketAddress [498]
//    113  dup
//    114  aload 4 [arg3]
//    116  iload 5 [arg4]
//    118  invokespecial java.net.InetSocketAddress(java.net.InetAddress, int) [990]
//    121  invokevirtual sun.security.ssl.SSLSocketImpl.bind(java.net.SocketAddress) : void [1134]
//    124  new java.net.InetSocketAddress [498]
//    127  dup
//    128  aload_2 [arg1]
//    129  iload_3 [arg2]
//    130  invokespecial java.net.InetSocketAddress(java.net.InetAddress, int) [990]
//    133  astore 6
//    135  aload_0 [this]
//    136  aload 6
//    138  iconst_0
//    139  invokevirtual sun.security.ssl.SSLSocketImpl.connect(java.net.SocketAddress, int) : void [1135]
//    142  return
//      Line numbers:
//        [pc: 0, line: 496]
//        [pc: 4, line: 204]
//        [pc: 9, line: 206]
//        [pc: 14, line: 213]
//        [pc: 19, line: 216]
//        [pc: 24, line: 219]
//        [pc: 25, line: 220]
//        [pc: 31, line: 221]
//        [pc: 32, line: 222]
//        [pc: 38, line: 224]
//        [pc: 43, line: 227]
//        [pc: 48, line: 300]
//        [pc: 59, line: 301]
//        [pc: 70, line: 302]
//        [pc: 81, line: 378]
//        [pc: 88, line: 386]
//        [pc: 93, line: 392]
//        [pc: 98, line: 398]
//        [pc: 103, line: 497]
//        [pc: 109, line: 498]
//        [pc: 124, line: 499]
//        [pc: 135, line: 500]
//        [pc: 142, line: 501]
//  
//  // Method descriptor #665 (Lsun/security/ssl/SSLContextImpl;ZLsun/security/ssl/CipherSuiteList;BZLsun/security/ssl/ProtocolList;Ljava/lang/String;Ljava/security/AlgorithmConstraints;Ljava/util/Collection;Z)V
//  // Signature: (Lsun/security/ssl/SSLContextImpl;ZLsun/security/ssl/CipherSuiteList;BZLsun/security/ssl/ProtocolList;Ljava/lang/String;Ljava/security/AlgorithmConstraints;Ljava/util/Collection<Ljavax/net/ssl/SNIMatcher;>;Z)V
//  // Stack: 3, Locals: 11
//  SSLSocketImpl(sun.security.ssl.SSLContextImpl arg0, boolean arg1, sun.security.ssl.CipherSuiteList arg2, byte arg3, boolean arg4, sun.security.ssl.ProtocolList arg5, java.lang.String arg6, java.security.AlgorithmConstraints arg7, java.util.Collection arg8, boolean arg9) throws java.io.IOException;
//      0  aload_0 [this]
//      1  invokespecial sun.security.ssl.BaseSSLSocketImpl() [1029]
//      4  aload_0 [this]
//      5  iconst_1
//      6  putfield sun.security.ssl.SSLSocketImpl.enableSessionCreation : boolean [913]
//      9  aload_0 [this]
//     10  iconst_1
//     11  putfield sun.security.ssl.SSLSocketImpl.autoClose : boolean [912]
//     14  aload_0 [this]
//     15  aconst_null
//     16  putfield sun.security.ssl.SSLSocketImpl.identificationProtocol : java.lang.String [932]
//     19  aload_0 [this]
//     20  aconst_null
//     21  putfield sun.security.ssl.SSLSocketImpl.algorithmConstraints : java.security.AlgorithmConstraints [934]
//     24  aload_0 [this]
//     25  invokestatic java.util.Collections.emptyList() : java.util.List [994]
//     28  putfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//     31  aload_0 [this]
//     32  invokestatic java.util.Collections.emptyList() : java.util.List [994]
//     35  putfield sun.security.ssl.SSLSocketImpl.sniMatchers : java.util.Collection [935]
//     38  aload_0 [this]
//     39  iconst_0
//     40  putfield sun.security.ssl.SSLSocketImpl.noSniExtension : boolean [916]
//     43  aload_0 [this]
//     44  iconst_0
//     45  putfield sun.security.ssl.SSLSocketImpl.noSniMatcher : boolean [917]
//     48  aload_0 [this]
//     49  new java.lang.Object [489]
//     52  dup
//     53  invokespecial java.lang.Object() [968]
//     56  putfield sun.security.ssl.SSLSocketImpl.handshakeLock : java.lang.Object [929]
//     59  aload_0 [this]
//     60  new java.util.concurrent.locks.ReentrantLock [511]
//     63  dup
//     64  invokespecial java.util.concurrent.locks.ReentrantLock() [1000]
//     67  putfield sun.security.ssl.SSLSocketImpl.writeLock : java.util.concurrent.locks.ReentrantLock [938]
//     70  aload_0 [this]
//     71  new java.lang.Object [489]
//     74  dup
//     75  invokespecial java.lang.Object() [968]
//     78  putfield sun.security.ssl.SSLSocketImpl.readLock : java.lang.Object [930]
//     81  aload_0 [this]
//     82  getstatic sun.security.ssl.ProtocolVersion.DEFAULT : sun.security.ssl.ProtocolVersion [905]
//     85  putfield sun.security.ssl.SSLSocketImpl.protocolVersion : sun.security.ssl.ProtocolVersion [951]
//     88  aload_0 [this]
//     89  iconst_1
//     90  putfield sun.security.ssl.SSLSocketImpl.isFirstAppOutputRecord : boolean [915]
//     93  aload_0 [this]
//     94  aconst_null
//     95  putfield sun.security.ssl.SSLSocketImpl.heldRecordBuffer : java.io.ByteArrayOutputStream [926]
//     98  aload_0 [this]
//     99  iconst_0
//    100  putfield sun.security.ssl.SSLSocketImpl.preferLocalCipherSuites : boolean [918]
//    103  aload_0 [this]
//    104  iload 4 [arg3]
//    106  putfield sun.security.ssl.SSLSocketImpl.doClientAuth : byte [909]
//    109  aload_0 [this]
//    110  iload 5 [arg4]
//    112  putfield sun.security.ssl.SSLSocketImpl.enableSessionCreation : boolean [913]
//    115  aload_0 [this]
//    116  aload 7 [arg6]
//    118  putfield sun.security.ssl.SSLSocketImpl.identificationProtocol : java.lang.String [932]
//    121  aload_0 [this]
//    122  aload 8 [arg7]
//    124  putfield sun.security.ssl.SSLSocketImpl.algorithmConstraints : java.security.AlgorithmConstraints [934]
//    127  aload_0 [this]
//    128  aload 9 [arg8]
//    130  putfield sun.security.ssl.SSLSocketImpl.sniMatchers : java.util.Collection [935]
//    133  aload_0 [this]
//    134  iload 10 [arg9]
//    136  putfield sun.security.ssl.SSLSocketImpl.preferLocalCipherSuites : boolean [918]
//    139  aload_0 [this]
//    140  aload_1 [arg0]
//    141  iload_2 [arg1]
//    142  invokespecial sun.security.ssl.SSLSocketImpl.init(sun.security.ssl.SSLContextImpl, boolean) : void [1142]
//    145  aload_0 [this]
//    146  aload_3 [arg2]
//    147  putfield sun.security.ssl.SSLSocketImpl.enabledCipherSuites : sun.security.ssl.CipherSuiteList [946]
//    150  aload_0 [this]
//    151  aload 6 [arg5]
//    153  putfield sun.security.ssl.SSLSocketImpl.enabledProtocols : sun.security.ssl.ProtocolList [950]
//    156  return
//      Line numbers:
//        [pc: 0, line: 517]
//        [pc: 4, line: 204]
//        [pc: 9, line: 206]
//        [pc: 14, line: 213]
//        [pc: 19, line: 216]
//        [pc: 24, line: 219]
//        [pc: 25, line: 220]
//        [pc: 31, line: 221]
//        [pc: 32, line: 222]
//        [pc: 38, line: 224]
//        [pc: 43, line: 227]
//        [pc: 48, line: 300]
//        [pc: 59, line: 301]
//        [pc: 70, line: 302]
//        [pc: 81, line: 378]
//        [pc: 88, line: 386]
//        [pc: 93, line: 392]
//        [pc: 98, line: 398]
//        [pc: 103, line: 518]
//        [pc: 109, line: 519]
//        [pc: 115, line: 520]
//        [pc: 121, line: 521]
//        [pc: 127, line: 522]
//        [pc: 133, line: 523]
//        [pc: 139, line: 524]
//        [pc: 145, line: 529]
//        [pc: 150, line: 530]
//        [pc: 156, line: 531]
//  
//  // Method descriptor #632 (Lsun/security/ssl/SSLContextImpl;)V
//  // Stack: 3, Locals: 2
//  SSLSocketImpl(sun.security.ssl.SSLContextImpl arg0);
//      0  aload_0 [this]
//      1  invokespecial sun.security.ssl.BaseSSLSocketImpl() [1029]
//      4  aload_0 [this]
//      5  iconst_1
//      6  putfield sun.security.ssl.SSLSocketImpl.enableSessionCreation : boolean [913]
//      9  aload_0 [this]
//     10  iconst_1
//     11  putfield sun.security.ssl.SSLSocketImpl.autoClose : boolean [912]
//     14  aload_0 [this]
//     15  aconst_null
//     16  putfield sun.security.ssl.SSLSocketImpl.identificationProtocol : java.lang.String [932]
//     19  aload_0 [this]
//     20  aconst_null
//     21  putfield sun.security.ssl.SSLSocketImpl.algorithmConstraints : java.security.AlgorithmConstraints [934]
//     24  aload_0 [this]
//     25  invokestatic java.util.Collections.emptyList() : java.util.List [994]
//     28  putfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//     31  aload_0 [this]
//     32  invokestatic java.util.Collections.emptyList() : java.util.List [994]
//     35  putfield sun.security.ssl.SSLSocketImpl.sniMatchers : java.util.Collection [935]
//     38  aload_0 [this]
//     39  iconst_0
//     40  putfield sun.security.ssl.SSLSocketImpl.noSniExtension : boolean [916]
//     43  aload_0 [this]
//     44  iconst_0
//     45  putfield sun.security.ssl.SSLSocketImpl.noSniMatcher : boolean [917]
//     48  aload_0 [this]
//     49  new java.lang.Object [489]
//     52  dup
//     53  invokespecial java.lang.Object() [968]
//     56  putfield sun.security.ssl.SSLSocketImpl.handshakeLock : java.lang.Object [929]
//     59  aload_0 [this]
//     60  new java.util.concurrent.locks.ReentrantLock [511]
//     63  dup
//     64  invokespecial java.util.concurrent.locks.ReentrantLock() [1000]
//     67  putfield sun.security.ssl.SSLSocketImpl.writeLock : java.util.concurrent.locks.ReentrantLock [938]
//     70  aload_0 [this]
//     71  new java.lang.Object [489]
//     74  dup
//     75  invokespecial java.lang.Object() [968]
//     78  putfield sun.security.ssl.SSLSocketImpl.readLock : java.lang.Object [930]
//     81  aload_0 [this]
//     82  getstatic sun.security.ssl.ProtocolVersion.DEFAULT : sun.security.ssl.ProtocolVersion [905]
//     85  putfield sun.security.ssl.SSLSocketImpl.protocolVersion : sun.security.ssl.ProtocolVersion [951]
//     88  aload_0 [this]
//     89  iconst_1
//     90  putfield sun.security.ssl.SSLSocketImpl.isFirstAppOutputRecord : boolean [915]
//     93  aload_0 [this]
//     94  aconst_null
//     95  putfield sun.security.ssl.SSLSocketImpl.heldRecordBuffer : java.io.ByteArrayOutputStream [926]
//     98  aload_0 [this]
//     99  iconst_0
//    100  putfield sun.security.ssl.SSLSocketImpl.preferLocalCipherSuites : boolean [918]
//    103  aload_0 [this]
//    104  aload_1 [arg0]
//    105  iconst_0
//    106  invokespecial sun.security.ssl.SSLSocketImpl.init(sun.security.ssl.SSLContextImpl, boolean) : void [1142]
//    109  return
//      Line numbers:
//        [pc: 0, line: 541]
//        [pc: 4, line: 204]
//        [pc: 9, line: 206]
//        [pc: 14, line: 213]
//        [pc: 19, line: 216]
//        [pc: 24, line: 219]
//        [pc: 25, line: 220]
//        [pc: 31, line: 221]
//        [pc: 32, line: 222]
//        [pc: 38, line: 224]
//        [pc: 43, line: 227]
//        [pc: 48, line: 300]
//        [pc: 59, line: 301]
//        [pc: 70, line: 302]
//        [pc: 81, line: 378]
//        [pc: 88, line: 386]
//        [pc: 93, line: 392]
//        [pc: 98, line: 398]
//        [pc: 103, line: 542]
//        [pc: 109, line: 543]
//  
//  // Method descriptor #658 (Lsun/security/ssl/SSLContextImpl;Ljava/net/Socket;Ljava/lang/String;IZ)V
//  // Stack: 3, Locals: 6
//  SSLSocketImpl(sun.security.ssl.SSLContextImpl arg0, java.net.Socket arg1, java.lang.String arg2, int arg3, boolean arg4) throws java.io.IOException;
//      0  aload_0 [this]
//      1  aload_2 [arg1]
//      2  invokespecial sun.security.ssl.BaseSSLSocketImpl(java.net.Socket) [1036]
//      5  aload_0 [this]
//      6  iconst_1
//      7  putfield sun.security.ssl.SSLSocketImpl.enableSessionCreation : boolean [913]
//     10  aload_0 [this]
//     11  iconst_1
//     12  putfield sun.security.ssl.SSLSocketImpl.autoClose : boolean [912]
//     15  aload_0 [this]
//     16  aconst_null
//     17  putfield sun.security.ssl.SSLSocketImpl.identificationProtocol : java.lang.String [932]
//     20  aload_0 [this]
//     21  aconst_null
//     22  putfield sun.security.ssl.SSLSocketImpl.algorithmConstraints : java.security.AlgorithmConstraints [934]
//     25  aload_0 [this]
//     26  invokestatic java.util.Collections.emptyList() : java.util.List [994]
//     29  putfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//     32  aload_0 [this]
//     33  invokestatic java.util.Collections.emptyList() : java.util.List [994]
//     36  putfield sun.security.ssl.SSLSocketImpl.sniMatchers : java.util.Collection [935]
//     39  aload_0 [this]
//     40  iconst_0
//     41  putfield sun.security.ssl.SSLSocketImpl.noSniExtension : boolean [916]
//     44  aload_0 [this]
//     45  iconst_0
//     46  putfield sun.security.ssl.SSLSocketImpl.noSniMatcher : boolean [917]
//     49  aload_0 [this]
//     50  new java.lang.Object [489]
//     53  dup
//     54  invokespecial java.lang.Object() [968]
//     57  putfield sun.security.ssl.SSLSocketImpl.handshakeLock : java.lang.Object [929]
//     60  aload_0 [this]
//     61  new java.util.concurrent.locks.ReentrantLock [511]
//     64  dup
//     65  invokespecial java.util.concurrent.locks.ReentrantLock() [1000]
//     68  putfield sun.security.ssl.SSLSocketImpl.writeLock : java.util.concurrent.locks.ReentrantLock [938]
//     71  aload_0 [this]
//     72  new java.lang.Object [489]
//     75  dup
//     76  invokespecial java.lang.Object() [968]
//     79  putfield sun.security.ssl.SSLSocketImpl.readLock : java.lang.Object [930]
//     82  aload_0 [this]
//     83  getstatic sun.security.ssl.ProtocolVersion.DEFAULT : sun.security.ssl.ProtocolVersion [905]
//     86  putfield sun.security.ssl.SSLSocketImpl.protocolVersion : sun.security.ssl.ProtocolVersion [951]
//     89  aload_0 [this]
//     90  iconst_1
//     91  putfield sun.security.ssl.SSLSocketImpl.isFirstAppOutputRecord : boolean [915]
//     94  aload_0 [this]
//     95  aconst_null
//     96  putfield sun.security.ssl.SSLSocketImpl.heldRecordBuffer : java.io.ByteArrayOutputStream [926]
//     99  aload_0 [this]
//    100  iconst_0
//    101  putfield sun.security.ssl.SSLSocketImpl.preferLocalCipherSuites : boolean [918]
//    104  aload_2 [arg1]
//    105  invokevirtual java.net.Socket.isConnected() : boolean [991]
//    108  ifne 121
//    111  new java.net.SocketException [501]
//    114  dup
//    115  ldc <String "Underlying socket is not connected"> [34]
//    117  invokespecial java.net.SocketException(java.lang.String) [992]
//    120  athrow
//    121  aload_0 [this]
//    122  aload_3 [arg2]
//    123  putfield sun.security.ssl.SSLSocketImpl.host : java.lang.String [931]
//    126  aload_0 [this]
//    127  aload_0 [this]
//    128  getfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//    131  aload_0 [this]
//    132  getfield sun.security.ssl.SSLSocketImpl.host : java.lang.String [931]
//    135  invokestatic sun.security.ssl.Utilities.addToSNIServerNameList(java.util.List, java.lang.String) : java.util.List [1147]
//    138  putfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//    141  aload_0 [this]
//    142  aload_1 [arg0]
//    143  iconst_0
//    144  invokespecial sun.security.ssl.SSLSocketImpl.init(sun.security.ssl.SSLContextImpl, boolean) : void [1142]
//    147  aload_0 [this]
//    148  iload 5 [arg4]
//    150  putfield sun.security.ssl.SSLSocketImpl.autoClose : boolean [912]
//    153  aload_0 [this]
//    154  invokevirtual sun.security.ssl.SSLSocketImpl.doneConnect() : void [1113]
//    157  return
//      Line numbers:
//        [pc: 0, line: 564]
//        [pc: 5, line: 204]
//        [pc: 10, line: 206]
//        [pc: 15, line: 213]
//        [pc: 20, line: 216]
//        [pc: 25, line: 219]
//        [pc: 26, line: 220]
//        [pc: 32, line: 221]
//        [pc: 33, line: 222]
//        [pc: 39, line: 224]
//        [pc: 44, line: 227]
//        [pc: 49, line: 300]
//        [pc: 60, line: 301]
//        [pc: 71, line: 302]
//        [pc: 82, line: 378]
//        [pc: 89, line: 386]
//        [pc: 94, line: 392]
//        [pc: 99, line: 398]
//        [pc: 104, line: 566]
//        [pc: 111, line: 567]
//        [pc: 121, line: 569]
//        [pc: 126, line: 570]
//        [pc: 135, line: 571]
//        [pc: 141, line: 572]
//        [pc: 147, line: 573]
//        [pc: 153, line: 574]
//        [pc: 157, line: 575]
//      Stack map table: number of frames 1
//        [pc: 121, full, stack: {}, locals: {sun.security.ssl.SSLSocketImpl, sun.security.ssl.SSLContextImpl, java.net.Socket, java.lang.String, int, int}]
//  
//  // Method descriptor #656 (Lsun/security/ssl/SSLContextImpl;Ljava/net/Socket;Ljava/io/InputStream;Z)V
//  // Stack: 3, Locals: 5
//  SSLSocketImpl(sun.security.ssl.SSLContextImpl arg0, java.net.Socket arg1, java.io.InputStream arg2, boolean arg3) throws java.io.IOException;
//      0  aload_0 [this]
//      1  aload_2 [arg1]
//      2  aload_3 [arg2]
//      3  invokespecial sun.security.ssl.BaseSSLSocketImpl(java.net.Socket, java.io.InputStream) [1043]
//      6  aload_0 [this]
//      7  iconst_1
//      8  putfield sun.security.ssl.SSLSocketImpl.enableSessionCreation : boolean [913]
//     11  aload_0 [this]
//     12  iconst_1
//     13  putfield sun.security.ssl.SSLSocketImpl.autoClose : boolean [912]
//     16  aload_0 [this]
//     17  aconst_null
//     18  putfield sun.security.ssl.SSLSocketImpl.identificationProtocol : java.lang.String [932]
//     21  aload_0 [this]
//     22  aconst_null
//     23  putfield sun.security.ssl.SSLSocketImpl.algorithmConstraints : java.security.AlgorithmConstraints [934]
//     26  aload_0 [this]
//     27  invokestatic java.util.Collections.emptyList() : java.util.List [994]
//     30  putfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//     33  aload_0 [this]
//     34  invokestatic java.util.Collections.emptyList() : java.util.List [994]
//     37  putfield sun.security.ssl.SSLSocketImpl.sniMatchers : java.util.Collection [935]
//     40  aload_0 [this]
//     41  iconst_0
//     42  putfield sun.security.ssl.SSLSocketImpl.noSniExtension : boolean [916]
//     45  aload_0 [this]
//     46  iconst_0
//     47  putfield sun.security.ssl.SSLSocketImpl.noSniMatcher : boolean [917]
//     50  aload_0 [this]
//     51  new java.lang.Object [489]
//     54  dup
//     55  invokespecial java.lang.Object() [968]
//     58  putfield sun.security.ssl.SSLSocketImpl.handshakeLock : java.lang.Object [929]
//     61  aload_0 [this]
//     62  new java.util.concurrent.locks.ReentrantLock [511]
//     65  dup
//     66  invokespecial java.util.concurrent.locks.ReentrantLock() [1000]
//     69  putfield sun.security.ssl.SSLSocketImpl.writeLock : java.util.concurrent.locks.ReentrantLock [938]
//     72  aload_0 [this]
//     73  new java.lang.Object [489]
//     76  dup
//     77  invokespecial java.lang.Object() [968]
//     80  putfield sun.security.ssl.SSLSocketImpl.readLock : java.lang.Object [930]
//     83  aload_0 [this]
//     84  getstatic sun.security.ssl.ProtocolVersion.DEFAULT : sun.security.ssl.ProtocolVersion [905]
//     87  putfield sun.security.ssl.SSLSocketImpl.protocolVersion : sun.security.ssl.ProtocolVersion [951]
//     90  aload_0 [this]
//     91  iconst_1
//     92  putfield sun.security.ssl.SSLSocketImpl.isFirstAppOutputRecord : boolean [915]
//     95  aload_0 [this]
//     96  aconst_null
//     97  putfield sun.security.ssl.SSLSocketImpl.heldRecordBuffer : java.io.ByteArrayOutputStream [926]
//    100  aload_0 [this]
//    101  iconst_0
//    102  putfield sun.security.ssl.SSLSocketImpl.preferLocalCipherSuites : boolean [918]
//    105  aload_2 [arg1]
//    106  invokevirtual java.net.Socket.isConnected() : boolean [991]
//    109  ifne 122
//    112  new java.net.SocketException [501]
//    115  dup
//    116  ldc <String "Underlying socket is not connected"> [34]
//    118  invokespecial java.net.SocketException(java.lang.String) [992]
//    121  athrow
//    122  aload_0 [this]
//    123  aload_1 [arg0]
//    124  iconst_1
//    125  invokespecial sun.security.ssl.SSLSocketImpl.init(sun.security.ssl.SSLContextImpl, boolean) : void [1142]
//    128  aload_0 [this]
//    129  iload 4 [arg3]
//    131  putfield sun.security.ssl.SSLSocketImpl.autoClose : boolean [912]
//    134  aload_0 [this]
//    135  invokevirtual sun.security.ssl.SSLSocketImpl.doneConnect() : void [1113]
//    138  return
//      Line numbers:
//        [pc: 0, line: 585]
//        [pc: 6, line: 204]
//        [pc: 11, line: 206]
//        [pc: 16, line: 213]
//        [pc: 21, line: 216]
//        [pc: 26, line: 219]
//        [pc: 27, line: 220]
//        [pc: 33, line: 221]
//        [pc: 34, line: 222]
//        [pc: 40, line: 224]
//        [pc: 45, line: 227]
//        [pc: 50, line: 300]
//        [pc: 61, line: 301]
//        [pc: 72, line: 302]
//        [pc: 83, line: 378]
//        [pc: 90, line: 386]
//        [pc: 95, line: 392]
//        [pc: 100, line: 398]
//        [pc: 105, line: 587]
//        [pc: 112, line: 588]
//        [pc: 122, line: 594]
//        [pc: 128, line: 595]
//        [pc: 134, line: 596]
//        [pc: 138, line: 597]
//      Stack map table: number of frames 1
//        [pc: 122, full, stack: {}, locals: {sun.security.ssl.SSLSocketImpl, sun.security.ssl.SSLContextImpl, java.net.Socket, java.io.InputStream, int}]
//  
//  // Method descriptor #633 (Lsun/security/ssl/SSLContextImpl;Z)V
//  // Stack: 4, Locals: 3
//  private void init(sun.security.ssl.SSLContextImpl arg0, boolean arg1);
//      0  aload_0 [this]
//      1  aload_1 [arg0]
//      2  putfield sun.security.ssl.SSLSocketImpl.sslContext : sun.security.ssl.SSLContextImpl [952]
//      5  aload_0 [this]
//      6  getstatic sun.security.ssl.SSLSessionImpl.nullSession : sun.security.ssl.SSLSessionImpl [908]
//      9  putfield sun.security.ssl.SSLSocketImpl.sess : sun.security.ssl.SSLSessionImpl [954]
//     12  aload_0 [this]
//     13  aconst_null
//     14  putfield sun.security.ssl.SSLSocketImpl.handshakeSession : sun.security.ssl.SSLSessionImpl [953]
//     17  aload_0 [this]
//     18  iload_2 [arg1]
//     19  putfield sun.security.ssl.SSLSocketImpl.roleIsServer : boolean [921]
//     22  aload_0 [this]
//     23  iconst_0
//     24  putfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//     27  aload_0 [this]
//     28  iconst_0
//     29  putfield sun.security.ssl.SSLSocketImpl.receivedCCS : boolean [919]
//     32  aload_0 [this]
//     33  getstatic sun.security.ssl.CipherBox.NULL : sun.security.ssl.CipherBox [898]
//     36  putfield sun.security.ssl.SSLSocketImpl.readCipher : sun.security.ssl.CipherBox [944]
//     39  aload_0 [this]
//     40  getstatic sun.security.ssl.MAC.NULL : sun.security.ssl.MAC [903]
//     43  putfield sun.security.ssl.SSLSocketImpl.readAuthenticator : sun.security.ssl.Authenticator [942]
//     46  aload_0 [this]
//     47  getstatic sun.security.ssl.CipherBox.NULL : sun.security.ssl.CipherBox [898]
//     50  putfield sun.security.ssl.SSLSocketImpl.writeCipher : sun.security.ssl.CipherBox [945]
//     53  aload_0 [this]
//     54  getstatic sun.security.ssl.MAC.NULL : sun.security.ssl.MAC [903]
//     57  putfield sun.security.ssl.SSLSocketImpl.writeAuthenticator : sun.security.ssl.Authenticator [943]
//     60  aload_0 [this]
//     61  iconst_0
//     62  putfield sun.security.ssl.SSLSocketImpl.secureRenegotiation : boolean [922]
//     65  aload_0 [this]
//     66  iconst_0
//     67  newarray byte [8]
//     69  putfield sun.security.ssl.SSLSocketImpl.clientVerifyData : byte[] [924]
//     72  aload_0 [this]
//     73  iconst_0
//     74  newarray byte [8]
//     76  putfield sun.security.ssl.SSLSocketImpl.serverVerifyData : byte[] [925]
//     79  aload_0 [this]
//     80  aload_0 [this]
//     81  getfield sun.security.ssl.SSLSocketImpl.sslContext : sun.security.ssl.SSLContextImpl [952]
//     84  aload_0 [this]
//     85  getfield sun.security.ssl.SSLSocketImpl.roleIsServer : boolean [921]
//     88  invokevirtual sun.security.ssl.SSLContextImpl.getDefaultCipherSuiteList(boolean) : sun.security.ssl.CipherSuiteList [1101]
//     91  putfield sun.security.ssl.SSLSocketImpl.enabledCipherSuites : sun.security.ssl.CipherSuiteList [946]
//     94  aload_0 [this]
//     95  aload_0 [this]
//     96  getfield sun.security.ssl.SSLSocketImpl.sslContext : sun.security.ssl.SSLContextImpl [952]
//     99  aload_0 [this]
//    100  getfield sun.security.ssl.SSLSocketImpl.roleIsServer : boolean [921]
//    103  invokevirtual sun.security.ssl.SSLContextImpl.getDefaultProtocolList(boolean) : sun.security.ssl.ProtocolList [1104]
//    106  putfield sun.security.ssl.SSLSocketImpl.enabledProtocols : sun.security.ssl.ProtocolList [950]
//    109  aload_0 [this]
//    110  aconst_null
//    111  putfield sun.security.ssl.SSLSocketImpl.inrec : sun.security.ssl.InputRecord [949]
//    114  aload_0 [this]
//    115  invokestatic java.security.AccessController.getContext() : java.security.AccessControlContext [993]
//    118  putfield sun.security.ssl.SSLSocketImpl.acc : java.security.AccessControlContext [933]
//    121  aload_0 [this]
//    122  new sun.security.ssl.AppInputStream [521]
//    125  dup
//    126  aload_0 [this]
//    127  invokespecial sun.security.ssl.AppInputStream(sun.security.ssl.SSLSocketImpl) [1025]
//    130  putfield sun.security.ssl.SSLSocketImpl.input : sun.security.ssl.AppInputStream [940]
//    133  aload_0 [this]
//    134  new sun.security.ssl.AppOutputStream [522]
//    137  dup
//    138  aload_0 [this]
//    139  invokespecial sun.security.ssl.AppOutputStream(sun.security.ssl.SSLSocketImpl) [1026]
//    142  putfield sun.security.ssl.SSLSocketImpl.output : sun.security.ssl.AppOutputStream [941]
//    145  return
//      Line numbers:
//        [pc: 0, line: 603]
//        [pc: 5, line: 604]
//        [pc: 12, line: 605]
//        [pc: 17, line: 611]
//        [pc: 22, line: 612]
//        [pc: 27, line: 613]
//        [pc: 32, line: 620]
//        [pc: 39, line: 621]
//        [pc: 46, line: 622]
//        [pc: 53, line: 623]
//        [pc: 60, line: 626]
//        [pc: 65, line: 627]
//        [pc: 72, line: 628]
//        [pc: 79, line: 630]
//        [pc: 88, line: 631]
//        [pc: 94, line: 632]
//        [pc: 103, line: 633]
//        [pc: 109, line: 635]
//        [pc: 114, line: 638]
//        [pc: 121, line: 640]
//        [pc: 133, line: 641]
//        [pc: 145, line: 642]
//  
//  // Method descriptor #597 (Ljava/net/SocketAddress;I)V
//  // Stack: 3, Locals: 3
//  public void connect(java.net.SocketAddress arg0, int arg1) throws java.io.IOException;
//     0  aload_0 [this]
//     1  invokevirtual sun.security.ssl.SSLSocketImpl.isLayered() : boolean [1121]
//     4  ifeq 17
//     7  new java.net.SocketException [501]
//    10  dup
//    11  ldc <String "Already connected"> [16]
//    13  invokespecial java.net.SocketException(java.lang.String) [992]
//    16  athrow
//    17  aload_1 [arg0]
//    18  instanceof java.net.InetSocketAddress [498]
//    21  ifne 34
//    24  new java.net.SocketException [501]
//    27  dup
//    28  ldc <String "Cannot handle non-Inet socket addresses."> [17]
//    30  invokespecial java.net.SocketException(java.lang.String) [992]
//    33  athrow
//    34  aload_0 [this]
//    35  aload_1 [arg0]
//    36  iload_2 [arg1]
//    37  invokespecial sun.security.ssl.BaseSSLSocketImpl.connect(java.net.SocketAddress, int) : void [1040]
//    40  aload_0 [this]
//    41  getfield sun.security.ssl.SSLSocketImpl.host : java.lang.String [931]
//    44  ifnull 57
//    47  aload_0 [this]
//    48  getfield sun.security.ssl.SSLSocketImpl.host : java.lang.String [931]
//    51  invokevirtual java.lang.String.length() : int [971]
//    54  ifne 62
//    57  aload_0 [this]
//    58  iconst_0
//    59  invokespecial sun.security.ssl.SSLSocketImpl.useImplicitHost(boolean) : void [1128]
//    62  aload_0 [this]
//    63  invokevirtual sun.security.ssl.SSLSocketImpl.doneConnect() : void [1113]
//    66  return
//      Line numbers:
//        [pc: 0, line: 664]
//        [pc: 7, line: 665]
//        [pc: 17, line: 668]
//        [pc: 24, line: 669]
//        [pc: 34, line: 673]
//        [pc: 40, line: 675]
//        [pc: 57, line: 676]
//        [pc: 62, line: 679]
//        [pc: 66, line: 680]
//      Stack map table: number of frames 4
//        [pc: 17, same]
//        [pc: 34, same]
//        [pc: 57, same]
//        [pc: 62, same]
//  
//  // Method descriptor #50 ()V
//  // Stack: 2, Locals: 1
//  void doneConnect() throws java.io.IOException;
//     0  aload_0 [this]
//     1  aload_0 [this]
//     2  invokespecial sun.security.ssl.BaseSSLSocketImpl.getInputStream() : java.io.InputStream [1033]
//     5  putfield sun.security.ssl.SSLSocketImpl.sockInput : java.io.InputStream [927]
//     8  aload_0 [this]
//     9  aload_0 [this]
//    10  invokespecial sun.security.ssl.BaseSSLSocketImpl.getOutputStream() : java.io.OutputStream [1034]
//    13  putfield sun.security.ssl.SSLSocketImpl.sockOutput : java.io.OutputStream [928]
//    16  aload_0 [this]
//    17  invokespecial sun.security.ssl.SSLSocketImpl.initHandshaker() : void [1114]
//    20  return
//      Line numbers:
//        [pc: 0, line: 693]
//        [pc: 8, line: 694]
//        [pc: 16, line: 700]
//        [pc: 20, line: 701]
//  
//  // Method descriptor #49 ()I
//  // Stack: 1, Locals: 1
//  private synchronized int getConnectionState();
//    0  aload_0 [this]
//    1  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    4  ireturn
//      Line numbers:
//        [pc: 0, line: 704]
//  
//  // Method descriptor #56 (I)V
//  // Stack: 2, Locals: 2
//  private synchronized void setConnectionState(int arg0);
//    0  aload_0 [this]
//    1  iload_1 [arg0]
//    2  putfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    5  return
//      Line numbers:
//        [pc: 0, line: 708]
//        [pc: 5, line: 709]
//  
//  // Method descriptor #598 ()Ljava/security/AccessControlContext;
//  // Stack: 1, Locals: 1
//  java.security.AccessControlContext getAcc();
//    0  aload_0 [this]
//    1  getfield sun.security.ssl.SSLSocketImpl.acc : java.security.AccessControlContext [933]
//    4  areturn
//      Line numbers:
//        [pc: 0, line: 712]
//  
//  // Method descriptor #624 (Lsun/security/ssl/OutputRecord;)V
//  // Stack: 3, Locals: 2
//  void writeRecord(sun.security.ssl.OutputRecord arg0) throws java.io.IOException;
//    0  aload_0 [this]
//    1  aload_1 [arg0]
//    2  iconst_0
//    3  invokevirtual sun.security.ssl.SSLSocketImpl.writeRecord(sun.security.ssl.OutputRecord, boolean) : void [1140]
//    6  return
//      Line numbers:
//        [pc: 0, line: 727]
//        [pc: 6, line: 728]
//  
//  // Method descriptor #625 (Lsun/security/ssl/OutputRecord;Z)V
//  // Stack: 4, Locals: 6
//  void writeRecord(sun.security.ssl.OutputRecord arg0, boolean arg1) throws java.io.IOException;
//      0  aload_1 [arg0]
//      1  invokevirtual sun.security.ssl.OutputRecord.contentType() : byte [1090]
//      4  bipush 23
//      6  if_icmpne 108
//      9  aload_0 [this]
//     10  invokespecial sun.security.ssl.SSLSocketImpl.getConnectionState() : int [1107]
//     13  tableswitch default: 98
//          case 1: 56
//          case 2: 63
//          case 3: 63
//          case 4: 66
//          case 5: 76
//          case 6: 76
//          case 7: 76
//     56  aload_0 [this]
//     57  invokespecial sun.security.ssl.SSLSocketImpl.performInitialHandshake() : void [1116]
//     60  goto 0
//     63  goto 108
//     66  aload_0 [this]
//     67  iconst_0
//     68  ldc <String "error while writing to socket"> [38]
//     70  invokevirtual sun.security.ssl.SSLSocketImpl.fatal(byte, java.lang.String) : void [1131]
//     73  goto 0
//     76  aload_0 [this]
//     77  getfield sun.security.ssl.SSLSocketImpl.closeReason : javax.net.ssl.SSLException [939]
//     80  ifnull 88
//     83  aload_0 [this]
//     84  getfield sun.security.ssl.SSLSocketImpl.closeReason : javax.net.ssl.SSLException [939]
//     87  athrow
//     88  new java.net.SocketException [501]
//     91  dup
//     92  ldc <String "Socket closed"> [30]
//     94  invokespecial java.net.SocketException(java.lang.String) [992]
//     97  athrow
//     98  new javax.net.ssl.SSLProtocolException [517]
//    101  dup
//    102  ldc <String "State error, send app data"> [33]
//    104  invokespecial javax.net.ssl.SSLProtocolException(java.lang.String) [1020]
//    107  athrow
//    108  aload_1 [arg0]
//    109  invokevirtual sun.security.ssl.OutputRecord.isEmpty() : boolean [1091]
//    112  ifne 329
//    115  aload_1 [arg0]
//    116  iconst_0
//    117  invokevirtual sun.security.ssl.OutputRecord.isAlert(byte) : boolean [1093]
//    120  ifeq 294
//    123  aload_0 [this]
//    124  invokevirtual sun.security.ssl.SSLSocketImpl.getSoLinger() : int [1108]
//    127  iflt 294
//    130  invokestatic java.lang.Thread.interrupted() : boolean [983]
//    133  istore_3
//    134  aload_0 [this]
//    135  getfield sun.security.ssl.SSLSocketImpl.writeLock : java.util.concurrent.locks.ReentrantLock [938]
//    138  aload_0 [this]
//    139  invokevirtual sun.security.ssl.SSLSocketImpl.getSoLinger() : int [1108]
//    142  i2l
//    143  getstatic java.util.concurrent.TimeUnit.SECONDS : java.util.concurrent.TimeUnit [895]
//    146  invokevirtual java.util.concurrent.locks.ReentrantLock.tryLock(long, java.util.concurrent.TimeUnit) : boolean [1003]
//    149  ifeq 183
//    152  aload_0 [this]
//    153  aload_1 [arg0]
//    154  iload_2 [arg1]
//    155  invokespecial sun.security.ssl.SSLSocketImpl.writeRecordInternal(sun.security.ssl.OutputRecord, boolean) : void [1141]
//    158  aload_0 [this]
//    159  getfield sun.security.ssl.SSLSocketImpl.writeLock : java.util.concurrent.locks.ReentrantLock [938]
//    162  invokevirtual java.util.concurrent.locks.ReentrantLock.unlock() : void [1002]
//    165  goto 180
//    168  astore 4
//    170  aload_0 [this]
//    171  getfield sun.security.ssl.SSLSocketImpl.writeLock : java.util.concurrent.locks.ReentrantLock [938]
//    174  invokevirtual java.util.concurrent.locks.ReentrantLock.unlock() : void [1002]
//    177  aload 4
//    179  athrow
//    180  goto 274
//    183  new javax.net.ssl.SSLException [514]
//    186  dup
//    187  ldc <String "SO_LINGER timeout, close_notify message cannot be sent."> [29]
//    189  invokespecial javax.net.ssl.SSLException(java.lang.String) [1006]
//    192  astore 4
//    194  aload_0 [this]
//    195  invokevirtual sun.security.ssl.SSLSocketImpl.isLayered() : boolean [1121]
//    198  ifeq 218
//    201  aload_0 [this]
//    202  getfield sun.security.ssl.SSLSocketImpl.autoClose : boolean [912]
//    205  ifne 218
//    208  aload_0 [this]
//    209  iconst_m1
//    210  aload 4
//    212  invokevirtual sun.security.ssl.SSLSocketImpl.fatal(byte, java.lang.Throwable) : void [1132]
//    215  goto 267
//    218  getstatic sun.security.ssl.SSLSocketImpl.debug : sun.security.ssl.Debug [947]
//    221  ifnull 267
//    224  ldc <String "ssl"> [44]
//    226  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [1049]
//    229  ifeq 267
//    232  getstatic java.lang.System.out : java.io.PrintStream [894]
//    235  new java.lang.StringBuilder [493]
//    238  dup
//    239  invokespecial java.lang.StringBuilder() [975]
//    242  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [985]
//    245  invokevirtual java.lang.Thread.getName() : java.lang.String [984]
//    248  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    251  ldc <String ", received Exception: "> [12]
//    253  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    256  aload 4
//    258  invokevirtual java.lang.StringBuilder.append(java.lang.Object) : java.lang.StringBuilder [979]
//    261  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    264  invokevirtual java.io.PrintStream.println(java.lang.String) : void [960]
//    267  aload_0 [this]
//    268  getfield sun.security.ssl.SSLSocketImpl.sess : sun.security.ssl.SSLSessionImpl [954]
//    271  invokevirtual sun.security.ssl.SSLSessionImpl.invalidate() : void [1105]
//    274  goto 281
//    277  astore 4
//    279  iconst_1
//    280  istore_3
//    281  iload_3
//    282  ifeq 291
//    285  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [985]
//    288  invokevirtual java.lang.Thread.interrupt() : void [981]
//    291  goto 329
//    294  aload_0 [this]
//    295  getfield sun.security.ssl.SSLSocketImpl.writeLock : java.util.concurrent.locks.ReentrantLock [938]
//    298  invokevirtual java.util.concurrent.locks.ReentrantLock.lock() : void [1001]
//    301  aload_0 [this]
//    302  aload_1 [arg0]
//    303  iload_2 [arg1]
//    304  invokespecial sun.security.ssl.SSLSocketImpl.writeRecordInternal(sun.security.ssl.OutputRecord, boolean) : void [1141]
//    307  aload_0 [this]
//    308  getfield sun.security.ssl.SSLSocketImpl.writeLock : java.util.concurrent.locks.ReentrantLock [938]
//    311  invokevirtual java.util.concurrent.locks.ReentrantLock.unlock() : void [1002]
//    314  goto 329
//    317  astore 5
//    319  aload_0 [this]
//    320  getfield sun.security.ssl.SSLSocketImpl.writeLock : java.util.concurrent.locks.ReentrantLock [938]
//    323  invokevirtual java.util.concurrent.locks.ReentrantLock.unlock() : void [1002]
//    326  aload 5
//    328  athrow
//    329  return
//      Exception Table:
//        [pc: 152, pc: 158] -> 168 when : any
//        [pc: 168, pc: 170] -> 168 when : any
//        [pc: 134, pc: 274] -> 277 when : java.lang.InterruptedException
//        [pc: 301, pc: 307] -> 317 when : any
//        [pc: 317, pc: 319] -> 317 when : any
//      Line numbers:
//        [pc: 0, line: 742]
//        [pc: 9, line: 748]
//        [pc: 56, line: 757]
//        [pc: 60, line: 758]
//        [pc: 63, line: 762]
//        [pc: 66, line: 765]
//        [pc: 73, line: 767]
//        [pc: 76, line: 774]
//        [pc: 83, line: 775]
//        [pc: 88, line: 777]
//        [pc: 98, line: 784]
//        [pc: 108, line: 796]
//        [pc: 115, line: 801]
//        [pc: 130, line: 804]
//        [pc: 134, line: 806]
//        [pc: 152, line: 808]
//        [pc: 158, line: 810]
//        [pc: 165, line: 811]
//        [pc: 168, line: 810]
//        [pc: 177, line: 811]
//        [pc: 183, line: 813]
//        [pc: 194, line: 821]
//        [pc: 208, line: 825]
//        [pc: 218, line: 826]
//        [pc: 232, line: 827]
//        [pc: 242, line: 828]
//        [pc: 264, line: 827]
//        [pc: 267, line: 843]
//        [pc: 274, line: 848]
//        [pc: 277, line: 845]
//        [pc: 279, line: 847]
//        [pc: 281, line: 851]
//        [pc: 285, line: 852]
//        [pc: 291, line: 854]
//        [pc: 294, line: 855]
//        [pc: 301, line: 857]
//        [pc: 307, line: 859]
//        [pc: 314, line: 860]
//        [pc: 317, line: 859]
//        [pc: 326, line: 860]
//        [pc: 329, line: 863]
//      Stack map table: number of frames 20
//        [pc: 0, same]
//        [pc: 56, same]
//        [pc: 63, same]
//        [pc: 66, same]
//        [pc: 76, same]
//        [pc: 88, same]
//        [pc: 98, same]
//        [pc: 108, same]
//        [pc: 168, full, stack: {java.lang.Throwable}, locals: {sun.security.ssl.SSLSocketImpl, sun.security.ssl.OutputRecord, int, int}]
//        [pc: 180, same]
//        [pc: 183, same]
//        [pc: 218, append: {javax.net.ssl.SSLException}]
//        [pc: 267, same]
//        [pc: 274, chop 1 local(s)]
//        [pc: 277, same_locals_1_stack_item, stack: {java.lang.InterruptedException}]
//        [pc: 281, same]
//        [pc: 291, chop 1 local(s)]
//        [pc: 294, same]
//        [pc: 317, same_locals_1_stack_item, stack: {java.lang.Throwable}]
//        [pc: 329, same]
//  
//  // Method descriptor #625 (Lsun/security/ssl/OutputRecord;Z)V
//  // Stack: 4, Locals: 3
//  private void writeRecordInternal(sun.security.ssl.OutputRecord arg0, boolean arg1) throws java.io.IOException;
//      0  aload_1 [arg0]
//      1  aload_0 [this]
//      2  getfield sun.security.ssl.SSLSocketImpl.writeAuthenticator : sun.security.ssl.Authenticator [943]
//      5  aload_0 [this]
//      6  getfield sun.security.ssl.SSLSocketImpl.writeCipher : sun.security.ssl.CipherBox [945]
//      9  invokevirtual sun.security.ssl.OutputRecord.encrypt(sun.security.ssl.Authenticator, sun.security.ssl.CipherBox) : void [1097]
//     12  iload_2 [arg1]
//     13  ifeq 48
//     16  aload_0 [this]
//     17  invokevirtual sun.security.ssl.SSLSocketImpl.getTcpNoDelay() : boolean [1119]
//     20  ifeq 28
//     23  iconst_0
//     24  istore_2 [arg1]
//     25  goto 48
//     28  aload_0 [this]
//     29  getfield sun.security.ssl.SSLSocketImpl.heldRecordBuffer : java.io.ByteArrayOutputStream [926]
//     32  ifnonnull 48
//     35  aload_0 [this]
//     36  new java.io.ByteArrayOutputStream [475]
//     39  dup
//     40  bipush 40
//     42  invokespecial java.io.ByteArrayOutputStream(int) [955]
//     45  putfield sun.security.ssl.SSLSocketImpl.heldRecordBuffer : java.io.ByteArrayOutputStream [926]
//     48  aload_1 [arg0]
//     49  aload_0 [this]
//     50  getfield sun.security.ssl.SSLSocketImpl.sockOutput : java.io.OutputStream [928]
//     53  iload_2 [arg1]
//     54  aload_0 [this]
//     55  getfield sun.security.ssl.SSLSocketImpl.heldRecordBuffer : java.io.ByteArrayOutputStream [926]
//     58  invokevirtual sun.security.ssl.OutputRecord.write(java.io.OutputStream, boolean, java.io.ByteArrayOutputStream) : void [1096]
//     61  aload_0 [this]
//     62  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//     65  iconst_4
//     66  if_icmpge 81
//     69  aload_0 [this]
//     70  aload_0 [this]
//     71  getfield sun.security.ssl.SSLSocketImpl.writeAuthenticator : sun.security.ssl.Authenticator [943]
//     74  aload_1 [arg0]
//     75  invokevirtual sun.security.ssl.OutputRecord.contentType() : byte [1090]
//     78  invokespecial sun.security.ssl.SSLSocketImpl.checkSequenceNumber(sun.security.ssl.Authenticator, byte) : void [1136]
//     81  aload_0 [this]
//     82  getfield sun.security.ssl.SSLSocketImpl.isFirstAppOutputRecord : boolean [915]
//     85  ifeq 102
//     88  aload_1 [arg0]
//     89  invokevirtual sun.security.ssl.OutputRecord.contentType() : byte [1090]
//     92  bipush 23
//     94  if_icmpne 102
//     97  aload_0 [this]
//     98  iconst_0
//     99  putfield sun.security.ssl.SSLSocketImpl.isFirstAppOutputRecord : boolean [915]
//    102  return
//      Line numbers:
//        [pc: 0, line: 869]
//        [pc: 12, line: 871]
//        [pc: 16, line: 875]
//        [pc: 23, line: 876]
//        [pc: 28, line: 880]
//        [pc: 35, line: 882]
//        [pc: 48, line: 886]
//        [pc: 61, line: 899]
//        [pc: 69, line: 900]
//        [pc: 81, line: 904]
//        [pc: 89, line: 905]
//        [pc: 97, line: 906]
//        [pc: 102, line: 908]
//      Stack map table: number of frames 4
//        [pc: 28, same]
//        [pc: 48, same]
//        [pc: 81, same]
//        [pc: 102, same]
//  
//  // Method descriptor #51 ()Z
//  // Stack: 2, Locals: 3
//  boolean needToSplitPayload();
//     0  aload_0 [this]
//     1  getfield sun.security.ssl.SSLSocketImpl.writeLock : java.util.concurrent.locks.ReentrantLock [938]
//     4  invokevirtual java.util.concurrent.locks.ReentrantLock.lock() : void [1001]
//     7  aload_0 [this]
//     8  getfield sun.security.ssl.SSLSocketImpl.protocolVersion : sun.security.ssl.ProtocolVersion [951]
//    11  getfield sun.security.ssl.ProtocolVersion.v : int [904]
//    14  getstatic sun.security.ssl.ProtocolVersion.TLS10 : sun.security.ssl.ProtocolVersion [906]
//    17  getfield sun.security.ssl.ProtocolVersion.v : int [904]
//    20  if_icmpgt 50
//    23  aload_0 [this]
//    24  getfield sun.security.ssl.SSLSocketImpl.writeCipher : sun.security.ssl.CipherBox [945]
//    27  invokevirtual sun.security.ssl.CipherBox.isCBCMode() : boolean [1045]
//    30  ifeq 50
//    33  aload_0 [this]
//    34  getfield sun.security.ssl.SSLSocketImpl.isFirstAppOutputRecord : boolean [915]
//    37  ifne 50
//    40  getstatic sun.security.ssl.Record.enableCBCProtection : boolean [907]
//    43  ifeq 50
//    46  iconst_1
//    47  goto 51
//    50  iconst_0
//    51  istore_1
//    52  aload_0 [this]
//    53  getfield sun.security.ssl.SSLSocketImpl.writeLock : java.util.concurrent.locks.ReentrantLock [938]
//    56  invokevirtual java.util.concurrent.locks.ReentrantLock.unlock() : void [1002]
//    59  iload_1
//    60  ireturn
//    61  astore_2
//    62  aload_0 [this]
//    63  getfield sun.security.ssl.SSLSocketImpl.writeLock : java.util.concurrent.locks.ReentrantLock [938]
//    66  invokevirtual java.util.concurrent.locks.ReentrantLock.unlock() : void [1002]
//    69  aload_2
//    70  athrow
//      Exception Table:
//        [pc: 7, pc: 52] -> 61 when : any
//      Line numbers:
//        [pc: 0, line: 922]
//        [pc: 7, line: 924]
//        [pc: 27, line: 925]
//        [pc: 52, line: 928]
//        [pc: 59, line: 924]
//        [pc: 61, line: 928]
//        [pc: 69, line: 929]
//      Stack map table: number of frames 3
//        [pc: 50, same]
//        [pc: 51, same_locals_1_stack_item, stack: {int}]
//        [pc: 61, same_locals_1_stack_item, stack: {java.lang.Throwable}]
//  
//  // Method descriptor #622 (Lsun/security/ssl/InputRecord;)V
//  // Stack: 3, Locals: 2
//  void readDataRecord(sun.security.ssl.InputRecord arg0) throws java.io.IOException;
//     0  aload_0 [this]
//     1  invokespecial sun.security.ssl.SSLSocketImpl.getConnectionState() : int [1107]
//     4  iconst_1
//     5  if_icmpne 12
//     8  aload_0 [this]
//     9  invokespecial sun.security.ssl.SSLSocketImpl.performInitialHandshake() : void [1116]
//    12  aload_0 [this]
//    13  aload_1 [arg0]
//    14  iconst_1
//    15  invokespecial sun.security.ssl.SSLSocketImpl.readRecord(sun.security.ssl.InputRecord, boolean) : void [1138]
//    18  return
//      Line numbers:
//        [pc: 0, line: 937]
//        [pc: 8, line: 938]
//        [pc: 12, line: 940]
//        [pc: 18, line: 941]
//      Stack map table: number of frames 1
//        [pc: 12, same]
//  
//  // Method descriptor #623 (Lsun/security/ssl/InputRecord;Z)V
//  // Stack: 4, Locals: 11
//  private void readRecord(sun.security.ssl.InputRecord arg0, boolean arg1) throws java.io.IOException;
//      0  aload_0 [this]
//      1  getfield sun.security.ssl.SSLSocketImpl.readLock : java.lang.Object [930]
//      4  dup
//      5  astore 4
//      7  monitorenter
//      8  aload_0 [this]
//      9  invokespecial sun.security.ssl.SSLSocketImpl.getConnectionState() : int [1107]
//     12  dup
//     13  istore_3
//     14  bipush 6
//     16  if_icmpeq 856
//     19  iload_3
//     20  iconst_4
//     21  if_icmpeq 856
//     24  iload_3
//     25  bipush 7
//     27  if_icmpeq 856
//     30  aload_1 [arg0]
//     31  iconst_0
//     32  invokevirtual sun.security.ssl.InputRecord.setAppDataValid(boolean) : void [1083]
//     35  aload_1 [arg0]
//     36  aload_0 [this]
//     37  getfield sun.security.ssl.SSLSocketImpl.sockInput : java.io.InputStream [927]
//     40  aload_0 [this]
//     41  getfield sun.security.ssl.SSLSocketImpl.sockOutput : java.io.OutputStream [928]
//     44  invokevirtual sun.security.ssl.InputRecord.read(java.io.InputStream, java.io.OutputStream) : void [1088]
//     47  goto 216
//     50  astore 5
//     52  aload_0 [this]
//     53  bipush 10
//     55  aload 5
//     57  invokevirtual sun.security.ssl.SSLSocketImpl.fatal(byte, java.lang.Throwable) : void [1132]
//     60  goto 65
//     63  astore 6
//     65  aload 5
//     67  athrow
//     68  astore 5
//     70  aload_0 [this]
//     71  invokespecial sun.security.ssl.SSLSocketImpl.getConnectionState() : int [1107]
//     74  iconst_1
//     75  if_icmpgt 82
//     78  iconst_1
//     79  goto 83
//     82  iconst_0
//     83  istore 6
//     85  getstatic sun.security.ssl.SSLSocketImpl.requireCloseNotify : boolean [920]
//     88  ifne 96
//     91  iload 6
//     93  ifeq 100
//     96  iconst_1
//     97  goto 101
//    100  iconst_0
//    101  istore 7
//    103  getstatic sun.security.ssl.SSLSocketImpl.debug : sun.security.ssl.Debug [947]
//    106  ifnull 162
//    109  ldc <String "ssl"> [44]
//    111  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [1049]
//    114  ifeq 162
//    117  getstatic java.lang.System.out : java.io.PrintStream [894]
//    120  new java.lang.StringBuilder [493]
//    123  dup
//    124  invokespecial java.lang.StringBuilder() [975]
//    127  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [985]
//    130  invokevirtual java.lang.Thread.getName() : java.lang.String [984]
//    133  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    136  ldc <String ", received EOFException: "> [11]
//    138  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    141  iload 7
//    143  ifeq 151
//    146  ldc <String "error"> [37]
//    148  goto 153
//    151  ldc <String "ignored"> [41]
//    153  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    156  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    159  invokevirtual java.io.PrintStream.println(java.lang.String) : void [960]
//    162  iload 7
//    164  ifeq 208
//    167  iload 6
//    169  ifeq 186
//    172  new javax.net.ssl.SSLHandshakeException [515]
//    175  dup
//    176  ldc <String "Remote host closed connection during handshake"> [27]
//    178  invokespecial javax.net.ssl.SSLHandshakeException(java.lang.String) [1009]
//    181  astore 8
//    183  goto 197
//    186  new javax.net.ssl.SSLProtocolException [517]
//    189  dup
//    190  ldc <String "Remote host closed connection incorrectly"> [28]
//    192  invokespecial javax.net.ssl.SSLProtocolException(java.lang.String) [1020]
//    195  astore 8
//    197  aload 8
//    199  aload 5
//    201  invokevirtual javax.net.ssl.SSLException.initCause(java.lang.Throwable) : java.lang.Throwable [1008]
//    204  pop
//    205  aload 8
//    207  athrow
//    208  aload_0 [this]
//    209  iconst_0
//    210  invokespecial sun.security.ssl.SSLSocketImpl.closeInternal(boolean) : void [1125]
//    213  goto 8
//    216  aload_1 [arg0]
//    217  aload_0 [this]
//    218  getfield sun.security.ssl.SSLSocketImpl.readAuthenticator : sun.security.ssl.Authenticator [942]
//    221  aload_0 [this]
//    222  getfield sun.security.ssl.SSLSocketImpl.readCipher : sun.security.ssl.CipherBox [944]
//    225  invokevirtual sun.security.ssl.InputRecord.decrypt(sun.security.ssl.Authenticator, sun.security.ssl.CipherBox) : void [1089]
//    228  goto 264
//    231  astore 5
//    233  aload_1 [arg0]
//    234  invokevirtual sun.security.ssl.InputRecord.contentType() : byte [1077]
//    237  bipush 22
//    239  if_icmpne 247
//    242  bipush 40
//    244  goto 249
//    247  bipush 20
//    249  istore 6
//    251  aload_0 [this]
//    252  iload 6
//    254  aload 5
//    256  invokevirtual javax.crypto.BadPaddingException.getMessage() : java.lang.String [1004]
//    259  aload 5
//    261  invokevirtual sun.security.ssl.SSLSocketImpl.fatal(byte, java.lang.String, java.lang.Throwable) : void [1143]
//    264  aload_0 [this]
//    265  dup
//    266  astore 5
//    268  monitorenter
//    269  aload_1 [arg0]
//    270  invokevirtual sun.security.ssl.InputRecord.contentType() : byte [1077]
//    273  tableswitch default: 764
//          case 20: 641
//          case 21: 630
//          case 22: 304
//          case 23: 537
//    304  aload_0 [this]
//    305  invokespecial sun.security.ssl.SSLSocketImpl.initHandshaker() : void [1114]
//    308  aload_0 [this]
//    309  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    312  invokevirtual sun.security.ssl.Handshaker.activated() : boolean [1054]
//    315  ifne 348
//    318  aload_0 [this]
//    319  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    322  iconst_3
//    323  if_icmpne 340
//    326  aload_0 [this]
//    327  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    330  aload_0 [this]
//    331  getfield sun.security.ssl.SSLSocketImpl.protocolVersion : sun.security.ssl.ProtocolVersion [951]
//    334  invokevirtual sun.security.ssl.Handshaker.activate(sun.security.ssl.ProtocolVersion) : void [1075]
//    337  goto 348
//    340  aload_0 [this]
//    341  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    344  aconst_null
//    345  invokevirtual sun.security.ssl.Handshaker.activate(sun.security.ssl.ProtocolVersion) : void [1075]
//    348  aload_0 [this]
//    349  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    352  aload_1 [arg0]
//    353  aload_0 [this]
//    354  getfield sun.security.ssl.SSLSocketImpl.expectingFinished : boolean [914]
//    357  invokevirtual sun.security.ssl.Handshaker.process_record(sun.security.ssl.InputRecord, boolean) : void [1073]
//    360  aload_0 [this]
//    361  iconst_0
//    362  putfield sun.security.ssl.SSLSocketImpl.expectingFinished : boolean [914]
//    365  aload_0 [this]
//    366  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    369  getfield sun.security.ssl.Handshaker.invalidated : boolean [901]
//    372  ifeq 401
//    375  aload_0 [this]
//    376  aconst_null
//    377  putfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    380  aload_0 [this]
//    381  iconst_0
//    382  putfield sun.security.ssl.SSLSocketImpl.receivedCCS : boolean [919]
//    385  aload_0 [this]
//    386  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    389  iconst_3
//    390  if_icmpne 519
//    393  aload_0 [this]
//    394  iconst_2
//    395  putfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    398  goto 519
//    401  aload_0 [this]
//    402  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    405  invokevirtual sun.security.ssl.Handshaker.isDone() : boolean [1055]
//    408  ifeq 519
//    411  aload_0 [this]
//    412  aload_0 [this]
//    413  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    416  invokevirtual sun.security.ssl.Handshaker.isSecureRenegotiation() : boolean [1056]
//    419  putfield sun.security.ssl.SSLSocketImpl.secureRenegotiation : boolean [922]
//    422  aload_0 [this]
//    423  aload_0 [this]
//    424  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    427  invokevirtual sun.security.ssl.Handshaker.getClientVerifyData() : byte[] [1059]
//    430  putfield sun.security.ssl.SSLSocketImpl.clientVerifyData : byte[] [924]
//    433  aload_0 [this]
//    434  aload_0 [this]
//    435  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    438  invokevirtual sun.security.ssl.Handshaker.getServerVerifyData() : byte[] [1060]
//    441  putfield sun.security.ssl.SSLSocketImpl.serverVerifyData : byte[] [925]
//    444  aload_0 [this]
//    445  aload_0 [this]
//    446  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    449  invokevirtual sun.security.ssl.Handshaker.getSession() : sun.security.ssl.SSLSessionImpl [1076]
//    452  putfield sun.security.ssl.SSLSocketImpl.sess : sun.security.ssl.SSLSessionImpl [954]
//    455  aload_0 [this]
//    456  aconst_null
//    457  putfield sun.security.ssl.SSLSocketImpl.handshakeSession : sun.security.ssl.SSLSessionImpl [953]
//    460  aload_0 [this]
//    461  aconst_null
//    462  putfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    465  aload_0 [this]
//    466  iconst_2
//    467  putfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    470  aload_0 [this]
//    471  iconst_0
//    472  putfield sun.security.ssl.SSLSocketImpl.receivedCCS : boolean [919]
//    475  aload_0 [this]
//    476  getfield sun.security.ssl.SSLSocketImpl.handshakeListeners : java.util.HashMap [936]
//    479  ifnull 519
//    482  new javax.net.ssl.HandshakeCompletedEvent [513]
//    485  dup
//    486  aload_0 [this]
//    487  aload_0 [this]
//    488  getfield sun.security.ssl.SSLSocketImpl.sess : sun.security.ssl.SSLSessionImpl [954]
//    491  invokespecial javax.net.ssl.HandshakeCompletedEvent(javax.net.ssl.SSLSocket, javax.net.ssl.SSLSession) [1005]
//    494  astore 6
//    496  new sun.security.ssl.SSLSocketImpl$NotifyHandshakeThread [539]
//    499  dup
//    500  aload_0 [this]
//    501  getfield sun.security.ssl.SSLSocketImpl.handshakeListeners : java.util.HashMap [936]
//    504  invokevirtual java.util.HashMap.entrySet() : java.util.Set [997]
//    507  aload 6
//    509  invokespecial sun.security.ssl.SSLSocketImpl$NotifyHandshakeThread(java.util.Set, javax.net.ssl.HandshakeCompletedEvent) [1144]
//    512  astore 7
//    514  aload 7
//    516  invokevirtual java.lang.Thread.start() : void [982]
//    519  iload_2 [arg1]
//    520  ifne 531
//    523  aload_0 [this]
//    524  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    527  iconst_2
//    528  if_icmpeq 821
//    531  aload 5
//    533  monitorexit
//    534  goto 8
//    537  aload_0 [this]
//    538  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    541  iconst_2
//    542  if_icmpeq 591
//    545  aload_0 [this]
//    546  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    549  iconst_3
//    550  if_icmpeq 591
//    553  aload_0 [this]
//    554  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    557  iconst_5
//    558  if_icmpeq 591
//    561  new javax.net.ssl.SSLProtocolException [517]
//    564  dup
//    565  new java.lang.StringBuilder [493]
//    568  dup
//    569  invokespecial java.lang.StringBuilder() [975]
//    572  ldc <String "Data received in non-data state: "> [20]
//    574  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    577  aload_0 [this]
//    578  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    581  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [977]
//    584  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    587  invokespecial javax.net.ssl.SSLProtocolException(java.lang.String) [1020]
//    590  athrow
//    591  aload_0 [this]
//    592  getfield sun.security.ssl.SSLSocketImpl.expectingFinished : boolean [914]
//    595  ifeq 608
//    598  new javax.net.ssl.SSLProtocolException [517]
//    601  dup
//    602  ldc <String "Expecting finished message, received data"> [23]
//    604  invokespecial javax.net.ssl.SSLProtocolException(java.lang.String) [1020]
//    607  athrow
//    608  iload_2 [arg1]
//    609  ifne 622
//    612  new javax.net.ssl.SSLException [514]
//    615  dup
//    616  ldc <String "Discarding app data"> [22]
//    618  invokespecial javax.net.ssl.SSLException(java.lang.String) [1006]
//    621  athrow
//    622  aload_1 [arg0]
//    623  iconst_1
//    624  invokevirtual sun.security.ssl.InputRecord.setAppDataValid(boolean) : void [1083]
//    627  goto 821
//    630  aload_0 [this]
//    631  aload_1 [arg0]
//    632  invokespecial sun.security.ssl.SSLSocketImpl.recvAlert(sun.security.ssl.InputRecord) : void [1137]
//    635  aload 5
//    637  monitorexit
//    638  goto 8
//    641  aload_0 [this]
//    642  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    645  iconst_1
//    646  if_icmpeq 657
//    649  aload_0 [this]
//    650  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    653  iconst_3
//    654  if_icmpne 674
//    657  aload_0 [this]
//    658  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    661  invokevirtual sun.security.ssl.Handshaker.sessionKeysCalculated() : boolean [1057]
//    664  ifeq 674
//    667  aload_0 [this]
//    668  getfield sun.security.ssl.SSLSocketImpl.receivedCCS : boolean [919]
//    671  ifeq 720
//    674  aload_0 [this]
//    675  bipush 10
//    677  new java.lang.StringBuilder [493]
//    680  dup
//    681  invokespecial java.lang.StringBuilder() [975]
//    684  ldc <String "illegal change cipher spec msg, conn state = "> [42]
//    686  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    689  aload_0 [this]
//    690  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    693  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [977]
//    696  ldc <String ", handshake state = "> [10]
//    698  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    701  aload_0 [this]
//    702  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    705  getfield sun.security.ssl.Handshaker.state : int [899]
//    708  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [977]
//    711  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    714  invokevirtual sun.security.ssl.SSLSocketImpl.fatal(byte, java.lang.String) : void [1131]
//    717  goto 744
//    720  aload_1 [arg0]
//    721  invokevirtual sun.security.ssl.InputRecord.available() : int [1078]
//    724  iconst_1
//    725  if_icmpne 736
//    728  aload_1 [arg0]
//    729  invokevirtual sun.security.ssl.InputRecord.read() : int [1079]
//    732  iconst_1
//    733  if_icmpeq 744
//    736  aload_0 [this]
//    737  bipush 10
//    739  ldc <String "Malformed change cipher spec msg"> [26]
//    741  invokevirtual sun.security.ssl.SSLSocketImpl.fatal(byte, java.lang.String) : void [1131]
//    744  aload_0 [this]
//    745  iconst_1
//    746  putfield sun.security.ssl.SSLSocketImpl.receivedCCS : boolean [919]
//    749  aload_0 [this]
//    750  invokespecial sun.security.ssl.SSLSocketImpl.changeReadCiphers() : void [1109]
//    753  aload_0 [this]
//    754  iconst_1
//    755  putfield sun.security.ssl.SSLSocketImpl.expectingFinished : boolean [914]
//    758  aload 5
//    760  monitorexit
//    761  goto 8
//    764  getstatic sun.security.ssl.SSLSocketImpl.debug : sun.security.ssl.Debug [947]
//    767  ifnull 815
//    770  ldc <String "ssl"> [44]
//    772  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [1049]
//    775  ifeq 815
//    778  getstatic java.lang.System.out : java.io.PrintStream [894]
//    781  new java.lang.StringBuilder [493]
//    784  dup
//    785  invokespecial java.lang.StringBuilder() [975]
//    788  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [985]
//    791  invokevirtual java.lang.Thread.getName() : java.lang.String [984]
//    794  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    797  ldc <String ", Received record type: "> [3]
//    799  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    802  aload_1 [arg0]
//    803  invokevirtual sun.security.ssl.InputRecord.contentType() : byte [1077]
//    806  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [977]
//    809  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    812  invokevirtual java.io.PrintStream.println(java.lang.String) : void [960]
//    815  aload 5
//    817  monitorexit
//    818  goto 8
//    821  aload_0 [this]
//    822  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    825  iconst_4
//    826  if_icmpge 841
//    829  aload_0 [this]
//    830  aload_0 [this]
//    831  getfield sun.security.ssl.SSLSocketImpl.readAuthenticator : sun.security.ssl.Authenticator [942]
//    834  aload_1 [arg0]
//    835  invokevirtual sun.security.ssl.InputRecord.contentType() : byte [1077]
//    838  invokespecial sun.security.ssl.SSLSocketImpl.checkSequenceNumber(sun.security.ssl.Authenticator, byte) : void [1136]
//    841  aload 5
//    843  monitorexit
//    844  aload 4
//    846  monitorexit
//    847  return
//    848  astore 9
//    850  aload 5
//    852  monitorexit
//    853  aload 9
//    855  athrow
//    856  aload_1 [arg0]
//    857  invokevirtual sun.security.ssl.InputRecord.close() : void [1081]
//    860  aload 4
//    862  monitorexit
//    863  return
//    864  astore 10
//    866  aload 4
//    868  monitorexit
//    869  aload 10
//    871  athrow
//      Exception Table:
//        [pc: 30, pc: 47] -> 50 when : javax.net.ssl.SSLProtocolException
//        [pc: 52, pc: 60] -> 63 when : java.io.IOException
//        [pc: 30, pc: 47] -> 68 when : java.io.EOFException
//        [pc: 216, pc: 228] -> 231 when : javax.crypto.BadPaddingException
//        [pc: 269, pc: 534] -> 848 when : any
//        [pc: 537, pc: 638] -> 848 when : any
//        [pc: 641, pc: 761] -> 848 when : any
//        [pc: 764, pc: 818] -> 848 when : any
//        [pc: 821, pc: 844] -> 848 when : any
//        [pc: 848, pc: 853] -> 848 when : any
//        [pc: 8, pc: 847] -> 864 when : any
//        [pc: 848, pc: 863] -> 864 when : any
//        [pc: 864, pc: 869] -> 864 when : any
//      Line numbers:
//        [pc: 0, line: 968]
//        [pc: 8, line: 974]
//        [pc: 30, line: 982]
//        [pc: 35, line: 983]
//        [pc: 47, line: 1015]
//        [pc: 50, line: 984]
//        [pc: 52, line: 986]
//        [pc: 60, line: 989]
//        [pc: 63, line: 987]
//        [pc: 65, line: 990]
//        [pc: 68, line: 991]
//        [pc: 70, line: 992]
//        [pc: 85, line: 993]
//        [pc: 103, line: 994]
//        [pc: 117, line: 995]
//        [pc: 162, line: 999]
//        [pc: 167, line: 1001]
//        [pc: 172, line: 1002]
//        [pc: 186, line: 1005]
//        [pc: 197, line: 1008]
//        [pc: 205, line: 1009]
//        [pc: 208, line: 1012]
//        [pc: 213, line: 1013]
//        [pc: 216, line: 1025]
//        [pc: 228, line: 1031]
//        [pc: 231, line: 1026]
//        [pc: 233, line: 1027]
//        [pc: 251, line: 1030]
//        [pc: 264, line: 1040]
//        [pc: 269, line: 1041]
//        [pc: 304, line: 1054]
//        [pc: 308, line: 1055]
//        [pc: 318, line: 1057]
//        [pc: 326, line: 1059]
//        [pc: 340, line: 1061]
//        [pc: 348, line: 1072]
//        [pc: 360, line: 1073]
//        [pc: 365, line: 1075]
//        [pc: 375, line: 1076]
//        [pc: 380, line: 1077]
//        [pc: 385, line: 1079]
//        [pc: 393, line: 1080]
//        [pc: 401, line: 1082]
//        [pc: 411, line: 1084]
//        [pc: 416, line: 1085]
//        [pc: 422, line: 1086]
//        [pc: 433, line: 1087]
//        [pc: 444, line: 1089]
//        [pc: 455, line: 1090]
//        [pc: 460, line: 1091]
//        [pc: 465, line: 1092]
//        [pc: 470, line: 1093]
//        [pc: 475, line: 1099]
//        [pc: 482, line: 1100]
//        [pc: 496, line: 1103]
//        [pc: 504, line: 1104]
//        [pc: 514, line: 1105]
//        [pc: 519, line: 1109]
//        [pc: 531, line: 1110]
//        [pc: 537, line: 1116]
//        [pc: 561, line: 1119]
//        [pc: 591, line: 1123]
//        [pc: 598, line: 1124]
//        [pc: 608, line: 1127]
//        [pc: 612, line: 1128]
//        [pc: 622, line: 1131]
//        [pc: 627, line: 1132]
//        [pc: 630, line: 1135]
//        [pc: 635, line: 1136]
//        [pc: 641, line: 1139]
//        [pc: 661, line: 1141]
//        [pc: 674, line: 1144]
//        [pc: 720, line: 1148]
//        [pc: 736, line: 1150]
//        [pc: 744, line: 1157]
//        [pc: 749, line: 1166]
//        [pc: 753, line: 1168]
//        [pc: 758, line: 1169]
//        [pc: 764, line: 1175]
//        [pc: 778, line: 1176]
//        [pc: 803, line: 1178]
//        [pc: 812, line: 1176]
//        [pc: 815, line: 1180]
//        [pc: 821, line: 1194]
//        [pc: 829, line: 1195]
//        [pc: 841, line: 1198]
//        [pc: 848, line: 1199]
//        [pc: 856, line: 1205]
//        [pc: 860, line: 1206]
//        [pc: 864, line: 1207]
//      Stack map table: number of frames 45
//        [pc: 8, append: {_, java.lang.Object}]
//        [pc: 50, full, stack: {javax.net.ssl.SSLProtocolException}, locals: {sun.security.ssl.SSLSocketImpl, sun.security.ssl.InputRecord, int, int, java.lang.Object}]
//        [pc: 63, full, stack: {java.io.IOException}, locals: {sun.security.ssl.SSLSocketImpl, sun.security.ssl.InputRecord, int, int, java.lang.Object, javax.net.ssl.SSLProtocolException}]
//        [pc: 65, same]
//        [pc: 68, full, stack: {java.io.EOFException}, locals: {sun.security.ssl.SSLSocketImpl, sun.security.ssl.InputRecord, int, int, java.lang.Object}]
//        [pc: 82, append: {java.io.EOFException}]
//        [pc: 83, same_locals_1_stack_item, stack: {int}]
//        [pc: 96, append: {int}]
//        [pc: 100, same]
//        [pc: 101, same_locals_1_stack_item, stack: {int}]
//        [pc: 151, full, stack: {java.io.PrintStream, java.lang.StringBuilder}, locals: {sun.security.ssl.SSLSocketImpl, sun.security.ssl.InputRecord, int, int, java.lang.Object, java.io.EOFException, int, int}]
//        [pc: 153, full, stack: {java.io.PrintStream, java.lang.StringBuilder, java.lang.String}, locals: {sun.security.ssl.SSLSocketImpl, sun.security.ssl.InputRecord, int, int, java.lang.Object, java.io.EOFException, int, int}]
//        [pc: 162, same]
//        [pc: 186, same]
//        [pc: 197, append: {javax.net.ssl.SSLException}]
//        [pc: 208, chop 1 local(s)]
//        [pc: 216, chop 3 local(s)]
//        [pc: 231, same_locals_1_stack_item, stack: {javax.crypto.BadPaddingException}]
//        [pc: 247, append: {javax.crypto.BadPaddingException}]
//        [pc: 249, same_locals_1_stack_item, stack: {int}]
//        [pc: 264, chop 1 local(s)]
//        [pc: 304, append: {java.lang.Object}]
//        [pc: 340, same]
//        [pc: 348, same]
//        [pc: 401, same]
//        [pc: 519, same_extended]
//        [pc: 531, same]
//        [pc: 537, same]
//        [pc: 591, same]
//        [pc: 608, same]
//        [pc: 622, same]
//        [pc: 630, same]
//        [pc: 641, same]
//        [pc: 657, same]
//        [pc: 674, same]
//        [pc: 720, same]
//        [pc: 736, same]
//        [pc: 744, same]
//        [pc: 764, same]
//        [pc: 815, same]
//        [pc: 821, same]
//        [pc: 841, same]
//        [pc: 848, same_locals_1_stack_item, stack: {java.lang.Throwable}]
//        [pc: 856, chop 1 local(s)]
//        [pc: 864, full, stack: {java.lang.Throwable}, locals: {sun.security.ssl.SSLSocketImpl, sun.security.ssl.InputRecord, int, _, java.lang.Object}]
//  
//  // Method descriptor #615 (Lsun/security/ssl/Authenticator;B)V
//  // Stack: 3, Locals: 3
//  private void checkSequenceNumber(sun.security.ssl.Authenticator arg0, byte arg1) throws java.io.IOException;
//      0  aload_0 [this]
//      1  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//      4  iconst_4
//      5  if_icmpge 15
//      8  aload_1 [arg0]
//      9  getstatic sun.security.ssl.MAC.NULL : sun.security.ssl.MAC [903]
//     12  if_acmpne 16
//     15  return
//     16  aload_1 [arg0]
//     17  invokevirtual sun.security.ssl.Authenticator.seqNumOverflow() : boolean [1028]
//     20  ifeq 75
//     23  getstatic sun.security.ssl.SSLSocketImpl.debug : sun.security.ssl.Debug [947]
//     26  ifnull 67
//     29  ldc <String "ssl"> [44]
//     31  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [1049]
//     34  ifeq 67
//     37  getstatic java.lang.System.out : java.io.PrintStream [894]
//     40  new java.lang.StringBuilder [493]
//     43  dup
//     44  invokespecial java.lang.StringBuilder() [975]
//     47  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [985]
//     50  invokevirtual java.lang.Thread.getName() : java.lang.String [984]
//     53  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//     56  ldc <String ", sequence number extremely close to overflow (2^64-1 packets). Closing connection."> [14]
//     58  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//     61  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//     64  invokevirtual java.io.PrintStream.println(java.lang.String) : void [960]
//     67  aload_0 [this]
//     68  bipush 40
//     70  ldc <String "sequence number overflow"> [43]
//     72  invokevirtual sun.security.ssl.SSLSocketImpl.fatal(byte, java.lang.String) : void [1131]
//     75  iload_2 [arg1]
//     76  bipush 22
//     78  if_icmpeq 136
//     81  aload_1 [arg0]
//     82  invokevirtual sun.security.ssl.Authenticator.seqNumIsHuge() : boolean [1027]
//     85  ifeq 136
//     88  getstatic sun.security.ssl.SSLSocketImpl.debug : sun.security.ssl.Debug [947]
//     91  ifnull 132
//     94  ldc <String "ssl"> [44]
//     96  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [1049]
//     99  ifeq 132
//    102  getstatic java.lang.System.out : java.io.PrintStream [894]
//    105  new java.lang.StringBuilder [493]
//    108  dup
//    109  invokespecial java.lang.StringBuilder() [975]
//    112  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [985]
//    115  invokevirtual java.lang.Thread.getName() : java.lang.String [984]
//    118  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    121  ldc <String ", request renegotiation to avoid sequence number overflow"> [13]
//    123  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    126  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    129  invokevirtual java.io.PrintStream.println(java.lang.String) : void [960]
//    132  aload_0 [this]
//    133  invokevirtual sun.security.ssl.SSLSocketImpl.startHandshake() : void [1117]
//    136  return
//      Line numbers:
//        [pc: 0, line: 1225]
//        [pc: 15, line: 1226]
//        [pc: 16, line: 1233]
//        [pc: 23, line: 1239]
//        [pc: 37, line: 1240]
//        [pc: 67, line: 1246]
//        [pc: 75, line: 1255]
//        [pc: 88, line: 1256]
//        [pc: 102, line: 1257]
//        [pc: 132, line: 1262]
//        [pc: 136, line: 1264]
//      Stack map table: number of frames 6
//        [pc: 15, same]
//        [pc: 16, same]
//        [pc: 67, same]
//        [pc: 75, same]
//        [pc: 132, same]
//        [pc: 136, same]
//  
//  // Method descriptor #612 ()Lsun/security/ssl/AppInputStream;
//  // Stack: 1, Locals: 1
//  sun.security.ssl.AppInputStream getAppInputStream();
//    0  aload_0 [this]
//    1  getfield sun.security.ssl.SSLSocketImpl.input : sun.security.ssl.AppInputStream [940]
//    4  areturn
//      Line numbers:
//        [pc: 0, line: 1274]
//  
//  // Method descriptor #613 ()Lsun/security/ssl/AppOutputStream;
//  // Stack: 1, Locals: 1
//  sun.security.ssl.AppOutputStream getAppOutputStream();
//    0  aload_0 [this]
//    1  getfield sun.security.ssl.SSLSocketImpl.output : sun.security.ssl.AppOutputStream [941]
//    4  areturn
//      Line numbers:
//        [pc: 0, line: 1281]
//  
//  // Method descriptor #50 ()V
//  // Stack: 12, Locals: 1
//  private void initHandshaker();
//      0  aload_0 [this]
//      1  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//      4  tableswitch default: 40
//          case 0: 36
//          case 1: 39
//          case 2: 36
//          case 3: 39
//     36  goto 50
//     39  return
//     40  new java.lang.IllegalStateException [486]
//     43  dup
//     44  ldc <String "Internal error"> [25]
//     46  invokespecial java.lang.IllegalStateException(java.lang.String) [965]
//     49  athrow
//     50  aload_0 [this]
//     51  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//     54  ifne 65
//     57  aload_0 [this]
//     58  iconst_1
//     59  putfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//     62  goto 70
//     65  aload_0 [this]
//     66  iconst_3
//     67  putfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//     70  aload_0 [this]
//     71  getfield sun.security.ssl.SSLSocketImpl.roleIsServer : boolean [921]
//     74  ifeq 155
//     77  aload_0 [this]
//     78  new sun.security.ssl.ServerHandshaker [540]
//     81  dup
//     82  aload_0 [this]
//     83  aload_0 [this]
//     84  getfield sun.security.ssl.SSLSocketImpl.sslContext : sun.security.ssl.SSLContextImpl [952]
//     87  aload_0 [this]
//     88  getfield sun.security.ssl.SSLSocketImpl.enabledProtocols : sun.security.ssl.ProtocolList [950]
//     91  aload_0 [this]
//     92  getfield sun.security.ssl.SSLSocketImpl.doClientAuth : byte [909]
//     95  aload_0 [this]
//     96  getfield sun.security.ssl.SSLSocketImpl.protocolVersion : sun.security.ssl.ProtocolVersion [951]
//     99  aload_0 [this]
//    100  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    103  iconst_1
//    104  if_icmpne 111
//    107  iconst_1
//    108  goto 112
//    111  iconst_0
//    112  aload_0 [this]
//    113  getfield sun.security.ssl.SSLSocketImpl.secureRenegotiation : boolean [922]
//    116  aload_0 [this]
//    117  getfield sun.security.ssl.SSLSocketImpl.clientVerifyData : byte[] [924]
//    120  aload_0 [this]
//    121  getfield sun.security.ssl.SSLSocketImpl.serverVerifyData : byte[] [925]
//    124  invokespecial sun.security.ssl.ServerHandshaker(sun.security.ssl.SSLSocketImpl, sun.security.ssl.SSLContextImpl, sun.security.ssl.ProtocolList, byte, sun.security.ssl.ProtocolVersion, boolean, boolean, byte[], byte[]) [1146]
//    127  putfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    130  aload_0 [this]
//    131  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    134  aload_0 [this]
//    135  getfield sun.security.ssl.SSLSocketImpl.sniMatchers : java.util.Collection [935]
//    138  invokevirtual sun.security.ssl.Handshaker.setSNIMatchers(java.util.Collection) : void [1066]
//    141  aload_0 [this]
//    142  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    145  aload_0 [this]
//    146  getfield sun.security.ssl.SSLSocketImpl.preferLocalCipherSuites : boolean [918]
//    149  invokevirtual sun.security.ssl.Handshaker.setUseCipherSuitesOrder(boolean) : void [1063]
//    152  goto 215
//    155  aload_0 [this]
//    156  new sun.security.ssl.ClientHandshaker [527]
//    159  dup
//    160  aload_0 [this]
//    161  aload_0 [this]
//    162  getfield sun.security.ssl.SSLSocketImpl.sslContext : sun.security.ssl.SSLContextImpl [952]
//    165  aload_0 [this]
//    166  getfield sun.security.ssl.SSLSocketImpl.enabledProtocols : sun.security.ssl.ProtocolList [950]
//    169  aload_0 [this]
//    170  getfield sun.security.ssl.SSLSocketImpl.protocolVersion : sun.security.ssl.ProtocolVersion [951]
//    173  aload_0 [this]
//    174  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    177  iconst_1
//    178  if_icmpne 185
//    181  iconst_1
//    182  goto 186
//    185  iconst_0
//    186  aload_0 [this]
//    187  getfield sun.security.ssl.SSLSocketImpl.secureRenegotiation : boolean [922]
//    190  aload_0 [this]
//    191  getfield sun.security.ssl.SSLSocketImpl.clientVerifyData : byte[] [924]
//    194  aload_0 [this]
//    195  getfield sun.security.ssl.SSLSocketImpl.serverVerifyData : byte[] [925]
//    198  invokespecial sun.security.ssl.ClientHandshaker(sun.security.ssl.SSLSocketImpl, sun.security.ssl.SSLContextImpl, sun.security.ssl.ProtocolList, sun.security.ssl.ProtocolVersion, boolean, boolean, byte[], byte[]) [1048]
//    201  putfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    204  aload_0 [this]
//    205  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    208  aload_0 [this]
//    209  getfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//    212  invokevirtual sun.security.ssl.Handshaker.setSNIServerNames(java.util.List) : void [1067]
//    215  aload_0 [this]
//    216  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    219  aload_0 [this]
//    220  getfield sun.security.ssl.SSLSocketImpl.enabledCipherSuites : sun.security.ssl.CipherSuiteList [946]
//    223  invokevirtual sun.security.ssl.Handshaker.setEnabledCipherSuites(sun.security.ssl.CipherSuiteList) : void [1072]
//    226  aload_0 [this]
//    227  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    230  aload_0 [this]
//    231  getfield sun.security.ssl.SSLSocketImpl.enableSessionCreation : boolean [913]
//    234  invokevirtual sun.security.ssl.Handshaker.setEnableSessionCreation(boolean) : void [1062]
//    237  return
//      Line numbers:
//        [pc: 0, line: 1301]
//        [pc: 36, line: 1308]
//        [pc: 39, line: 1315]
//        [pc: 40, line: 1322]
//        [pc: 50, line: 1326]
//        [pc: 57, line: 1327]
//        [pc: 65, line: 1329]
//        [pc: 70, line: 1331]
//        [pc: 77, line: 1332]
//        [pc: 130, line: 1336]
//        [pc: 141, line: 1337]
//        [pc: 155, line: 1339]
//        [pc: 204, line: 1343]
//        [pc: 215, line: 1345]
//        [pc: 226, line: 1346]
//        [pc: 237, line: 1347]
//      Stack map table: number of frames 12
//        [pc: 36, same]
//        [pc: 39, same]
//        [pc: 40, same]
//        [pc: 50, same]
//        [pc: 65, same]
//        [pc: 70, same]
//        [pc: 111, full, stack: {sun.security.ssl.SSLSocketImpl, uninitialized(78), uninitialized(78), sun.security.ssl.SSLSocketImpl, sun.security.ssl.SSLContextImpl, sun.security.ssl.ProtocolList, int, sun.security.ssl.ProtocolVersion}, locals: {sun.security.ssl.SSLSocketImpl}]
//        [pc: 112, full, stack: {sun.security.ssl.SSLSocketImpl, uninitialized(78), uninitialized(78), sun.security.ssl.SSLSocketImpl, sun.security.ssl.SSLContextImpl, sun.security.ssl.ProtocolList, int, sun.security.ssl.ProtocolVersion, int}, locals: {sun.security.ssl.SSLSocketImpl}]
//        [pc: 155, same]
//        [pc: 185, full, stack: {sun.security.ssl.SSLSocketImpl, uninitialized(156), uninitialized(156), sun.security.ssl.SSLSocketImpl, sun.security.ssl.SSLContextImpl, sun.security.ssl.ProtocolList, sun.security.ssl.ProtocolVersion}, locals: {sun.security.ssl.SSLSocketImpl}]
//        [pc: 186, full, stack: {sun.security.ssl.SSLSocketImpl, uninitialized(156), uninitialized(156), sun.security.ssl.SSLSocketImpl, sun.security.ssl.SSLContextImpl, sun.security.ssl.ProtocolList, sun.security.ssl.ProtocolVersion, int}, locals: {sun.security.ssl.SSLSocketImpl}]
//        [pc: 215, same]
//  
//  // Method descriptor #50 ()V
//  // Stack: 3, Locals: 3
//  private void performInitialHandshake() throws java.io.IOException;
//      0  aload_0 [this]
//      1  getfield sun.security.ssl.SSLSocketImpl.handshakeLock : java.lang.Object [929]
//      4  dup
//      5  astore_1
//      6  monitorenter
//      7  aload_0 [this]
//      8  invokespecial sun.security.ssl.SSLSocketImpl.getConnectionState() : int [1107]
//     11  iconst_1
//     12  if_icmpne 92
//     15  aload_0 [this]
//     16  invokespecial sun.security.ssl.SSLSocketImpl.kickstartHandshake() : void [1115]
//     19  aload_0 [this]
//     20  getfield sun.security.ssl.SSLSocketImpl.inrec : sun.security.ssl.InputRecord [949]
//     23  ifnonnull 78
//     26  aload_0 [this]
//     27  new sun.security.ssl.InputRecord [531]
//     30  dup
//     31  invokespecial sun.security.ssl.InputRecord() [1080]
//     34  putfield sun.security.ssl.SSLSocketImpl.inrec : sun.security.ssl.InputRecord [949]
//     37  aload_0 [this]
//     38  getfield sun.security.ssl.SSLSocketImpl.inrec : sun.security.ssl.InputRecord [949]
//     41  aload_0 [this]
//     42  getfield sun.security.ssl.SSLSocketImpl.input : sun.security.ssl.AppInputStream [940]
//     45  getfield sun.security.ssl.AppInputStream.r : sun.security.ssl.InputRecord [896]
//     48  invokevirtual sun.security.ssl.InputRecord.getHandshakeHash() : sun.security.ssl.HandshakeHash [1084]
//     51  invokevirtual sun.security.ssl.InputRecord.setHandshakeHash(sun.security.ssl.HandshakeHash) : void [1085]
//     54  aload_0 [this]
//     55  getfield sun.security.ssl.SSLSocketImpl.inrec : sun.security.ssl.InputRecord [949]
//     58  aload_0 [this]
//     59  getfield sun.security.ssl.SSLSocketImpl.input : sun.security.ssl.AppInputStream [940]
//     62  getfield sun.security.ssl.AppInputStream.r : sun.security.ssl.InputRecord [896]
//     65  invokevirtual sun.security.ssl.InputRecord.getHelloVersion() : sun.security.ssl.ProtocolVersion [1086]
//     68  invokevirtual sun.security.ssl.InputRecord.setHelloVersion(sun.security.ssl.ProtocolVersion) : void [1087]
//     71  aload_0 [this]
//     72  getfield sun.security.ssl.SSLSocketImpl.inrec : sun.security.ssl.InputRecord [949]
//     75  invokevirtual sun.security.ssl.InputRecord.enableFormatChecks() : void [1082]
//     78  aload_0 [this]
//     79  aload_0 [this]
//     80  getfield sun.security.ssl.SSLSocketImpl.inrec : sun.security.ssl.InputRecord [949]
//     83  iconst_0
//     84  invokespecial sun.security.ssl.SSLSocketImpl.readRecord(sun.security.ssl.InputRecord, boolean) : void [1138]
//     87  aload_0 [this]
//     88  aconst_null
//     89  putfield sun.security.ssl.SSLSocketImpl.inrec : sun.security.ssl.InputRecord [949]
//     92  aload_1
//     93  monitorexit
//     94  goto 102
//     97  astore_2
//     98  aload_1
//     99  monitorexit
//    100  aload_2
//    101  athrow
//    102  return
//      Exception Table:
//        [pc: 7, pc: 94] -> 97 when : any
//        [pc: 97, pc: 100] -> 97 when : any
//      Line numbers:
//        [pc: 0, line: 1359]
//        [pc: 7, line: 1360]
//        [pc: 15, line: 1361]
//        [pc: 19, line: 1372]
//        [pc: 26, line: 1373]
//        [pc: 37, line: 1380]
//        [pc: 54, line: 1381]
//        [pc: 71, line: 1382]
//        [pc: 78, line: 1385]
//        [pc: 87, line: 1386]
//        [pc: 92, line: 1388]
//        [pc: 102, line: 1389]
//      Stack map table: number of frames 4
//        [pc: 78, append: {java.lang.Object}]
//        [pc: 92, same]
//        [pc: 97, same_locals_1_stack_item, stack: {java.lang.Throwable}]
//        [pc: 102, chop 1 local(s)]
//  
//  // Method descriptor #50 ()V
//  // Stack: 2, Locals: 1
//  public void startHandshake() throws java.io.IOException;
//    0  aload_0 [this]
//    1  iconst_1
//    2  invokespecial sun.security.ssl.SSLSocketImpl.startHandshake(boolean) : void [1127]
//    5  return
//      Line numbers:
//        [pc: 0, line: 1397]
//        [pc: 5, line: 1398]
//  
//  // Method descriptor #59 (Z)V
//  // Stack: 3, Locals: 3
//  private void startHandshake(boolean arg0) throws java.io.IOException;
//     0  aload_0 [this]
//     1  invokevirtual sun.security.ssl.SSLSocketImpl.checkWrite() : void [1110]
//     4  aload_0 [this]
//     5  invokespecial sun.security.ssl.SSLSocketImpl.getConnectionState() : int [1107]
//     8  iconst_1
//     9  if_icmpne 19
//    12  aload_0 [this]
//    13  invokespecial sun.security.ssl.SSLSocketImpl.performInitialHandshake() : void [1116]
//    16  goto 23
//    19  aload_0 [this]
//    20  invokespecial sun.security.ssl.SSLSocketImpl.kickstartHandshake() : void [1115]
//    23  goto 33
//    26  astore_2
//    27  aload_0 [this]
//    28  aload_2
//    29  iload_1 [arg0]
//    30  invokespecial sun.security.ssl.SSLSocketImpl.handleException(java.lang.Exception, boolean) : void [1130]
//    33  return
//      Exception Table:
//        [pc: 4, pc: 23] -> 26 when : java.lang.Exception
//      Line numbers:
//        [pc: 0, line: 1409]
//        [pc: 4, line: 1411]
//        [pc: 12, line: 1413]
//        [pc: 19, line: 1416]
//        [pc: 23, line: 1421]
//        [pc: 26, line: 1418]
//        [pc: 27, line: 1420]
//        [pc: 33, line: 1422]
//      Stack map table: number of frames 4
//        [pc: 19, same]
//        [pc: 23, same]
//        [pc: 26, same_locals_1_stack_item, stack: {java.lang.Exception}]
//        [pc: 33, same]
//  
//  // Method descriptor #50 ()V
//  // Stack: 3, Locals: 1
//  private synchronized void kickstartHandshake() throws java.io.IOException;
//      0  aload_0 [this]
//      1  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//      4  tableswitch default: 109
//          case 0: 99
//          case 1: 36
//          case 2: 39
//          case 3: 98
//     36  goto 119
//     39  aload_0 [this]
//     40  getfield sun.security.ssl.SSLSocketImpl.secureRenegotiation : boolean [922]
//     43  ifne 62
//     46  getstatic sun.security.ssl.Handshaker.allowUnsafeRenegotiation : boolean [900]
//     49  ifne 62
//     52  new javax.net.ssl.SSLHandshakeException [515]
//     55  dup
//     56  ldc <String "Insecure renegotiation is not allowed"> [24]
//     58  invokespecial javax.net.ssl.SSLHandshakeException(java.lang.String) [1009]
//     61  athrow
//     62  aload_0 [this]
//     63  getfield sun.security.ssl.SSLSocketImpl.secureRenegotiation : boolean [922]
//     66  ifne 91
//     69  getstatic sun.security.ssl.SSLSocketImpl.debug : sun.security.ssl.Debug [947]
//     72  ifnull 91
//     75  ldc <String "handshake"> [39]
//     77  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [1049]
//     80  ifeq 91
//     83  getstatic java.lang.System.out : java.io.PrintStream [894]
//     86  ldc <String "Warning: Using insecure renegotiation"> [35]
//     88  invokevirtual java.io.PrintStream.println(java.lang.String) : void [960]
//     91  aload_0 [this]
//     92  invokespecial sun.security.ssl.SSLSocketImpl.initHandshaker() : void [1114]
//     95  goto 119
//     98  return
//     99  new java.net.SocketException [501]
//    102  dup
//    103  ldc <String "handshaking attempted on unconnected socket"> [40]
//    105  invokespecial java.net.SocketException(java.lang.String) [992]
//    108  athrow
//    109  new java.net.SocketException [501]
//    112  dup
//    113  ldc <String "connection is closed"> [36]
//    115  invokespecial java.net.SocketException(java.lang.String) [992]
//    118  athrow
//    119  aload_0 [this]
//    120  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    123  invokevirtual sun.security.ssl.Handshaker.activated() : boolean [1054]
//    126  ifne 207
//    129  aload_0 [this]
//    130  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    133  iconst_3
//    134  if_icmpne 151
//    137  aload_0 [this]
//    138  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    141  aload_0 [this]
//    142  getfield sun.security.ssl.SSLSocketImpl.protocolVersion : sun.security.ssl.ProtocolVersion [951]
//    145  invokevirtual sun.security.ssl.Handshaker.activate(sun.security.ssl.ProtocolVersion) : void [1075]
//    148  goto 159
//    151  aload_0 [this]
//    152  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    155  aconst_null
//    156  invokevirtual sun.security.ssl.Handshaker.activate(sun.security.ssl.ProtocolVersion) : void [1075]
//    159  aload_0 [this]
//    160  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    163  instanceof sun.security.ssl.ClientHandshaker [527]
//    166  ifeq 179
//    169  aload_0 [this]
//    170  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    173  invokevirtual sun.security.ssl.Handshaker.kickstart() : void [1053]
//    176  goto 207
//    179  aload_0 [this]
//    180  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    183  iconst_1
//    184  if_icmpne 190
//    187  goto 207
//    190  aload_0 [this]
//    191  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    194  invokevirtual sun.security.ssl.Handshaker.kickstart() : void [1053]
//    197  aload_0 [this]
//    198  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    201  getfield sun.security.ssl.Handshaker.handshakeHash : sun.security.ssl.HandshakeHash [902]
//    204  invokevirtual sun.security.ssl.HandshakeHash.reset() : void [1052]
//    207  return
//      Line numbers:
//        [pc: 0, line: 1440]
//        [pc: 36, line: 1444]
//        [pc: 39, line: 1447]
//        [pc: 52, line: 1448]
//        [pc: 62, line: 1452]
//        [pc: 69, line: 1453]
//        [pc: 83, line: 1454]
//        [pc: 91, line: 1460]
//        [pc: 95, line: 1461]
//        [pc: 98, line: 1465]
//        [pc: 99, line: 1472]
//        [pc: 109, line: 1476]
//        [pc: 119, line: 1486]
//        [pc: 129, line: 1488]
//        [pc: 137, line: 1490]
//        [pc: 151, line: 1492]
//        [pc: 159, line: 1495]
//        [pc: 169, line: 1497]
//        [pc: 179, line: 1499]
//        [pc: 190, line: 1503]
//        [pc: 197, line: 1506]
//        [pc: 207, line: 1510]
//      Stack map table: number of frames 13
//        [pc: 36, same]
//        [pc: 39, same]
//        [pc: 62, same]
//        [pc: 91, same]
//        [pc: 98, same]
//        [pc: 99, same]
//        [pc: 109, same]
//        [pc: 119, same]
//        [pc: 151, same]
//        [pc: 159, same]
//        [pc: 179, same]
//        [pc: 190, same]
//        [pc: 207, same]
//  
//  // Method descriptor #51 ()Z
//  // Stack: 2, Locals: 1
//  public boolean isClosed();
//     0  aload_0 [this]
//     1  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//     4  bipush 7
//     6  if_icmpne 13
//     9  iconst_1
//    10  goto 14
//    13  iconst_0
//    14  ireturn
//      Line numbers:
//        [pc: 0, line: 1521]
//      Stack map table: number of frames 2
//        [pc: 13, same]
//        [pc: 14, same_locals_1_stack_item, stack: {int}]
//  
//  // Method descriptor #51 ()Z
//  // Stack: 4, Locals: 2
//  boolean checkEOF() throws java.io.IOException;
//      0  aload_0 [this]
//      1  invokespecial sun.security.ssl.SSLSocketImpl.getConnectionState() : int [1107]
//      4  tableswitch default: 74
//          case 0: 52
//          case 1: 62
//          case 2: 62
//          case 3: 62
//          case 4: 74
//          case 5: 62
//          case 6: 74
//          case 7: 64
//     52  new java.net.SocketException [501]
//     55  dup
//     56  ldc <String "Socket is not connected"> [32]
//     58  invokespecial java.net.SocketException(java.lang.String) [992]
//     61  athrow
//     62  iconst_0
//     63  ireturn
//     64  new java.net.SocketException [501]
//     67  dup
//     68  ldc <String "Socket is closed"> [31]
//     70  invokespecial java.net.SocketException(java.lang.String) [992]
//     73  athrow
//     74  aload_0 [this]
//     75  getfield sun.security.ssl.SSLSocketImpl.closeReason : javax.net.ssl.SSLException [939]
//     78  ifnonnull 83
//     81  iconst_1
//     82  ireturn
//     83  new javax.net.ssl.SSLException [514]
//     86  dup
//     87  new java.lang.StringBuilder [493]
//     90  dup
//     91  invokespecial java.lang.StringBuilder() [975]
//     94  ldc <String "Connection has been shutdown: "> [19]
//     96  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//     99  aload_0 [this]
//    100  getfield sun.security.ssl.SSLSocketImpl.closeReason : javax.net.ssl.SSLException [939]
//    103  invokevirtual java.lang.StringBuilder.append(java.lang.Object) : java.lang.StringBuilder [979]
//    106  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    109  invokespecial javax.net.ssl.SSLException(java.lang.String) [1006]
//    112  astore_1
//    113  aload_1
//    114  aload_0 [this]
//    115  getfield sun.security.ssl.SSLSocketImpl.closeReason : javax.net.ssl.SSLException [939]
//    118  invokevirtual java.io.IOException.initCause(java.lang.Throwable) : java.lang.Throwable [956]
//    121  pop
//    122  aload_1
//    123  athrow
//      Line numbers:
//        [pc: 0, line: 1531]
//        [pc: 52, line: 1533]
//        [pc: 62, line: 1539]
//        [pc: 64, line: 1542]
//        [pc: 74, line: 1548]
//        [pc: 81, line: 1549]
//        [pc: 83, line: 1551]
//        [pc: 113, line: 1553]
//        [pc: 122, line: 1554]
//      Stack map table: number of frames 5
//        [pc: 52, same]
//        [pc: 62, same]
//        [pc: 64, same]
//        [pc: 74, same]
//        [pc: 83, same]
//  
//  // Method descriptor #50 ()V
//  // Stack: 3, Locals: 1
//  void checkWrite() throws java.io.IOException;
//     0  aload_0 [this]
//     1  invokevirtual sun.security.ssl.SSLSocketImpl.checkEOF() : boolean [1118]
//     4  ifne 15
//     7  aload_0 [this]
//     8  invokespecial sun.security.ssl.SSLSocketImpl.getConnectionState() : int [1107]
//    11  iconst_5
//    12  if_icmpne 25
//    15  new java.net.SocketException [501]
//    18  dup
//    19  ldc <String "Connection closed by remote host"> [18]
//    21  invokespecial java.net.SocketException(java.lang.String) [992]
//    24  athrow
//    25  return
//      Line numbers:
//        [pc: 0, line: 1563]
//        [pc: 15, line: 1565]
//        [pc: 25, line: 1567]
//      Stack map table: number of frames 2
//        [pc: 15, same]
//        [pc: 25, same]
//  
//  // Method descriptor #50 ()V
//  // Stack: 3, Locals: 1
//  protected void closeSocket() throws java.io.IOException;
//     0  getstatic sun.security.ssl.SSLSocketImpl.debug : sun.security.ssl.Debug [947]
//     3  ifnull 44
//     6  ldc <String "ssl"> [44]
//     8  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [1049]
//    11  ifeq 44
//    14  getstatic java.lang.System.out : java.io.PrintStream [894]
//    17  new java.lang.StringBuilder [493]
//    20  dup
//    21  invokespecial java.lang.StringBuilder() [975]
//    24  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [985]
//    27  invokevirtual java.lang.Thread.getName() : java.lang.String [984]
//    30  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    33  ldc <String ", called closeSocket()"> [8]
//    35  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    38  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    41  invokevirtual java.io.PrintStream.println(java.lang.String) : void [960]
//    44  aload_0 [this]
//    45  invokespecial sun.security.ssl.BaseSSLSocketImpl.close() : void [1030]
//    48  return
//      Line numbers:
//        [pc: 0, line: 1571]
//        [pc: 14, line: 1572]
//        [pc: 44, line: 1576]
//        [pc: 48, line: 1577]
//      Stack map table: number of frames 1
//        [pc: 44, same]
//  
//  // Method descriptor #59 (Z)V
//  // Stack: 3, Locals: 2
//  private void closeSocket(boolean arg0) throws java.io.IOException;
//     0  getstatic sun.security.ssl.SSLSocketImpl.debug : sun.security.ssl.Debug [947]
//     3  ifnull 53
//     6  ldc <String "ssl"> [44]
//     8  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [1049]
//    11  ifeq 53
//    14  getstatic java.lang.System.out : java.io.PrintStream [894]
//    17  new java.lang.StringBuilder [493]
//    20  dup
//    21  invokespecial java.lang.StringBuilder() [975]
//    24  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [985]
//    27  invokevirtual java.lang.Thread.getName() : java.lang.String [984]
//    30  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    33  ldc <String ", called closeSocket("> [7]
//    35  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    38  iload_1 [arg0]
//    39  invokevirtual java.lang.StringBuilder.append(boolean) : java.lang.StringBuilder [978]
//    42  ldc <String ")"> [1]
//    44  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    47  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    50  invokevirtual java.io.PrintStream.println(java.lang.String) : void [960]
//    53  aload_0 [this]
//    54  invokevirtual sun.security.ssl.SSLSocketImpl.isLayered() : boolean [1121]
//    57  ifeq 67
//    60  aload_0 [this]
//    61  getfield sun.security.ssl.SSLSocketImpl.autoClose : boolean [912]
//    64  ifeq 74
//    67  aload_0 [this]
//    68  invokespecial sun.security.ssl.BaseSSLSocketImpl.close() : void [1030]
//    71  goto 83
//    74  iload_1 [arg0]
//    75  ifeq 83
//    78  aload_0 [this]
//    79  iconst_0
//    80  invokevirtual sun.security.ssl.SSLSocketImpl.waitForClose(boolean) : void [1129]
//    83  return
//      Line numbers:
//        [pc: 0, line: 1580]
//        [pc: 14, line: 1581]
//        [pc: 53, line: 1584]
//        [pc: 67, line: 1585]
//        [pc: 74, line: 1586]
//        [pc: 78, line: 1589]
//        [pc: 83, line: 1591]
//      Stack map table: number of frames 4
//        [pc: 53, same]
//        [pc: 67, same]
//        [pc: 74, same]
//        [pc: 83, same]
//  
//  // Method descriptor #50 ()V
//  // Stack: 3, Locals: 1
//  public void close() throws java.io.IOException;
//     0  getstatic sun.security.ssl.SSLSocketImpl.debug : sun.security.ssl.Debug [947]
//     3  ifnull 44
//     6  ldc <String "ssl"> [44]
//     8  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [1049]
//    11  ifeq 44
//    14  getstatic java.lang.System.out : java.io.PrintStream [894]
//    17  new java.lang.StringBuilder [493]
//    20  dup
//    21  invokespecial java.lang.StringBuilder() [975]
//    24  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [985]
//    27  invokevirtual java.lang.Thread.getName() : java.lang.String [984]
//    30  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    33  ldc <String ", called close()"> [5]
//    35  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    38  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    41  invokevirtual java.io.PrintStream.println(java.lang.String) : void [960]
//    44  aload_0 [this]
//    45  iconst_1
//    46  invokespecial sun.security.ssl.SSLSocketImpl.closeInternal(boolean) : void [1125]
//    49  aload_0 [this]
//    50  bipush 7
//    52  invokespecial sun.security.ssl.SSLSocketImpl.setConnectionState(int) : void [1124]
//    55  return
//      Line numbers:
//        [pc: 0, line: 1608]
//        [pc: 14, line: 1609]
//        [pc: 44, line: 1612]
//        [pc: 49, line: 1613]
//        [pc: 55, line: 1614]
//      Stack map table: number of frames 1
//        [pc: 44, same]
//  
//  // Method descriptor #59 (Z)V
//  // Stack: 3, Locals: 16
//  private void closeInternal(boolean arg0) throws java.io.IOException;
//      0  getstatic sun.security.ssl.SSLSocketImpl.debug : sun.security.ssl.Debug [947]
//      3  ifnull 53
//      6  ldc <String "ssl"> [44]
//      8  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [1049]
//     11  ifeq 53
//     14  getstatic java.lang.System.out : java.io.PrintStream [894]
//     17  new java.lang.StringBuilder [493]
//     20  dup
//     21  invokespecial java.lang.StringBuilder() [975]
//     24  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [985]
//     27  invokevirtual java.lang.Thread.getName() : java.lang.String [984]
//     30  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//     33  ldc <String ", called closeInternal("> [6]
//     35  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//     38  iload_1 [arg0]
//     39  invokevirtual java.lang.StringBuilder.append(boolean) : java.lang.StringBuilder [978]
//     42  ldc <String ")"> [1]
//     44  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//     47  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//     50  invokevirtual java.io.PrintStream.println(java.lang.String) : void [960]
//     53  aload_0 [this]
//     54  invokespecial sun.security.ssl.SSLSocketImpl.getConnectionState() : int [1107]
//     57  istore_2
//     58  iconst_0
//     59  istore_3
//     60  aconst_null
//     61  astore 4
//     63  iload_2
//     64  tableswitch default: 130
//          case 0: 112
//          case 1: 130
//          case 2: 130
//          case 3: 130
//          case 4: 120
//          case 5: 130
//          case 6: 127
//          case 7: 127
//    112  aload_0 [this]
//    113  iload_1 [arg0]
//    114  invokespecial sun.security.ssl.SSLSocketImpl.closeSocket(boolean) : void [1126]
//    117  goto 627
//    120  aload_0 [this]
//    121  invokevirtual sun.security.ssl.SSLSocketImpl.closeSocket() : void [1111]
//    124  goto 627
//    127  goto 627
//    130  aload_0 [this]
//    131  dup
//    132  astore 5
//    134  monitorenter
//    135  aload_0 [this]
//    136  invokespecial sun.security.ssl.SSLSocketImpl.getConnectionState() : int [1107]
//    139  dup
//    140  istore_2
//    141  bipush 6
//    143  if_icmpeq 157
//    146  iload_2
//    147  iconst_4
//    148  if_icmpeq 157
//    151  iload_2
//    152  bipush 7
//    154  if_icmpne 245
//    157  aload 5
//    159  monitorexit
//    160  aload_0 [this]
//    161  dup
//    162  astore 6
//    164  monitorenter
//    165  aload_0 [this]
//    166  aload_0 [this]
//    167  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    170  bipush 7
//    172  if_icmpne 180
//    175  bipush 7
//    177  goto 182
//    180  bipush 6
//    182  putfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    185  aload_0 [this]
//    186  invokevirtual java.lang.Object.notifyAll() : void [969]
//    189  aload 6
//    191  monitorexit
//    192  goto 203
//    195  astore 7
//    197  aload 6
//    199  monitorexit
//    200  aload 7
//    202  athrow
//    203  iload_3
//    204  ifeq 211
//    207  aload_0 [this]
//    208  invokespecial sun.security.ssl.SSLSocketImpl.disposeCiphers() : void [1112]
//    211  aload 4
//    213  ifnull 244
//    216  aload 4
//    218  instanceof java.lang.Error [483]
//    221  ifeq 230
//    224  aload 4
//    226  checkcast java.lang.Error [483]
//    229  athrow
//    230  aload 4
//    232  instanceof java.lang.RuntimeException [490]
//    235  ifeq 244
//    238  aload 4
//    240  checkcast java.lang.RuntimeException [490]
//    243  athrow
//    244  return
//    245  iload_2
//    246  iconst_5
//    247  if_icmpeq 281
//    250  aload_0 [this]
//    251  iconst_0
//    252  invokevirtual sun.security.ssl.SSLSocketImpl.warning(byte) : void [1122]
//    255  aload_0 [this]
//    256  iconst_5
//    257  putfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    260  goto 281
//    263  astore 6
//    265  aload_0 [this]
//    266  iconst_4
//    267  putfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    270  aload 6
//    272  astore 4
//    274  iconst_1
//    275  istore_3
//    276  aload_0 [this]
//    277  iload_1 [arg0]
//    278  invokespecial sun.security.ssl.SSLSocketImpl.closeSocket(boolean) : void [1126]
//    281  aload 5
//    283  monitorexit
//    284  goto 295
//    287  astore 8
//    289  aload 5
//    291  monitorexit
//    292  aload 8
//    294  athrow
//    295  iload_2
//    296  iconst_5
//    297  if_icmpne 616
//    300  getstatic sun.security.ssl.SSLSocketImpl.debug : sun.security.ssl.Debug [947]
//    303  ifnull 351
//    306  ldc <String "ssl"> [44]
//    308  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [1049]
//    311  ifeq 351
//    314  getstatic java.lang.System.out : java.io.PrintStream [894]
//    317  new java.lang.StringBuilder [493]
//    320  dup
//    321  invokespecial java.lang.StringBuilder() [975]
//    324  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [985]
//    327  invokevirtual java.lang.Thread.getName() : java.lang.String [984]
//    330  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    333  ldc <String ", close invoked again; state = "> [9]
//    335  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    338  aload_0 [this]
//    339  invokespecial sun.security.ssl.SSLSocketImpl.getConnectionState() : int [1107]
//    342  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [977]
//    345  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    348  invokevirtual java.io.PrintStream.println(java.lang.String) : void [960]
//    351  iload_1 [arg0]
//    352  ifne 440
//    355  aload_0 [this]
//    356  dup
//    357  astore 5
//    359  monitorenter
//    360  aload_0 [this]
//    361  aload_0 [this]
//    362  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    365  bipush 7
//    367  if_icmpne 375
//    370  bipush 7
//    372  goto 377
//    375  bipush 6
//    377  putfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    380  aload_0 [this]
//    381  invokevirtual java.lang.Object.notifyAll() : void [969]
//    384  aload 5
//    386  monitorexit
//    387  goto 398
//    390  astore 9
//    392  aload 5
//    394  monitorexit
//    395  aload 9
//    397  athrow
//    398  iload_3
//    399  ifeq 406
//    402  aload_0 [this]
//    403  invokespecial sun.security.ssl.SSLSocketImpl.disposeCiphers() : void [1112]
//    406  aload 4
//    408  ifnull 439
//    411  aload 4
//    413  instanceof java.lang.Error [483]
//    416  ifeq 425
//    419  aload 4
//    421  checkcast java.lang.Error [483]
//    424  athrow
//    425  aload 4
//    427  instanceof java.lang.RuntimeException [490]
//    430  ifeq 439
//    433  aload 4
//    435  checkcast java.lang.RuntimeException [490]
//    438  athrow
//    439  return
//    440  aload_0 [this]
//    441  dup
//    442  astore 5
//    444  monitorenter
//    445  aload_0 [this]
//    446  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    449  bipush 6
//    451  if_icmpge 466
//    454  aload_0 [this]
//    455  invokevirtual java.lang.Object.wait() : void [970]
//    458  goto 445
//    461  astore 6
//    463  goto 445
//    466  aload 5
//    468  monitorexit
//    469  goto 480
//    472  astore 10
//    474  aload 5
//    476  monitorexit
//    477  aload 10
//    479  athrow
//    480  getstatic sun.security.ssl.SSLSocketImpl.debug : sun.security.ssl.Debug [947]
//    483  ifnull 531
//    486  ldc <String "ssl"> [44]
//    488  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [1049]
//    491  ifeq 531
//    494  getstatic java.lang.System.out : java.io.PrintStream [894]
//    497  new java.lang.StringBuilder [493]
//    500  dup
//    501  invokespecial java.lang.StringBuilder() [975]
//    504  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [985]
//    507  invokevirtual java.lang.Thread.getName() : java.lang.String [984]
//    510  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    513  ldc <String ", after primary close; state = "> [4]
//    515  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    518  aload_0 [this]
//    519  invokespecial sun.security.ssl.SSLSocketImpl.getConnectionState() : int [1107]
//    522  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [977]
//    525  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    528  invokevirtual java.io.PrintStream.println(java.lang.String) : void [960]
//    531  aload_0 [this]
//    532  dup
//    533  astore 5
//    535  monitorenter
//    536  aload_0 [this]
//    537  aload_0 [this]
//    538  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    541  bipush 7
//    543  if_icmpne 551
//    546  bipush 7
//    548  goto 553
//    551  bipush 6
//    553  putfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    556  aload_0 [this]
//    557  invokevirtual java.lang.Object.notifyAll() : void [969]
//    560  aload 5
//    562  monitorexit
//    563  goto 574
//    566  astore 11
//    568  aload 5
//    570  monitorexit
//    571  aload 11
//    573  athrow
//    574  iload_3
//    575  ifeq 582
//    578  aload_0 [this]
//    579  invokespecial sun.security.ssl.SSLSocketImpl.disposeCiphers() : void [1112]
//    582  aload 4
//    584  ifnull 615
//    587  aload 4
//    589  instanceof java.lang.Error [483]
//    592  ifeq 601
//    595  aload 4
//    597  checkcast java.lang.Error [483]
//    600  athrow
//    601  aload 4
//    603  instanceof java.lang.RuntimeException [490]
//    606  ifeq 615
//    609  aload 4
//    611  checkcast java.lang.RuntimeException [490]
//    614  athrow
//    615  return
//    616  iload_3
//    617  ifne 627
//    620  iconst_1
//    621  istore_3
//    622  aload_0 [this]
//    623  iload_1 [arg0]
//    624  invokespecial sun.security.ssl.SSLSocketImpl.closeSocket(boolean) : void [1126]
//    627  aload_0 [this]
//    628  dup
//    629  astore 5
//    631  monitorenter
//    632  aload_0 [this]
//    633  aload_0 [this]
//    634  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    637  bipush 7
//    639  if_icmpne 647
//    642  bipush 7
//    644  goto 649
//    647  bipush 6
//    649  putfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    652  aload_0 [this]
//    653  invokevirtual java.lang.Object.notifyAll() : void [969]
//    656  aload 5
//    658  monitorexit
//    659  goto 670
//    662  astore 12
//    664  aload 5
//    666  monitorexit
//    667  aload 12
//    669  athrow
//    670  iload_3
//    671  ifeq 678
//    674  aload_0 [this]
//    675  invokespecial sun.security.ssl.SSLSocketImpl.disposeCiphers() : void [1112]
//    678  aload 4
//    680  ifnull 800
//    683  aload 4
//    685  instanceof java.lang.Error [483]
//    688  ifeq 697
//    691  aload 4
//    693  checkcast java.lang.Error [483]
//    696  athrow
//    697  aload 4
//    699  instanceof java.lang.RuntimeException [490]
//    702  ifeq 800
//    705  aload 4
//    707  checkcast java.lang.RuntimeException [490]
//    710  athrow
//    711  astore 13
//    713  aload_0 [this]
//    714  dup
//    715  astore 14
//    717  monitorenter
//    718  aload_0 [this]
//    719  aload_0 [this]
//    720  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    723  bipush 7
//    725  if_icmpne 733
//    728  bipush 7
//    730  goto 735
//    733  bipush 6
//    735  putfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    738  aload_0 [this]
//    739  invokevirtual java.lang.Object.notifyAll() : void [969]
//    742  aload 14
//    744  monitorexit
//    745  goto 756
//    748  astore 15
//    750  aload 14
//    752  monitorexit
//    753  aload 15
//    755  athrow
//    756  iload_3
//    757  ifeq 764
//    760  aload_0 [this]
//    761  invokespecial sun.security.ssl.SSLSocketImpl.disposeCiphers() : void [1112]
//    764  aload 4
//    766  ifnull 797
//    769  aload 4
//    771  instanceof java.lang.Error [483]
//    774  ifeq 783
//    777  aload 4
//    779  checkcast java.lang.Error [483]
//    782  athrow
//    783  aload 4
//    785  instanceof java.lang.RuntimeException [490]
//    788  ifeq 797
//    791  aload 4
//    793  checkcast java.lang.RuntimeException [490]
//    796  athrow
//    797  aload 13
//    799  athrow
//    800  return
//      Exception Table:
//        [pc: 165, pc: 192] -> 195 when : any
//        [pc: 195, pc: 200] -> 195 when : any
//        [pc: 250, pc: 260] -> 263 when : java.lang.Throwable
//        [pc: 135, pc: 160] -> 287 when : any
//        [pc: 245, pc: 284] -> 287 when : any
//        [pc: 287, pc: 292] -> 287 when : any
//        [pc: 360, pc: 387] -> 390 when : any
//        [pc: 390, pc: 395] -> 390 when : any
//        [pc: 454, pc: 458] -> 461 when : java.lang.InterruptedException
//        [pc: 445, pc: 469] -> 472 when : any
//        [pc: 472, pc: 477] -> 472 when : any
//        [pc: 536, pc: 563] -> 566 when : any
//        [pc: 566, pc: 571] -> 566 when : any
//        [pc: 632, pc: 659] -> 662 when : any
//        [pc: 662, pc: 667] -> 662 when : any
//        [pc: 63, pc: 160] -> 711 when : any
//        [pc: 245, pc: 355] -> 711 when : any
//        [pc: 440, pc: 531] -> 711 when : any
//        [pc: 616, pc: 627] -> 711 when : any
//        [pc: 718, pc: 745] -> 748 when : any
//        [pc: 748, pc: 753] -> 748 when : any
//        [pc: 711, pc: 713] -> 711 when : any
//      Line numbers:
//        [pc: 0, line: 1627]
//        [pc: 14, line: 1628]
//        [pc: 53, line: 1632]
//        [pc: 58, line: 1633]
//        [pc: 60, line: 1634]
//        [pc: 63, line: 1636]
//        [pc: 112, line: 1639]
//        [pc: 117, line: 1640]
//        [pc: 120, line: 1649]
//        [pc: 124, line: 1650]
//        [pc: 127, line: 1657]
//        [pc: 130, line: 1667]
//        [pc: 135, line: 1668]
//        [pc: 157, line: 1670]
//        [pc: 160, line: 1729]
//        [pc: 165, line: 1731]
//        [pc: 185, line: 1734]
//        [pc: 189, line: 1735]
//        [pc: 203, line: 1736]
//        [pc: 207, line: 1738]
//        [pc: 211, line: 1740]
//        [pc: 216, line: 1745]
//        [pc: 224, line: 1746]
//        [pc: 230, line: 1747]
//        [pc: 238, line: 1748]
//        [pc: 244, line: 1670]
//        [pc: 245, line: 1672]
//        [pc: 250, line: 1674]
//        [pc: 255, line: 1675]
//        [pc: 260, line: 1684]
//        [pc: 263, line: 1676]
//        [pc: 265, line: 1679]
//        [pc: 270, line: 1681]
//        [pc: 274, line: 1682]
//        [pc: 276, line: 1683]
//        [pc: 281, line: 1686]
//        [pc: 295, line: 1689]
//        [pc: 300, line: 1690]
//        [pc: 314, line: 1691]
//        [pc: 339, line: 1693]
//        [pc: 348, line: 1691]
//        [pc: 351, line: 1695]
//        [pc: 355, line: 1729]
//        [pc: 360, line: 1731]
//        [pc: 380, line: 1734]
//        [pc: 384, line: 1735]
//        [pc: 398, line: 1736]
//        [pc: 402, line: 1738]
//        [pc: 406, line: 1740]
//        [pc: 411, line: 1745]
//        [pc: 419, line: 1746]
//        [pc: 425, line: 1747]
//        [pc: 433, line: 1748]
//        [pc: 439, line: 1700]
//        [pc: 440, line: 1704]
//        [pc: 445, line: 1705]
//        [pc: 454, line: 1707]
//        [pc: 458, line: 1710]
//        [pc: 461, line: 1708]
//        [pc: 463, line: 1710]
//        [pc: 466, line: 1712]
//        [pc: 480, line: 1713]
//        [pc: 494, line: 1714]
//        [pc: 519, line: 1716]
//        [pc: 528, line: 1714]
//        [pc: 531, line: 1729]
//        [pc: 536, line: 1731]
//        [pc: 556, line: 1734]
//        [pc: 560, line: 1735]
//        [pc: 574, line: 1736]
//        [pc: 578, line: 1738]
//        [pc: 582, line: 1740]
//        [pc: 587, line: 1745]
//        [pc: 595, line: 1746]
//        [pc: 601, line: 1747]
//        [pc: 609, line: 1748]
//        [pc: 615, line: 1718]
//        [pc: 616, line: 1721]
//        [pc: 620, line: 1722]
//        [pc: 622, line: 1723]
//        [pc: 627, line: 1729]
//        [pc: 632, line: 1731]
//        [pc: 652, line: 1734]
//        [pc: 656, line: 1735]
//        [pc: 670, line: 1736]
//        [pc: 674, line: 1738]
//        [pc: 678, line: 1740]
//        [pc: 683, line: 1745]
//        [pc: 691, line: 1746]
//        [pc: 697, line: 1747]
//        [pc: 705, line: 1748]
//        [pc: 711, line: 1729]
//        [pc: 718, line: 1731]
//        [pc: 738, line: 1734]
//        [pc: 742, line: 1735]
//        [pc: 756, line: 1736]
//        [pc: 760, line: 1738]
//        [pc: 764, line: 1740]
//        [pc: 769, line: 1745]
//        [pc: 777, line: 1746]
//        [pc: 783, line: 1747]
//        [pc: 791, line: 1748]
//        [pc: 797, line: 1750]
//        [pc: 800, line: 1751]
//      Stack map table: number of frames 57
//        [pc: 53, same]
//        [pc: 112, append: {int, int, java.lang.Throwable}]
//        [pc: 120, same]
//        [pc: 127, same]
//        [pc: 130, same]
//        [pc: 157, append: {java.lang.Object}]
//        [pc: 180, full, stack: {sun.security.ssl.SSLSocketImpl}, locals: {sun.security.ssl.SSLSocketImpl, int, int, int, java.lang.Throwable, java.lang.Object, java.lang.Object}]
//        [pc: 182, full, stack: {sun.security.ssl.SSLSocketImpl, int}, locals: {sun.security.ssl.SSLSocketImpl, int, int, int, java.lang.Throwable, java.lang.Object, java.lang.Object}]
//        [pc: 195, same_locals_1_stack_item, stack: {java.lang.Throwable}]
//        [pc: 203, chop 1 local(s)]
//        [pc: 211, same]
//        [pc: 230, same]
//        [pc: 244, same]
//        [pc: 245, same]
//        [pc: 263, same_locals_1_stack_item, stack: {java.lang.Throwable}]
//        [pc: 281, same]
//        [pc: 287, same_locals_1_stack_item, stack: {java.lang.Throwable}]
//        [pc: 295, chop 1 local(s)]
//        [pc: 351, same]
//        [pc: 375, full, stack: {sun.security.ssl.SSLSocketImpl}, locals: {sun.security.ssl.SSLSocketImpl, int, int, int, java.lang.Throwable, java.lang.Object}]
//        [pc: 377, full, stack: {sun.security.ssl.SSLSocketImpl, int}, locals: {sun.security.ssl.SSLSocketImpl, int, int, int, java.lang.Throwable, java.lang.Object}]
//        [pc: 390, same_locals_1_stack_item, stack: {java.lang.Throwable}]
//        [pc: 398, chop 1 local(s)]
//        [pc: 406, same]
//        [pc: 425, same]
//        [pc: 439, same]
//        [pc: 440, same]
//        [pc: 445, append: {java.lang.Object}]
//        [pc: 461, same_locals_1_stack_item, stack: {java.lang.InterruptedException}]
//        [pc: 466, same]
//        [pc: 472, same_locals_1_stack_item, stack: {java.lang.Throwable}]
//        [pc: 480, chop 1 local(s)]
//        [pc: 531, same]
//        [pc: 551, full, stack: {sun.security.ssl.SSLSocketImpl}, locals: {sun.security.ssl.SSLSocketImpl, int, int, int, java.lang.Throwable, java.lang.Object}]
//        [pc: 553, full, stack: {sun.security.ssl.SSLSocketImpl, int}, locals: {sun.security.ssl.SSLSocketImpl, int, int, int, java.lang.Throwable, java.lang.Object}]
//        [pc: 566, same_locals_1_stack_item, stack: {java.lang.Throwable}]
//        [pc: 574, chop 1 local(s)]
//        [pc: 582, same]
//        [pc: 601, same]
//        [pc: 615, same]
//        [pc: 616, same]
//        [pc: 627, same]
//        [pc: 647, full, stack: {sun.security.ssl.SSLSocketImpl}, locals: {sun.security.ssl.SSLSocketImpl, int, int, int, java.lang.Throwable, java.lang.Object}]
//        [pc: 649, full, stack: {sun.security.ssl.SSLSocketImpl, int}, locals: {sun.security.ssl.SSLSocketImpl, int, int, int, java.lang.Throwable, java.lang.Object}]
//        [pc: 662, same_locals_1_stack_item, stack: {java.lang.Throwable}]
//        [pc: 670, chop 1 local(s)]
//        [pc: 678, same]
//        [pc: 697, same]
//        [pc: 711, same_locals_1_stack_item, stack: {java.lang.Throwable}]
//        [pc: 733, full, stack: {sun.security.ssl.SSLSocketImpl}, locals: {sun.security.ssl.SSLSocketImpl, int, int, int, java.lang.Throwable, _, _, _, _, _, _, _, _, java.lang.Throwable, java.lang.Object}]
//        [pc: 735, full, stack: {sun.security.ssl.SSLSocketImpl, int}, locals: {sun.security.ssl.SSLSocketImpl, int, int, int, java.lang.Throwable, _, _, _, _, _, _, _, _, java.lang.Throwable, java.lang.Object}]
//        [pc: 748, same_locals_1_stack_item, stack: {java.lang.Throwable}]
//        [pc: 756, chop 1 local(s)]
//        [pc: 764, same]
//        [pc: 783, same]
//        [pc: 797, same]
//        [pc: 800, full, stack: {}, locals: {sun.security.ssl.SSLSocketImpl, int, int, int, java.lang.Throwable}]
//  
//  // Method descriptor #59 (Z)V
//  // Stack: 4, Locals: 4
//  void waitForClose(boolean arg0) throws java.io.IOException;
//      0  getstatic sun.security.ssl.SSLSocketImpl.debug : sun.security.ssl.Debug [947]
//      3  ifnull 51
//      6  ldc <String "ssl"> [44]
//      8  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [1049]
//     11  ifeq 51
//     14  getstatic java.lang.System.out : java.io.PrintStream [894]
//     17  new java.lang.StringBuilder [493]
//     20  dup
//     21  invokespecial java.lang.StringBuilder() [975]
//     24  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [985]
//     27  invokevirtual java.lang.Thread.getName() : java.lang.String [984]
//     30  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//     33  ldc <String ", waiting for close_notify or alert: state "> [15]
//     35  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//     38  aload_0 [this]
//     39  invokespecial sun.security.ssl.SSLSocketImpl.getConnectionState() : int [1107]
//     42  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [977]
//     45  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//     48  invokevirtual java.io.PrintStream.println(java.lang.String) : void [960]
//     51  aload_0 [this]
//     52  invokespecial sun.security.ssl.SSLSocketImpl.getConnectionState() : int [1107]
//     55  dup
//     56  istore_2
//     57  bipush 6
//     59  if_icmpeq 163
//     62  iload_2
//     63  iconst_4
//     64  if_icmpeq 163
//     67  iload_2
//     68  bipush 7
//     70  if_icmpeq 163
//     73  aload_0 [this]
//     74  getfield sun.security.ssl.SSLSocketImpl.inrec : sun.security.ssl.InputRecord [949]
//     77  ifnonnull 91
//     80  aload_0 [this]
//     81  new sun.security.ssl.InputRecord [531]
//     84  dup
//     85  invokespecial sun.security.ssl.InputRecord() [1080]
//     88  putfield sun.security.ssl.SSLSocketImpl.inrec : sun.security.ssl.InputRecord [949]
//     91  aload_0 [this]
//     92  aload_0 [this]
//     93  getfield sun.security.ssl.SSLSocketImpl.inrec : sun.security.ssl.InputRecord [949]
//     96  iconst_1
//     97  invokespecial sun.security.ssl.SSLSocketImpl.readRecord(sun.security.ssl.InputRecord, boolean) : void [1138]
//    100  goto 51
//    103  astore_3
//    104  getstatic sun.security.ssl.SSLSocketImpl.debug : sun.security.ssl.Debug [947]
//    107  ifnull 152
//    110  ldc <String "ssl"> [44]
//    112  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [1049]
//    115  ifeq 152
//    118  getstatic java.lang.System.out : java.io.PrintStream [894]
//    121  new java.lang.StringBuilder [493]
//    124  dup
//    125  invokespecial java.lang.StringBuilder() [975]
//    128  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [985]
//    131  invokevirtual java.lang.Thread.getName() : java.lang.String [984]
//    134  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    137  ldc <String ", received Exception: "> [12]
//    139  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    142  aload_3
//    143  invokevirtual java.lang.StringBuilder.append(java.lang.Object) : java.lang.StringBuilder [979]
//    146  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    149  invokevirtual java.io.PrintStream.println(java.lang.String) : void [960]
//    152  aload_0 [this]
//    153  iconst_m1
//    154  ldc <String "Did not receive close_notify from peer"> [21]
//    156  aload_3
//    157  invokevirtual sun.security.ssl.SSLSocketImpl.fatal(byte, java.lang.String, java.lang.Throwable) : void [1143]
//    160  goto 51
//    163  aload_0 [this]
//    164  aconst_null
//    165  putfield sun.security.ssl.SSLSocketImpl.inrec : sun.security.ssl.InputRecord [949]
//    168  goto 226
//    171  astore_2
//    172  getstatic sun.security.ssl.SSLSocketImpl.debug : sun.security.ssl.Debug [947]
//    175  ifnull 220
//    178  ldc <String "ssl"> [44]
//    180  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [1049]
//    183  ifeq 220
//    186  getstatic java.lang.System.out : java.io.PrintStream [894]
//    189  new java.lang.StringBuilder [493]
//    192  dup
//    193  invokespecial java.lang.StringBuilder() [975]
//    196  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [985]
//    199  invokevirtual java.lang.Thread.getName() : java.lang.String [984]
//    202  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    205  ldc <String ", Exception while waiting for close "> [2]
//    207  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    210  aload_2
//    211  invokevirtual java.lang.StringBuilder.append(java.lang.Object) : java.lang.StringBuilder [979]
//    214  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    217  invokevirtual java.io.PrintStream.println(java.lang.String) : void [960]
//    220  iload_1 [arg0]
//    221  ifeq 226
//    224  aload_2
//    225  athrow
//    226  return
//      Exception Table:
//        [pc: 91, pc: 100] -> 103 when : java.net.SocketTimeoutException
//        [pc: 51, pc: 168] -> 171 when : java.io.IOException
//      Line numbers:
//        [pc: 0, line: 1761]
//        [pc: 14, line: 1762]
//        [pc: 39, line: 1764]
//        [pc: 48, line: 1762]
//        [pc: 51, line: 1770]
//        [pc: 73, line: 1773]
//        [pc: 80, line: 1774]
//        [pc: 91, line: 1779]
//        [pc: 100, line: 1787]
//        [pc: 103, line: 1780]
//        [pc: 104, line: 1781]
//        [pc: 118, line: 1782]
//        [pc: 128, line: 1783]
//        [pc: 149, line: 1782]
//        [pc: 152, line: 1786]
//        [pc: 160, line: 1787]
//        [pc: 163, line: 1789]
//        [pc: 168, line: 1798]
//        [pc: 171, line: 1790]
//        [pc: 172, line: 1791]
//        [pc: 186, line: 1792]
//        [pc: 220, line: 1795]
//        [pc: 224, line: 1796]
//        [pc: 226, line: 1799]
//      Stack map table: number of frames 8
//        [pc: 51, same]
//        [pc: 91, append: {int}]
//        [pc: 103, same_locals_1_stack_item, stack: {java.net.SocketTimeoutException}]
//        [pc: 152, append: {java.net.SocketTimeoutException}]
//        [pc: 163, chop 1 local(s)]
//        [pc: 171, full, stack: {java.io.IOException}, locals: {sun.security.ssl.SSLSocketImpl, int}]
//        [pc: 220, append: {java.io.IOException}]
//        [pc: 226, chop 1 local(s)]
//  
//  // Method descriptor #50 ()V
//  // Stack: 2, Locals: 4
//  private void disposeCiphers();
//     0  aload_0 [this]
//     1  getfield sun.security.ssl.SSLSocketImpl.readLock : java.lang.Object [930]
//     4  dup
//     5  astore_1
//     6  monitorenter
//     7  aload_0 [this]
//     8  getfield sun.security.ssl.SSLSocketImpl.readCipher : sun.security.ssl.CipherBox [944]
//    11  invokevirtual sun.security.ssl.CipherBox.dispose() : void [1044]
//    14  aload_1
//    15  monitorexit
//    16  goto 24
//    19  astore_2
//    20  aload_1
//    21  monitorexit
//    22  aload_2
//    23  athrow
//    24  aload_0 [this]
//    25  getfield sun.security.ssl.SSLSocketImpl.writeLock : java.util.concurrent.locks.ReentrantLock [938]
//    28  invokevirtual java.util.concurrent.locks.ReentrantLock.lock() : void [1001]
//    31  aload_0 [this]
//    32  getfield sun.security.ssl.SSLSocketImpl.writeCipher : sun.security.ssl.CipherBox [945]
//    35  invokevirtual sun.security.ssl.CipherBox.dispose() : void [1044]
//    38  aload_0 [this]
//    39  getfield sun.security.ssl.SSLSocketImpl.writeLock : java.util.concurrent.locks.ReentrantLock [938]
//    42  invokevirtual java.util.concurrent.locks.ReentrantLock.unlock() : void [1002]
//    45  goto 58
//    48  astore_3
//    49  aload_0 [this]
//    50  getfield sun.security.ssl.SSLSocketImpl.writeLock : java.util.concurrent.locks.ReentrantLock [938]
//    53  invokevirtual java.util.concurrent.locks.ReentrantLock.unlock() : void [1002]
//    56  aload_3
//    57  athrow
//    58  return
//      Exception Table:
//        [pc: 7, pc: 16] -> 19 when : any
//        [pc: 19, pc: 22] -> 19 when : any
//        [pc: 31, pc: 38] -> 48 when : any
//      Line numbers:
//        [pc: 0, line: 1807]
//        [pc: 7, line: 1808]
//        [pc: 14, line: 1809]
//        [pc: 24, line: 1811]
//        [pc: 31, line: 1813]
//        [pc: 38, line: 1815]
//        [pc: 45, line: 1816]
//        [pc: 48, line: 1815]
//        [pc: 56, line: 1816]
//        [pc: 58, line: 1817]
//      Stack map table: number of frames 4
//        [pc: 19, full, stack: {java.lang.Throwable}, locals: {sun.security.ssl.SSLSocketImpl, java.lang.Object}]
//        [pc: 24, chop 1 local(s)]
//        [pc: 48, same_locals_1_stack_item, stack: {java.lang.Throwable}]
//        [pc: 58, same]
//  
//  // Method descriptor #576 (Ljava/lang/Exception;)V
//  // Stack: 3, Locals: 2
//  void handleException(java.lang.Exception arg0) throws java.io.IOException;
//    0  aload_0 [this]
//    1  aload_1 [arg0]
//    2  iconst_1
//    3  invokespecial sun.security.ssl.SSLSocketImpl.handleException(java.lang.Exception, boolean) : void [1130]
//    6  return
//      Line numbers:
//        [pc: 0, line: 1830]
//        [pc: 6, line: 1831]
//  
//  // Method descriptor #577 (Ljava/lang/Exception;Z)V
//  // Stack: 3, Locals: 5
//  private synchronized void handleException(java.lang.Exception arg0, boolean arg1) throws java.io.IOException;
//      0  getstatic sun.security.ssl.SSLSocketImpl.debug : sun.security.ssl.Debug [947]
//      3  ifnull 52
//      6  ldc <String "ssl"> [44]
//      8  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [1049]
//     11  ifeq 52
//     14  getstatic java.lang.System.out : java.io.PrintStream [894]
//     17  new java.lang.StringBuilder [493]
//     20  dup
//     21  invokespecial java.lang.StringBuilder() [975]
//     24  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [985]
//     27  invokevirtual java.lang.Thread.getName() : java.lang.String [984]
//     30  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//     33  ldc_w <String ", handling exception: "> [451]
//     36  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//     39  aload_1 [arg0]
//     40  invokevirtual java.lang.Exception.toString() : java.lang.String [963]
//     43  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//     46  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//     49  invokevirtual java.io.PrintStream.println(java.lang.String) : void [960]
//     52  aload_1 [arg0]
//     53  instanceof java.io.InterruptedIOException [479]
//     56  ifeq 68
//     59  iload_2 [arg1]
//     60  ifeq 68
//     63  aload_1 [arg0]
//     64  checkcast java.io.IOException [477]
//     67  athrow
//     68  aload_0 [this]
//     69  getfield sun.security.ssl.SSLSocketImpl.closeReason : javax.net.ssl.SSLException [939]
//     72  ifnull 97
//     75  aload_1 [arg0]
//     76  instanceof java.io.IOException [477]
//     79  ifeq 87
//     82  aload_1 [arg0]
//     83  checkcast java.io.IOException [477]
//     86  athrow
//     87  bipush 80
//     89  aload_1 [arg0]
//     90  ldc_w <String "Unexpected exception"> [464]
//     93  invokestatic sun.security.ssl.Alerts.getSSLException(byte, java.lang.Throwable, java.lang.String) : javax.net.ssl.SSLException [1024]
//     96  athrow
//     97  aload_1 [arg0]
//     98  instanceof javax.net.ssl.SSLException [514]
//    101  istore_3
//    102  iload_3
//    103  ifne 130
//    106  aload_1 [arg0]
//    107  instanceof java.io.IOException [477]
//    110  ifeq 130
//    113  aload_0 [this]
//    114  bipush 10
//    116  aload_1 [arg0]
//    117  invokevirtual sun.security.ssl.SSLSocketImpl.fatal(byte, java.lang.Throwable) : void [1132]
//    120  goto 125
//    123  astore 4
//    125  aload_1 [arg0]
//    126  checkcast java.io.IOException [477]
//    129  athrow
//    130  iload_3
//    131  ifeq 155
//    134  aload_1 [arg0]
//    135  instanceof javax.net.ssl.SSLHandshakeException [515]
//    138  ifeq 148
//    141  bipush 40
//    143  istore 4
//    145  goto 159
//    148  bipush 10
//    150  istore 4
//    152  goto 159
//    155  bipush 80
//    157  istore 4
//    159  aload_0 [this]
//    160  iload 4
//    162  aload_1 [arg0]
//    163  invokevirtual sun.security.ssl.SSLSocketImpl.fatal(byte, java.lang.Throwable) : void [1132]
//    166  return
//      Exception Table:
//        [pc: 113, pc: 120] -> 123 when : java.io.IOException
//      Line numbers:
//        [pc: 0, line: 1853]
//        [pc: 14, line: 1854]
//        [pc: 40, line: 1855]
//        [pc: 49, line: 1854]
//        [pc: 52, line: 1860]
//        [pc: 63, line: 1861]
//        [pc: 68, line: 1866]
//        [pc: 75, line: 1867]
//        [pc: 82, line: 1868]
//        [pc: 87, line: 1873]
//        [pc: 97, line: 1879]
//        [pc: 102, line: 1880]
//        [pc: 113, line: 1885]
//        [pc: 120, line: 1888]
//        [pc: 123, line: 1886]
//        [pc: 125, line: 1890]
//        [pc: 130, line: 1895]
//        [pc: 134, line: 1896]
//        [pc: 141, line: 1897]
//        [pc: 148, line: 1899]
//        [pc: 155, line: 1902]
//        [pc: 159, line: 1904]
//        [pc: 166, line: 1905]
//      Stack map table: number of frames 10
//        [pc: 52, same]
//        [pc: 68, same]
//        [pc: 87, same]
//        [pc: 97, same]
//        [pc: 123, full, stack: {java.io.IOException}, locals: {sun.security.ssl.SSLSocketImpl, java.lang.Exception, int, int}]
//        [pc: 125, same]
//        [pc: 130, same]
//        [pc: 148, same]
//        [pc: 155, same]
//        [pc: 159, append: {int}]
//  
//  // Method descriptor #53 (B)V
//  // Stack: 3, Locals: 2
//  void warning(byte arg0);
//    0  aload_0 [this]
//    1  iconst_1
//    2  iload_1 [arg0]
//    3  invokespecial sun.security.ssl.SSLSocketImpl.sendAlert(byte, byte) : void [1123]
//    6  return
//      Line numbers:
//        [pc: 0, line: 1911]
//        [pc: 6, line: 1912]
//  
//  // Method descriptor #581 (BLjava/lang/String;)V
//  // Stack: 4, Locals: 3
//  synchronized void fatal(byte arg0, java.lang.String arg1) throws java.io.IOException;
//    0  aload_0 [this]
//    1  iload_1 [arg0]
//    2  aload_2 [arg1]
//    3  aconst_null
//    4  invokevirtual sun.security.ssl.SSLSocketImpl.fatal(byte, java.lang.String, java.lang.Throwable) : void [1143]
//    7  return
//      Line numbers:
//        [pc: 0, line: 1916]
//        [pc: 7, line: 1917]
//  
//  // Method descriptor #591 (BLjava/lang/Throwable;)V
//  // Stack: 4, Locals: 3
//  synchronized void fatal(byte arg0, java.lang.Throwable arg1) throws java.io.IOException;
//    0  aload_0 [this]
//    1  iload_1 [arg0]
//    2  aconst_null
//    3  aload_2 [arg1]
//    4  invokevirtual sun.security.ssl.SSLSocketImpl.fatal(byte, java.lang.String, java.lang.Throwable) : void [1143]
//    7  return
//      Line numbers:
//        [pc: 0, line: 1921]
//        [pc: 7, line: 1922]
//  
//  // Method descriptor #646 (BLjava/lang/String;Ljava/lang/Throwable;)V
//  // Stack: 4, Locals: 5
//  synchronized void fatal(byte arg0, java.lang.String arg1, java.lang.Throwable arg2) throws java.io.IOException;
//      0  aload_0 [this]
//      1  getfield sun.security.ssl.SSLSocketImpl.input : sun.security.ssl.AppInputStream [940]
//      4  ifnull 27
//      7  aload_0 [this]
//      8  getfield sun.security.ssl.SSLSocketImpl.input : sun.security.ssl.AppInputStream [940]
//     11  getfield sun.security.ssl.AppInputStream.r : sun.security.ssl.InputRecord [896]
//     14  ifnull 27
//     17  aload_0 [this]
//     18  getfield sun.security.ssl.SSLSocketImpl.input : sun.security.ssl.AppInputStream [940]
//     21  getfield sun.security.ssl.AppInputStream.r : sun.security.ssl.InputRecord [896]
//     24  invokevirtual sun.security.ssl.InputRecord.close() : void [1081]
//     27  aload_0 [this]
//     28  getfield sun.security.ssl.SSLSocketImpl.sess : sun.security.ssl.SSLSessionImpl [954]
//     31  invokevirtual sun.security.ssl.SSLSessionImpl.invalidate() : void [1105]
//     34  aload_0 [this]
//     35  getfield sun.security.ssl.SSLSocketImpl.handshakeSession : sun.security.ssl.SSLSessionImpl [953]
//     38  ifnull 48
//     41  aload_0 [this]
//     42  getfield sun.security.ssl.SSLSocketImpl.handshakeSession : sun.security.ssl.SSLSessionImpl [953]
//     45  invokevirtual sun.security.ssl.SSLSessionImpl.invalidate() : void [1105]
//     48  aload_0 [this]
//     49  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//     52  istore 4
//     54  aload_0 [this]
//     55  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//     58  iconst_4
//     59  if_icmpge 67
//     62  aload_0 [this]
//     63  iconst_4
//     64  putfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//     67  aload_0 [this]
//     68  getfield sun.security.ssl.SSLSocketImpl.closeReason : javax.net.ssl.SSLException [939]
//     71  ifnonnull 135
//     74  iload 4
//     76  iconst_1
//     77  if_icmpne 96
//     80  aload_0 [this]
//     81  getfield sun.security.ssl.SSLSocketImpl.sockInput : java.io.InputStream [927]
//     84  aload_0 [this]
//     85  getfield sun.security.ssl.SSLSocketImpl.sockInput : java.io.InputStream [927]
//     88  invokevirtual java.io.InputStream.available() : int [957]
//     91  i2l
//     92  invokevirtual java.io.InputStream.skip(long) : long [958]
//     95  pop2
//     96  iload_1 [arg0]
//     97  iconst_m1
//     98  if_icmpeq 107
//    101  aload_0 [this]
//    102  iconst_2
//    103  iload_1 [arg0]
//    104  invokespecial sun.security.ssl.SSLSocketImpl.sendAlert(byte, byte) : void [1123]
//    107  aload_3 [arg2]
//    108  instanceof javax.net.ssl.SSLException [514]
//    111  ifeq 125
//    114  aload_0 [this]
//    115  aload_3 [arg2]
//    116  checkcast javax.net.ssl.SSLException [514]
//    119  putfield sun.security.ssl.SSLSocketImpl.closeReason : javax.net.ssl.SSLException [939]
//    122  goto 135
//    125  aload_0 [this]
//    126  iload_1 [arg0]
//    127  aload_3 [arg2]
//    128  aload_2 [arg1]
//    129  invokestatic sun.security.ssl.Alerts.getSSLException(byte, java.lang.Throwable, java.lang.String) : javax.net.ssl.SSLException [1024]
//    132  putfield sun.security.ssl.SSLSocketImpl.closeReason : javax.net.ssl.SSLException [939]
//    135  aload_0 [this]
//    136  invokevirtual sun.security.ssl.SSLSocketImpl.closeSocket() : void [1111]
//    139  aload_0 [this]
//    140  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    143  bipush 6
//    145  if_icmpge 180
//    148  aload_0 [this]
//    149  iload 4
//    151  bipush 7
//    153  if_icmpne 161
//    156  bipush 7
//    158  goto 163
//    161  bipush 6
//    163  putfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    166  aload_0 [this]
//    167  getfield sun.security.ssl.SSLSocketImpl.readCipher : sun.security.ssl.CipherBox [944]
//    170  invokevirtual sun.security.ssl.CipherBox.dispose() : void [1044]
//    173  aload_0 [this]
//    174  getfield sun.security.ssl.SSLSocketImpl.writeCipher : sun.security.ssl.CipherBox [945]
//    177  invokevirtual sun.security.ssl.CipherBox.dispose() : void [1044]
//    180  aload_0 [this]
//    181  getfield sun.security.ssl.SSLSocketImpl.closeReason : javax.net.ssl.SSLException [939]
//    184  athrow
//      Line numbers:
//        [pc: 0, line: 1930]
//        [pc: 17, line: 1931]
//        [pc: 27, line: 1933]
//        [pc: 34, line: 1934]
//        [pc: 41, line: 1935]
//        [pc: 48, line: 1938]
//        [pc: 54, line: 1939]
//        [pc: 62, line: 1940]
//        [pc: 67, line: 1948]
//        [pc: 74, line: 1952]
//        [pc: 80, line: 1953]
//        [pc: 96, line: 1957]
//        [pc: 101, line: 1958]
//        [pc: 107, line: 1960]
//        [pc: 114, line: 1961]
//        [pc: 125, line: 1963]
//        [pc: 129, line: 1964]
//        [pc: 135, line: 1971]
//        [pc: 139, line: 1973]
//        [pc: 148, line: 1974]
//        [pc: 166, line: 1979]
//        [pc: 173, line: 1980]
//        [pc: 180, line: 1983]
//      Stack map table: number of frames 10
//        [pc: 27, same]
//        [pc: 48, same]
//        [pc: 67, append: {int}]
//        [pc: 96, same]
//        [pc: 107, same]
//        [pc: 125, same]
//        [pc: 135, same]
//        [pc: 161, same_locals_1_stack_item, stack: {sun.security.ssl.SSLSocketImpl}]
//        [pc: 163, full, stack: {sun.security.ssl.SSLSocketImpl, int}, locals: {sun.security.ssl.SSLSocketImpl, int, java.lang.String, java.lang.Throwable, int}]
//        [pc: 180, same]
//  
//  // Method descriptor #622 (Lsun/security/ssl/InputRecord;)V
//  // Stack: 4, Locals: 6
//  private void recvAlert(sun.security.ssl.InputRecord arg0) throws java.io.IOException;
//      0  aload_1 [arg0]
//      1  invokevirtual sun.security.ssl.InputRecord.read() : int [1079]
//      4  i2b
//      5  istore_2
//      6  aload_1 [arg0]
//      7  invokevirtual sun.security.ssl.InputRecord.read() : int [1079]
//     10  i2b
//     11  istore_3
//     12  iload_3
//     13  iconst_m1
//     14  if_icmpne 26
//     17  aload_0 [this]
//     18  bipush 47
//     20  ldc_w <String "Short alert message"> [462]
//     23  invokevirtual sun.security.ssl.SSLSocketImpl.fatal(byte, java.lang.String) : void [1131]
//     26  getstatic sun.security.ssl.SSLSocketImpl.debug : sun.security.ssl.Debug [947]
//     29  ifnull 197
//     32  ldc_w <String "record"> [473]
//     35  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [1049]
//     38  ifne 49
//     41  ldc <String "handshake"> [39]
//     43  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [1049]
//     46  ifeq 197
//     49  getstatic java.lang.System.out : java.io.PrintStream [894]
//     52  dup
//     53  astore 4
//     55  monitorenter
//     56  getstatic java.lang.System.out : java.io.PrintStream [894]
//     59  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [985]
//     62  invokevirtual java.lang.Thread.getName() : java.lang.String [984]
//     65  invokevirtual java.io.PrintStream.print(java.lang.String) : void [959]
//     68  getstatic java.lang.System.out : java.io.PrintStream [894]
//     71  new java.lang.StringBuilder [493]
//     74  dup
//     75  invokespecial java.lang.StringBuilder() [975]
//     78  ldc_w <String ", RECV "> [449]
//     81  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//     84  aload_0 [this]
//     85  getfield sun.security.ssl.SSLSocketImpl.protocolVersion : sun.security.ssl.ProtocolVersion [951]
//     88  invokevirtual java.lang.StringBuilder.append(java.lang.Object) : java.lang.StringBuilder [979]
//     91  ldc_w <String " ALERT:  "> [445]
//     94  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//     97  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    100  invokevirtual java.io.PrintStream.print(java.lang.String) : void [959]
//    103  iload_2
//    104  iconst_2
//    105  if_icmpne 120
//    108  getstatic java.lang.System.out : java.io.PrintStream [894]
//    111  ldc_w <String "fatal, "> [468]
//    114  invokevirtual java.io.PrintStream.print(java.lang.String) : void [959]
//    117  goto 173
//    120  iload_2
//    121  iconst_1
//    122  if_icmpne 137
//    125  getstatic java.lang.System.out : java.io.PrintStream [894]
//    128  ldc_w <String "warning, "> [474]
//    131  invokevirtual java.io.PrintStream.print(java.lang.String) : void [959]
//    134  goto 173
//    137  getstatic java.lang.System.out : java.io.PrintStream [894]
//    140  new java.lang.StringBuilder [493]
//    143  dup
//    144  invokespecial java.lang.StringBuilder() [975]
//    147  ldc_w <String "<level "> [455]
//    150  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    153  sipush 255
//    156  iload_2
//    157  iand
//    158  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [977]
//    161  ldc_w <String ">, "> [457]
//    164  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    167  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    170  invokevirtual java.io.PrintStream.print(java.lang.String) : void [959]
//    173  getstatic java.lang.System.out : java.io.PrintStream [894]
//    176  iload_3
//    177  invokestatic sun.security.ssl.Alerts.alertDescription(byte) : java.lang.String [1022]
//    180  invokevirtual java.io.PrintStream.println(java.lang.String) : void [960]
//    183  aload 4
//    185  monitorexit
//    186  goto 197
//    189  astore 5
//    191  aload 4
//    193  monitorexit
//    194  aload 5
//    196  athrow
//    197  iload_2
//    198  iconst_1
//    199  if_icmpne 252
//    202  iload_3
//    203  ifne 234
//    206  aload_0 [this]
//    207  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    210  iconst_1
//    211  if_icmpne 226
//    214  aload_0 [this]
//    215  bipush 10
//    217  ldc_w <String "Received close_notify during handshake"> [460]
//    220  invokevirtual sun.security.ssl.SSLSocketImpl.fatal(byte, java.lang.String) : void [1131]
//    223  goto 302
//    226  aload_0 [this]
//    227  iconst_0
//    228  invokespecial sun.security.ssl.SSLSocketImpl.closeInternal(boolean) : void [1125]
//    231  goto 302
//    234  aload_0 [this]
//    235  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    238  ifnull 302
//    241  aload_0 [this]
//    242  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    245  iload_3
//    246  invokevirtual sun.security.ssl.Handshaker.handshakeAlert(byte) : void [1061]
//    249  goto 302
//    252  new java.lang.StringBuilder [493]
//    255  dup
//    256  invokespecial java.lang.StringBuilder() [975]
//    259  ldc_w <String "Received fatal alert: "> [461]
//    262  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    265  iload_3
//    266  invokestatic sun.security.ssl.Alerts.alertDescription(byte) : java.lang.String [1022]
//    269  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    272  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    275  astore 4
//    277  aload_0 [this]
//    278  getfield sun.security.ssl.SSLSocketImpl.closeReason : javax.net.ssl.SSLException [939]
//    281  ifnonnull 294
//    284  aload_0 [this]
//    285  iload_3
//    286  aload 4
//    288  invokestatic sun.security.ssl.Alerts.getSSLException(byte, java.lang.String) : javax.net.ssl.SSLException [1023]
//    291  putfield sun.security.ssl.SSLSocketImpl.closeReason : javax.net.ssl.SSLException [939]
//    294  aload_0 [this]
//    295  bipush 10
//    297  aload 4
//    299  invokevirtual sun.security.ssl.SSLSocketImpl.fatal(byte, java.lang.String) : void [1131]
//    302  return
//      Exception Table:
//        [pc: 56, pc: 186] -> 189 when : any
//        [pc: 189, pc: 194] -> 189 when : any
//      Line numbers:
//        [pc: 0, line: 1992]
//        [pc: 6, line: 1993]
//        [pc: 12, line: 1994]
//        [pc: 17, line: 1995]
//        [pc: 26, line: 1998]
//        [pc: 43, line: 1999]
//        [pc: 49, line: 2000]
//        [pc: 56, line: 2001]
//        [pc: 68, line: 2002]
//        [pc: 103, line: 2003]
//        [pc: 108, line: 2004]
//        [pc: 120, line: 2005]
//        [pc: 125, line: 2006]
//        [pc: 137, line: 2008]
//        [pc: 173, line: 2010]
//        [pc: 183, line: 2011]
//        [pc: 197, line: 2014]
//        [pc: 202, line: 2015]
//        [pc: 206, line: 2016]
//        [pc: 214, line: 2017]
//        [pc: 226, line: 2020]
//        [pc: 234, line: 2030]
//        [pc: 241, line: 2031]
//        [pc: 252, line: 2035]
//        [pc: 266, line: 2036]
//        [pc: 277, line: 2037]
//        [pc: 284, line: 2038]
//        [pc: 294, line: 2040]
//        [pc: 302, line: 2042]
//      Stack map table: number of frames 12
//        [pc: 26, append: {int, int}]
//        [pc: 49, same]
//        [pc: 120, append: {java.lang.Object}]
//        [pc: 137, same]
//        [pc: 173, same]
//        [pc: 189, same_locals_1_stack_item, stack: {java.lang.Throwable}]
//        [pc: 197, chop 1 local(s)]
//        [pc: 226, same]
//        [pc: 234, same]
//        [pc: 252, same]
//        [pc: 294, append: {java.lang.String}]
//        [pc: 302, chop 1 local(s)]
//  
//  // Method descriptor #55 (BB)V
//  // Stack: 4, Locals: 7
//  private void sendAlert(byte arg0, byte arg1);
//      0  aload_0 [this]
//      1  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//      4  iconst_5
//      5  if_icmplt 9
//      8  return
//      9  aload_0 [this]
//     10  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//     13  iconst_1
//     14  if_icmpne 35
//     17  aload_0 [this]
//     18  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//     21  ifnull 34
//     24  aload_0 [this]
//     25  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//     28  invokevirtual sun.security.ssl.Handshaker.started() : boolean [1058]
//     31  ifne 35
//     34  return
//     35  new sun.security.ssl.OutputRecord [533]
//     38  dup
//     39  bipush 21
//     41  invokespecial sun.security.ssl.OutputRecord(byte) [1092]
//     44  astore_3
//     45  aload_3
//     46  aload_0 [this]
//     47  getfield sun.security.ssl.SSLSocketImpl.protocolVersion : sun.security.ssl.ProtocolVersion [951]
//     50  invokevirtual sun.security.ssl.OutputRecord.setVersion(sun.security.ssl.ProtocolVersion) : void [1095]
//     53  getstatic sun.security.ssl.SSLSocketImpl.debug : sun.security.ssl.Debug [947]
//     56  ifnull 71
//     59  ldc <String "ssl"> [44]
//     61  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [1049]
//     64  ifeq 71
//     67  iconst_1
//     68  goto 72
//     71  iconst_0
//     72  istore 4
//     74  iload 4
//     76  ifeq 246
//     79  getstatic java.lang.System.out : java.io.PrintStream [894]
//     82  dup
//     83  astore 5
//     85  monitorenter
//     86  getstatic java.lang.System.out : java.io.PrintStream [894]
//     89  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [985]
//     92  invokevirtual java.lang.Thread.getName() : java.lang.String [984]
//     95  invokevirtual java.io.PrintStream.print(java.lang.String) : void [959]
//     98  getstatic java.lang.System.out : java.io.PrintStream [894]
//    101  new java.lang.StringBuilder [493]
//    104  dup
//    105  invokespecial java.lang.StringBuilder() [975]
//    108  ldc_w <String ", SEND "> [450]
//    111  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    114  aload_0 [this]
//    115  getfield sun.security.ssl.SSLSocketImpl.protocolVersion : sun.security.ssl.ProtocolVersion [951]
//    118  invokevirtual java.lang.StringBuilder.append(java.lang.Object) : java.lang.StringBuilder [979]
//    121  ldc_w <String " ALERT:  "> [445]
//    124  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    127  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    130  invokevirtual java.io.PrintStream.print(java.lang.String) : void [959]
//    133  iload_1 [arg0]
//    134  iconst_2
//    135  if_icmpne 150
//    138  getstatic java.lang.System.out : java.io.PrintStream [894]
//    141  ldc_w <String "fatal, "> [468]
//    144  invokevirtual java.io.PrintStream.print(java.lang.String) : void [959]
//    147  goto 203
//    150  iload_1 [arg0]
//    151  iconst_1
//    152  if_icmpne 167
//    155  getstatic java.lang.System.out : java.io.PrintStream [894]
//    158  ldc_w <String "warning, "> [474]
//    161  invokevirtual java.io.PrintStream.print(java.lang.String) : void [959]
//    164  goto 203
//    167  getstatic java.lang.System.out : java.io.PrintStream [894]
//    170  new java.lang.StringBuilder [493]
//    173  dup
//    174  invokespecial java.lang.StringBuilder() [975]
//    177  ldc_w <String "<level = "> [456]
//    180  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    183  sipush 255
//    186  iload_1 [arg0]
//    187  iand
//    188  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [977]
//    191  ldc_w <String ">, "> [457]
//    194  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    197  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    200  invokevirtual java.io.PrintStream.print(java.lang.String) : void [959]
//    203  getstatic java.lang.System.out : java.io.PrintStream [894]
//    206  new java.lang.StringBuilder [493]
//    209  dup
//    210  invokespecial java.lang.StringBuilder() [975]
//    213  ldc_w <String "description = "> [467]
//    216  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    219  iload_2 [arg1]
//    220  invokestatic sun.security.ssl.Alerts.alertDescription(byte) : java.lang.String [1022]
//    223  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    226  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    229  invokevirtual java.io.PrintStream.println(java.lang.String) : void [960]
//    232  aload 5
//    234  monitorexit
//    235  goto 246
//    238  astore 6
//    240  aload 5
//    242  monitorexit
//    243  aload 6
//    245  athrow
//    246  aload_3
//    247  iload_1 [arg0]
//    248  invokevirtual sun.security.ssl.OutputRecord.write(int) : void [1094]
//    251  aload_3
//    252  iload_2 [arg1]
//    253  invokevirtual sun.security.ssl.OutputRecord.write(int) : void [1094]
//    256  aload_0 [this]
//    257  aload_3
//    258  invokevirtual sun.security.ssl.SSLSocketImpl.writeRecord(sun.security.ssl.OutputRecord) : void [1139]
//    261  goto 307
//    264  astore 5
//    266  iload 4
//    268  ifeq 307
//    271  getstatic java.lang.System.out : java.io.PrintStream [894]
//    274  new java.lang.StringBuilder [493]
//    277  dup
//    278  invokespecial java.lang.StringBuilder() [975]
//    281  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [985]
//    284  invokevirtual java.lang.Thread.getName() : java.lang.String [984]
//    287  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    290  ldc_w <String ", Exception sending alert: "> [447]
//    293  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    296  aload 5
//    298  invokevirtual java.lang.StringBuilder.append(java.lang.Object) : java.lang.StringBuilder [979]
//    301  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    304  invokevirtual java.io.PrintStream.println(java.lang.String) : void [960]
//    307  return
//      Exception Table:
//        [pc: 86, pc: 235] -> 238 when : any
//        [pc: 238, pc: 243] -> 238 when : any
//        [pc: 256, pc: 261] -> 264 when : java.io.IOException
//      Line numbers:
//        [pc: 0, line: 2050]
//        [pc: 8, line: 2051]
//        [pc: 9, line: 2056]
//        [pc: 28, line: 2057]
//        [pc: 34, line: 2058]
//        [pc: 35, line: 2061]
//        [pc: 45, line: 2062]
//        [pc: 53, line: 2064]
//        [pc: 74, line: 2065]
//        [pc: 79, line: 2066]
//        [pc: 86, line: 2067]
//        [pc: 98, line: 2068]
//        [pc: 133, line: 2069]
//        [pc: 138, line: 2070]
//        [pc: 150, line: 2071]
//        [pc: 155, line: 2072]
//        [pc: 167, line: 2074]
//        [pc: 203, line: 2076]
//        [pc: 220, line: 2077]
//        [pc: 229, line: 2076]
//        [pc: 232, line: 2078]
//        [pc: 246, line: 2081]
//        [pc: 251, line: 2082]
//        [pc: 256, line: 2084]
//        [pc: 261, line: 2090]
//        [pc: 264, line: 2085]
//        [pc: 266, line: 2086]
//        [pc: 271, line: 2087]
//        [pc: 307, line: 2091]
//      Stack map table: number of frames 12
//        [pc: 9, same]
//        [pc: 34, same]
//        [pc: 35, same]
//        [pc: 71, append: {sun.security.ssl.OutputRecord}]
//        [pc: 72, same_locals_1_stack_item, stack: {int}]
//        [pc: 150, append: {int, java.lang.Object}]
//        [pc: 167, same]
//        [pc: 203, same]
//        [pc: 238, same_locals_1_stack_item, stack: {java.lang.Throwable}]
//        [pc: 246, chop 1 local(s)]
//        [pc: 264, same_locals_1_stack_item, stack: {java.io.IOException}]
//        [pc: 307, same]
//  
//  // Method descriptor #50 ()V
//  // Stack: 4, Locals: 3
//  private void changeReadCiphers() throws javax.net.ssl.SSLException;
//     0  aload_0 [this]
//     1  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//     4  iconst_1
//     5  if_icmpeq 27
//     8  aload_0 [this]
//     9  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    12  iconst_3
//    13  if_icmpeq 27
//    16  new javax.net.ssl.SSLProtocolException [517]
//    19  dup
//    20  ldc_w <String "State error, change cipher specs"> [463]
//    23  invokespecial javax.net.ssl.SSLProtocolException(java.lang.String) [1020]
//    26  athrow
//    27  aload_0 [this]
//    28  getfield sun.security.ssl.SSLSocketImpl.readCipher : sun.security.ssl.CipherBox [944]
//    31  astore_1
//    32  aload_0 [this]
//    33  aload_0 [this]
//    34  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    37  invokevirtual sun.security.ssl.Handshaker.newReadCipher() : sun.security.ssl.CipherBox [1070]
//    40  putfield sun.security.ssl.SSLSocketImpl.readCipher : sun.security.ssl.CipherBox [944]
//    43  aload_0 [this]
//    44  aload_0 [this]
//    45  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    48  invokevirtual sun.security.ssl.Handshaker.newReadAuthenticator() : sun.security.ssl.Authenticator [1068]
//    51  putfield sun.security.ssl.SSLSocketImpl.readAuthenticator : sun.security.ssl.Authenticator [942]
//    54  goto 70
//    57  astore_2
//    58  new javax.net.ssl.SSLException [514]
//    61  dup
//    62  ldc_w <String "Algorithm missing:  "> [458]
//    65  aload_2
//    66  invokespecial javax.net.ssl.SSLException(java.lang.String, java.lang.Throwable) [1007]
//    69  athrow
//    70  aload_1
//    71  invokevirtual sun.security.ssl.CipherBox.dispose() : void [1044]
//    74  return
//      Exception Table:
//        [pc: 32, pc: 54] -> 57 when : java.security.GeneralSecurityException
//      Line numbers:
//        [pc: 0, line: 2111]
//        [pc: 16, line: 2113]
//        [pc: 27, line: 2119]
//        [pc: 32, line: 2122]
//        [pc: 43, line: 2123]
//        [pc: 54, line: 2127]
//        [pc: 57, line: 2124]
//        [pc: 58, line: 2126]
//        [pc: 70, line: 2137]
//        [pc: 74, line: 2138]
//      Stack map table: number of frames 3
//        [pc: 27, same]
//        [pc: 57, full, stack: {java.security.GeneralSecurityException}, locals: {sun.security.ssl.SSLSocketImpl, sun.security.ssl.CipherBox}]
//        [pc: 70, same]
//  
//  // Method descriptor #50 ()V
//  // Stack: 4, Locals: 3
//  void changeWriteCiphers() throws javax.net.ssl.SSLException;
//     0  aload_0 [this]
//     1  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//     4  iconst_1
//     5  if_icmpeq 27
//     8  aload_0 [this]
//     9  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    12  iconst_3
//    13  if_icmpeq 27
//    16  new javax.net.ssl.SSLProtocolException [517]
//    19  dup
//    20  ldc_w <String "State error, change cipher specs"> [463]
//    23  invokespecial javax.net.ssl.SSLProtocolException(java.lang.String) [1020]
//    26  athrow
//    27  aload_0 [this]
//    28  getfield sun.security.ssl.SSLSocketImpl.writeCipher : sun.security.ssl.CipherBox [945]
//    31  astore_1
//    32  aload_0 [this]
//    33  aload_0 [this]
//    34  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    37  invokevirtual sun.security.ssl.Handshaker.newWriteCipher() : sun.security.ssl.CipherBox [1071]
//    40  putfield sun.security.ssl.SSLSocketImpl.writeCipher : sun.security.ssl.CipherBox [945]
//    43  aload_0 [this]
//    44  aload_0 [this]
//    45  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    48  invokevirtual sun.security.ssl.Handshaker.newWriteAuthenticator() : sun.security.ssl.Authenticator [1069]
//    51  putfield sun.security.ssl.SSLSocketImpl.writeAuthenticator : sun.security.ssl.Authenticator [943]
//    54  goto 70
//    57  astore_2
//    58  new javax.net.ssl.SSLException [514]
//    61  dup
//    62  ldc_w <String "Algorithm missing:  "> [458]
//    65  aload_2
//    66  invokespecial javax.net.ssl.SSLException(java.lang.String, java.lang.Throwable) [1007]
//    69  athrow
//    70  aload_1
//    71  invokevirtual sun.security.ssl.CipherBox.dispose() : void [1044]
//    74  aload_0 [this]
//    75  iconst_1
//    76  putfield sun.security.ssl.SSLSocketImpl.isFirstAppOutputRecord : boolean [915]
//    79  return
//      Exception Table:
//        [pc: 32, pc: 54] -> 57 when : java.security.GeneralSecurityException
//      Line numbers:
//        [pc: 0, line: 2142]
//        [pc: 16, line: 2144]
//        [pc: 27, line: 2150]
//        [pc: 32, line: 2153]
//        [pc: 43, line: 2154]
//        [pc: 54, line: 2158]
//        [pc: 57, line: 2155]
//        [pc: 58, line: 2157]
//        [pc: 70, line: 2161]
//        [pc: 74, line: 2164]
//        [pc: 79, line: 2165]
//      Stack map table: number of frames 3
//        [pc: 27, same]
//        [pc: 57, full, stack: {java.security.GeneralSecurityException}, locals: {sun.security.ssl.SSLSocketImpl, sun.security.ssl.CipherBox}]
//        [pc: 70, same]
//  
//  // Method descriptor #631 (Lsun/security/ssl/ProtocolVersion;)V
//  // Stack: 2, Locals: 2
//  synchronized void setVersion(sun.security.ssl.ProtocolVersion arg0);
//     0  aload_0 [this]
//     1  aload_1 [arg0]
//     2  putfield sun.security.ssl.SSLSocketImpl.protocolVersion : sun.security.ssl.ProtocolVersion [951]
//     5  aload_0 [this]
//     6  getfield sun.security.ssl.SSLSocketImpl.output : sun.security.ssl.AppOutputStream [941]
//     9  getfield sun.security.ssl.AppOutputStream.r : sun.security.ssl.OutputRecord [897]
//    12  aload_1 [arg0]
//    13  invokevirtual sun.security.ssl.OutputRecord.setVersion(sun.security.ssl.ProtocolVersion) : void [1095]
//    16  return
//      Line numbers:
//        [pc: 0, line: 2172]
//        [pc: 5, line: 2173]
//        [pc: 16, line: 2174]
//  
//  // Method descriptor #578 ()Ljava/lang/String;
//  // Stack: 2, Locals: 1
//  synchronized java.lang.String getHost();
//     0  aload_0 [this]
//     1  getfield sun.security.ssl.SSLSocketImpl.host : java.lang.String [931]
//     4  ifnull 17
//     7  aload_0 [this]
//     8  getfield sun.security.ssl.SSLSocketImpl.host : java.lang.String [931]
//    11  invokevirtual java.lang.String.length() : int [971]
//    14  ifne 22
//    17  aload_0 [this]
//    18  iconst_1
//    19  invokespecial sun.security.ssl.SSLSocketImpl.useImplicitHost(boolean) : void [1128]
//    22  aload_0 [this]
//    23  getfield sun.security.ssl.SSLSocketImpl.host : java.lang.String [931]
//    26  areturn
//      Line numbers:
//        [pc: 0, line: 2181]
//        [pc: 17, line: 2182]
//        [pc: 22, line: 2185]
//      Stack map table: number of frames 2
//        [pc: 17, same]
//        [pc: 22, same]
//  
//  // Method descriptor #59 (Z)V
//  // Stack: 3, Locals: 5
//  private synchronized void useImplicitHost(boolean arg0);
//      0  aload_0 [this]
//      1  invokevirtual sun.security.ssl.SSLSocketImpl.getInetAddress() : java.net.InetAddress [1133]
//      4  astore_2
//      5  aload_2
//      6  ifnonnull 10
//      9  return
//     10  invokestatic sun.misc.SharedSecrets.getJavaNetAccess() : sun.misc.JavaNetAccess [1021]
//     13  astore_3
//     14  aload_3
//     15  aload_2
//     16  invokeinterface sun.misc.JavaNetAccess.getOriginalHostName(java.net.InetAddress) : java.lang.String [1150] [nargs: 2]
//     21  astore 4
//     23  aload 4
//     25  ifnull 116
//     28  aload 4
//     30  invokevirtual java.lang.String.length() : int [971]
//     33  ifeq 116
//     36  aload_0 [this]
//     37  aload 4
//     39  putfield sun.security.ssl.SSLSocketImpl.host : java.lang.String [931]
//     42  iload_1 [arg0]
//     43  ifne 115
//     46  aload_0 [this]
//     47  getfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//     50  invokeinterface java.util.List.isEmpty() : boolean [1149] [nargs: 1]
//     55  ifeq 115
//     58  aload_0 [this]
//     59  getfield sun.security.ssl.SSLSocketImpl.noSniExtension : boolean [916]
//     62  ifne 115
//     65  aload_0 [this]
//     66  aload_0 [this]
//     67  getfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//     70  aload_0 [this]
//     71  getfield sun.security.ssl.SSLSocketImpl.host : java.lang.String [931]
//     74  invokestatic sun.security.ssl.Utilities.addToSNIServerNameList(java.util.List, java.lang.String) : java.util.List [1147]
//     77  putfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//     80  aload_0 [this]
//     81  getfield sun.security.ssl.SSLSocketImpl.roleIsServer : boolean [921]
//     84  ifne 115
//     87  aload_0 [this]
//     88  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//     91  ifnull 115
//     94  aload_0 [this]
//     95  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//     98  invokevirtual sun.security.ssl.Handshaker.started() : boolean [1058]
//    101  ifne 115
//    104  aload_0 [this]
//    105  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    108  aload_0 [this]
//    109  getfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//    112  invokevirtual sun.security.ssl.Handshaker.setSNIServerNames(java.util.List) : void [1067]
//    115  return
//    116  getstatic sun.security.ssl.SSLSocketImpl.trustNameService : boolean [923]
//    119  ifne 133
//    122  aload_0 [this]
//    123  aload_2
//    124  invokevirtual java.net.InetAddress.getHostAddress() : java.lang.String [986]
//    127  putfield sun.security.ssl.SSLSocketImpl.host : java.lang.String [931]
//    130  goto 144
//    133  aload_0 [this]
//    134  aload_0 [this]
//    135  invokevirtual sun.security.ssl.SSLSocketImpl.getInetAddress() : java.net.InetAddress [1133]
//    138  invokevirtual java.net.InetAddress.getHostName() : java.lang.String [987]
//    141  putfield sun.security.ssl.SSLSocketImpl.host : java.lang.String [931]
//    144  return
//      Line numbers:
//        [pc: 0, line: 2199]
//        [pc: 5, line: 2200]
//        [pc: 9, line: 2201]
//        [pc: 10, line: 2204]
//        [pc: 14, line: 2205]
//        [pc: 23, line: 2206]
//        [pc: 30, line: 2207]
//        [pc: 36, line: 2209]
//        [pc: 42, line: 2210]
//        [pc: 65, line: 2211]
//        [pc: 74, line: 2212]
//        [pc: 80, line: 2214]
//        [pc: 98, line: 2215]
//        [pc: 104, line: 2216]
//        [pc: 115, line: 2220]
//        [pc: 116, line: 2224]
//        [pc: 122, line: 2226]
//        [pc: 133, line: 2229]
//        [pc: 144, line: 2231]
//      Stack map table: number of frames 5
//        [pc: 10, append: {java.net.InetAddress}]
//        [pc: 115, append: {sun.misc.JavaNetAccess, java.lang.String}]
//        [pc: 116, same]
//        [pc: 133, same]
//        [pc: 144, same]
//  
//  // Method descriptor #583 (Ljava/lang/String;)V
//  // Stack: 3, Locals: 2
//  public synchronized void setHost(java.lang.String arg0);
//     0  aload_0 [this]
//     1  aload_1 [arg0]
//     2  putfield sun.security.ssl.SSLSocketImpl.host : java.lang.String [931]
//     5  aload_0 [this]
//     6  aload_0 [this]
//     7  getfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//    10  aload_0 [this]
//    11  getfield sun.security.ssl.SSLSocketImpl.host : java.lang.String [931]
//    14  invokestatic sun.security.ssl.Utilities.addToSNIServerNameList(java.util.List, java.lang.String) : java.util.List [1147]
//    17  putfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//    20  aload_0 [this]
//    21  getfield sun.security.ssl.SSLSocketImpl.roleIsServer : boolean [921]
//    24  ifne 55
//    27  aload_0 [this]
//    28  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    31  ifnull 55
//    34  aload_0 [this]
//    35  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    38  invokevirtual sun.security.ssl.Handshaker.started() : boolean [1058]
//    41  ifne 55
//    44  aload_0 [this]
//    45  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    48  aload_0 [this]
//    49  getfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//    52  invokevirtual sun.security.ssl.Handshaker.setSNIServerNames(java.util.List) : void [1067]
//    55  return
//      Line numbers:
//        [pc: 0, line: 2240]
//        [pc: 5, line: 2241]
//        [pc: 14, line: 2242]
//        [pc: 20, line: 2244]
//        [pc: 44, line: 2245]
//        [pc: 55, line: 2247]
//      Stack map table: number of frames 1
//        [pc: 55, same]
//  
//  // Method descriptor #574 ()Ljava/io/InputStream;
//  // Stack: 3, Locals: 1
//  public synchronized java.io.InputStream getInputStream() throws java.io.IOException;
//     0  aload_0 [this]
//     1  invokevirtual sun.security.ssl.SSLSocketImpl.isClosed() : boolean [1120]
//     4  ifeq 17
//     7  new java.net.SocketException [501]
//    10  dup
//    11  ldc <String "Socket is closed"> [31]
//    13  invokespecial java.net.SocketException(java.lang.String) [992]
//    16  athrow
//    17  aload_0 [this]
//    18  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    21  ifne 34
//    24  new java.net.SocketException [501]
//    27  dup
//    28  ldc <String "Socket is not connected"> [32]
//    30  invokespecial java.net.SocketException(java.lang.String) [992]
//    33  athrow
//    34  aload_0 [this]
//    35  getfield sun.security.ssl.SSLSocketImpl.input : sun.security.ssl.AppInputStream [940]
//    38  areturn
//      Line numbers:
//        [pc: 0, line: 2256]
//        [pc: 7, line: 2257]
//        [pc: 17, line: 2264]
//        [pc: 24, line: 2265]
//        [pc: 34, line: 2268]
//      Stack map table: number of frames 2
//        [pc: 17, same]
//        [pc: 34, same]
//  
//  // Method descriptor #575 ()Ljava/io/OutputStream;
//  // Stack: 3, Locals: 1
//  public synchronized java.io.OutputStream getOutputStream() throws java.io.IOException;
//     0  aload_0 [this]
//     1  invokevirtual sun.security.ssl.SSLSocketImpl.isClosed() : boolean [1120]
//     4  ifeq 17
//     7  new java.net.SocketException [501]
//    10  dup
//    11  ldc <String "Socket is closed"> [31]
//    13  invokespecial java.net.SocketException(java.lang.String) [992]
//    16  athrow
//    17  aload_0 [this]
//    18  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    21  ifne 34
//    24  new java.net.SocketException [501]
//    27  dup
//    28  ldc <String "Socket is not connected"> [32]
//    30  invokespecial java.net.SocketException(java.lang.String) [992]
//    33  athrow
//    34  aload_0 [this]
//    35  getfield sun.security.ssl.SSLSocketImpl.output : sun.security.ssl.AppOutputStream [941]
//    38  areturn
//      Line numbers:
//        [pc: 0, line: 2278]
//        [pc: 7, line: 2279]
//        [pc: 17, line: 2286]
//        [pc: 24, line: 2287]
//        [pc: 34, line: 2290]
//      Stack map table: number of frames 2
//        [pc: 17, same]
//        [pc: 34, same]
//  
//  // Method descriptor #610 ()Ljavax/net/ssl/SSLSession;
//  // Stack: 3, Locals: 3
//  public javax.net.ssl.SSLSession getSession();
//     0  aload_0 [this]
//     1  invokespecial sun.security.ssl.SSLSocketImpl.getConnectionState() : int [1107]
//     4  iconst_1
//     5  if_icmpne 66
//     8  aload_0 [this]
//     9  iconst_0
//    10  invokespecial sun.security.ssl.SSLSocketImpl.startHandshake(boolean) : void [1127]
//    13  goto 66
//    16  astore_1
//    17  getstatic sun.security.ssl.SSLSocketImpl.debug : sun.security.ssl.Debug [947]
//    20  ifnull 66
//    23  ldc <String "handshake"> [39]
//    25  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [1049]
//    28  ifeq 66
//    31  getstatic java.lang.System.out : java.io.PrintStream [894]
//    34  new java.lang.StringBuilder [493]
//    37  dup
//    38  invokespecial java.lang.StringBuilder() [975]
//    41  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [985]
//    44  invokevirtual java.lang.Thread.getName() : java.lang.String [984]
//    47  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    50  ldc_w <String ", IOException in getSession():  "> [448]
//    53  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    56  aload_1
//    57  invokevirtual java.lang.StringBuilder.append(java.lang.Object) : java.lang.StringBuilder [979]
//    60  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    63  invokevirtual java.io.PrintStream.println(java.lang.String) : void [960]
//    66  aload_0 [this]
//    67  dup
//    68  astore_1
//    69  monitorenter
//    70  aload_0 [this]
//    71  getfield sun.security.ssl.SSLSocketImpl.sess : sun.security.ssl.SSLSessionImpl [954]
//    74  aload_1
//    75  monitorexit
//    76  areturn
//    77  astore_2
//    78  aload_1
//    79  monitorexit
//    80  aload_2
//    81  athrow
//      Exception Table:
//        [pc: 8, pc: 13] -> 16 when : java.io.IOException
//        [pc: 70, pc: 76] -> 77 when : any
//        [pc: 77, pc: 80] -> 77 when : any
//      Line numbers:
//        [pc: 0, line: 2303]
//        [pc: 8, line: 2306]
//        [pc: 13, line: 2313]
//        [pc: 16, line: 2307]
//        [pc: 17, line: 2309]
//        [pc: 31, line: 2310]
//        [pc: 66, line: 2315]
//        [pc: 70, line: 2316]
//        [pc: 77, line: 2317]
//      Stack map table: number of frames 3
//        [pc: 16, same_locals_1_stack_item, stack: {java.io.IOException}]
//        [pc: 66, same]
//        [pc: 77, full, stack: {java.lang.Throwable}, locals: {sun.security.ssl.SSLSocketImpl, java.lang.Object}]
//  
//  // Method descriptor #610 ()Ljavax/net/ssl/SSLSession;
//  // Stack: 1, Locals: 1
//  public synchronized javax.net.ssl.SSLSession getHandshakeSession();
//    0  aload_0 [this]
//    1  getfield sun.security.ssl.SSLSocketImpl.handshakeSession : sun.security.ssl.SSLSessionImpl [953]
//    4  areturn
//      Line numbers:
//        [pc: 0, line: 2322]
//  
//  // Method descriptor #635 (Lsun/security/ssl/SSLSessionImpl;)V
//  // Stack: 2, Locals: 2
//  synchronized void setHandshakeSession(sun.security.ssl.SSLSessionImpl arg0);
//    0  aload_0 [this]
//    1  aload_1 [arg0]
//    2  putfield sun.security.ssl.SSLSocketImpl.handshakeSession : sun.security.ssl.SSLSessionImpl [953]
//    5  return
//      Line numbers:
//        [pc: 0, line: 2326]
//        [pc: 5, line: 2327]
//  
//  // Method descriptor #59 (Z)V
//  // Stack: 2, Locals: 2
//  public synchronized void setEnableSessionCreation(boolean arg0);
//     0  aload_0 [this]
//     1  iload_1 [arg0]
//     2  putfield sun.security.ssl.SSLSocketImpl.enableSessionCreation : boolean [913]
//     5  aload_0 [this]
//     6  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//     9  ifnull 33
//    12  aload_0 [this]
//    13  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    16  invokevirtual sun.security.ssl.Handshaker.activated() : boolean [1054]
//    19  ifne 33
//    22  aload_0 [this]
//    23  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    26  aload_0 [this]
//    27  getfield sun.security.ssl.SSLSocketImpl.enableSessionCreation : boolean [913]
//    30  invokevirtual sun.security.ssl.Handshaker.setEnableSessionCreation(boolean) : void [1062]
//    33  return
//      Line numbers:
//        [pc: 0, line: 2339]
//        [pc: 5, line: 2341]
//        [pc: 22, line: 2342]
//        [pc: 33, line: 2344]
//      Stack map table: number of frames 1
//        [pc: 33, same]
//  
//  // Method descriptor #51 ()Z
//  // Stack: 1, Locals: 1
//  public synchronized boolean getEnableSessionCreation();
//    0  aload_0 [this]
//    1  getfield sun.security.ssl.SSLSocketImpl.enableSessionCreation : boolean [913]
//    4  ireturn
//      Line numbers:
//        [pc: 0, line: 2352]
//  
//  // Method descriptor #59 (Z)V
//  // Stack: 2, Locals: 2
//  public synchronized void setNeedClientAuth(boolean arg0);
//     0  aload_0 [this]
//     1  iload_1 [arg0]
//     2  ifeq 9
//     5  iconst_2
//     6  goto 10
//     9  iconst_0
//    10  putfield sun.security.ssl.SSLSocketImpl.doClientAuth : byte [909]
//    13  aload_0 [this]
//    14  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    17  ifnull 54
//    20  aload_0 [this]
//    21  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    24  instanceof sun.security.ssl.ServerHandshaker [540]
//    27  ifeq 54
//    30  aload_0 [this]
//    31  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    34  invokevirtual sun.security.ssl.Handshaker.activated() : boolean [1054]
//    37  ifne 54
//    40  aload_0 [this]
//    41  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    44  checkcast sun.security.ssl.ServerHandshaker [540]
//    47  aload_0 [this]
//    48  getfield sun.security.ssl.SSLSocketImpl.doClientAuth : byte [909]
//    51  invokevirtual sun.security.ssl.ServerHandshaker.setClientAuth(byte) : void [1145]
//    54  return
//      Line numbers:
//        [pc: 0, line: 2366]
//        [pc: 13, line: 2369]
//        [pc: 34, line: 2371]
//        [pc: 40, line: 2372]
//        [pc: 54, line: 2374]
//      Stack map table: number of frames 3
//        [pc: 9, same_locals_1_stack_item, stack: {sun.security.ssl.SSLSocketImpl}]
//        [pc: 10, full, stack: {sun.security.ssl.SSLSocketImpl, int}, locals: {sun.security.ssl.SSLSocketImpl, int}]
//        [pc: 54, same]
//  
//  // Method descriptor #51 ()Z
//  // Stack: 2, Locals: 1
//  public synchronized boolean getNeedClientAuth();
//     0  aload_0 [this]
//     1  getfield sun.security.ssl.SSLSocketImpl.doClientAuth : byte [909]
//     4  iconst_2
//     5  if_icmpne 12
//     8  iconst_1
//     9  goto 13
//    12  iconst_0
//    13  ireturn
//      Line numbers:
//        [pc: 0, line: 2378]
//      Stack map table: number of frames 2
//        [pc: 12, same]
//        [pc: 13, same_locals_1_stack_item, stack: {int}]
//  
//  // Method descriptor #59 (Z)V
//  // Stack: 2, Locals: 2
//  public synchronized void setWantClientAuth(boolean arg0);
//     0  aload_0 [this]
//     1  iload_1 [arg0]
//     2  ifeq 9
//     5  iconst_1
//     6  goto 10
//     9  iconst_0
//    10  putfield sun.security.ssl.SSLSocketImpl.doClientAuth : byte [909]
//    13  aload_0 [this]
//    14  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    17  ifnull 54
//    20  aload_0 [this]
//    21  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    24  instanceof sun.security.ssl.ServerHandshaker [540]
//    27  ifeq 54
//    30  aload_0 [this]
//    31  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    34  invokevirtual sun.security.ssl.Handshaker.activated() : boolean [1054]
//    37  ifne 54
//    40  aload_0 [this]
//    41  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    44  checkcast sun.security.ssl.ServerHandshaker [540]
//    47  aload_0 [this]
//    48  getfield sun.security.ssl.SSLSocketImpl.doClientAuth : byte [909]
//    51  invokevirtual sun.security.ssl.ServerHandshaker.setClientAuth(byte) : void [1145]
//    54  return
//      Line numbers:
//        [pc: 0, line: 2391]
//        [pc: 13, line: 2394]
//        [pc: 34, line: 2396]
//        [pc: 40, line: 2397]
//        [pc: 54, line: 2399]
//      Stack map table: number of frames 3
//        [pc: 9, same_locals_1_stack_item, stack: {sun.security.ssl.SSLSocketImpl}]
//        [pc: 10, full, stack: {sun.security.ssl.SSLSocketImpl, int}, locals: {sun.security.ssl.SSLSocketImpl, int}]
//        [pc: 54, same]
//  
//  // Method descriptor #51 ()Z
//  // Stack: 2, Locals: 1
//  public synchronized boolean getWantClientAuth();
//     0  aload_0 [this]
//     1  getfield sun.security.ssl.SSLSocketImpl.doClientAuth : byte [909]
//     4  iconst_1
//     5  if_icmpne 12
//     8  iconst_1
//     9  goto 13
//    12  iconst_0
//    13  ireturn
//      Line numbers:
//        [pc: 0, line: 2403]
//      Stack map table: number of frames 2
//        [pc: 12, same]
//        [pc: 13, same_locals_1_stack_item, stack: {int}]
//  
//  // Method descriptor #59 (Z)V
//  // Stack: 3, Locals: 2
//  public synchronized void setUseClientMode(boolean arg0);
//      0  aload_0 [this]
//      1  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//      4  lookupswitch default: 204
//          case 0: 32
//          case 1: 98
//     32  aload_0 [this]
//     33  getfield sun.security.ssl.SSLSocketImpl.roleIsServer : boolean [921]
//     36  iload_1 [arg0]
//     37  ifne 44
//     40  iconst_1
//     41  goto 45
//     44  iconst_0
//     45  if_icmpeq 82
//     48  aload_0 [this]
//     49  getfield sun.security.ssl.SSLSocketImpl.sslContext : sun.security.ssl.SSLContextImpl [952]
//     52  aload_0 [this]
//     53  getfield sun.security.ssl.SSLSocketImpl.enabledProtocols : sun.security.ssl.ProtocolList [950]
//     56  invokevirtual sun.security.ssl.SSLContextImpl.isDefaultProtocolList(sun.security.ssl.ProtocolList) : boolean [1103]
//     59  ifeq 82
//     62  aload_0 [this]
//     63  aload_0 [this]
//     64  getfield sun.security.ssl.SSLSocketImpl.sslContext : sun.security.ssl.SSLContextImpl [952]
//     67  iload_1 [arg0]
//     68  ifne 75
//     71  iconst_1
//     72  goto 76
//     75  iconst_0
//     76  invokevirtual sun.security.ssl.SSLContextImpl.getDefaultProtocolList(boolean) : sun.security.ssl.ProtocolList [1104]
//     79  putfield sun.security.ssl.SSLSocketImpl.enabledProtocols : sun.security.ssl.ProtocolList [950]
//     82  aload_0 [this]
//     83  iload_1 [arg0]
//     84  ifne 91
//     87  iconst_1
//     88  goto 92
//     91  iconst_0
//     92  putfield sun.security.ssl.SSLSocketImpl.roleIsServer : boolean [921]
//     95  goto 267
//     98  getstatic sun.security.ssl.SSLSocketImpl.$assertionsDisabled : boolean [911]
//    101  ifne 119
//    104  aload_0 [this]
//    105  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    108  ifnonnull 119
//    111  new java.lang.AssertionError [481]
//    114  dup
//    115  invokespecial java.lang.AssertionError() [961]
//    118  athrow
//    119  aload_0 [this]
//    120  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    123  invokevirtual sun.security.ssl.Handshaker.activated() : boolean [1054]
//    126  ifne 204
//    129  aload_0 [this]
//    130  getfield sun.security.ssl.SSLSocketImpl.roleIsServer : boolean [921]
//    133  iload_1 [arg0]
//    134  ifne 141
//    137  iconst_1
//    138  goto 142
//    141  iconst_0
//    142  if_icmpeq 179
//    145  aload_0 [this]
//    146  getfield sun.security.ssl.SSLSocketImpl.sslContext : sun.security.ssl.SSLContextImpl [952]
//    149  aload_0 [this]
//    150  getfield sun.security.ssl.SSLSocketImpl.enabledProtocols : sun.security.ssl.ProtocolList [950]
//    153  invokevirtual sun.security.ssl.SSLContextImpl.isDefaultProtocolList(sun.security.ssl.ProtocolList) : boolean [1103]
//    156  ifeq 179
//    159  aload_0 [this]
//    160  aload_0 [this]
//    161  getfield sun.security.ssl.SSLSocketImpl.sslContext : sun.security.ssl.SSLContextImpl [952]
//    164  iload_1 [arg0]
//    165  ifne 172
//    168  iconst_1
//    169  goto 173
//    172  iconst_0
//    173  invokevirtual sun.security.ssl.SSLContextImpl.getDefaultProtocolList(boolean) : sun.security.ssl.ProtocolList [1104]
//    176  putfield sun.security.ssl.SSLSocketImpl.enabledProtocols : sun.security.ssl.ProtocolList [950]
//    179  aload_0 [this]
//    180  iload_1 [arg0]
//    181  ifne 188
//    184  iconst_1
//    185  goto 189
//    188  iconst_0
//    189  putfield sun.security.ssl.SSLSocketImpl.roleIsServer : boolean [921]
//    192  aload_0 [this]
//    193  iconst_0
//    194  putfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    197  aload_0 [this]
//    198  invokespecial sun.security.ssl.SSLSocketImpl.initHandshaker() : void [1114]
//    201  goto 267
//    204  getstatic sun.security.ssl.SSLSocketImpl.debug : sun.security.ssl.Debug [947]
//    207  ifnull 256
//    210  ldc <String "ssl"> [44]
//    212  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [1049]
//    215  ifeq 256
//    218  getstatic java.lang.System.out : java.io.PrintStream [894]
//    221  new java.lang.StringBuilder [493]
//    224  dup
//    225  invokespecial java.lang.StringBuilder() [975]
//    228  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [985]
//    231  invokevirtual java.lang.Thread.getName() : java.lang.String [984]
//    234  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    237  ldc_w <String ", setUseClientMode() invoked in state = "> [453]
//    240  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    243  aload_0 [this]
//    244  getfield sun.security.ssl.SSLSocketImpl.connectionState : int [910]
//    247  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [977]
//    250  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    253  invokevirtual java.io.PrintStream.println(java.lang.String) : void [960]
//    256  new java.lang.IllegalArgumentException [485]
//    259  dup
//    260  ldc_w <String "Cannot change mode after SSL traffic has started"> [459]
//    263  invokespecial java.lang.IllegalArgumentException(java.lang.String) [964]
//    266  athrow
//    267  return
//      Line numbers:
//        [pc: 0, line: 2415]
//        [pc: 32, line: 2423]
//        [pc: 56, line: 2424]
//        [pc: 62, line: 2425]
//        [pc: 82, line: 2427]
//        [pc: 95, line: 2428]
//        [pc: 98, line: 2438]
//        [pc: 119, line: 2439]
//        [pc: 129, line: 2445]
//        [pc: 153, line: 2446]
//        [pc: 159, line: 2447]
//        [pc: 179, line: 2449]
//        [pc: 192, line: 2450]
//        [pc: 197, line: 2451]
//        [pc: 201, line: 2452]
//        [pc: 204, line: 2458]
//        [pc: 218, line: 2459]
//        [pc: 256, line: 2463]
//        [pc: 267, line: 2466]
//      Stack map table: number of frames 20
//        [pc: 32, same]
//        [pc: 44, same_locals_1_stack_item, stack: {int}]
//        [pc: 45, full, stack: {int, int}, locals: {sun.security.ssl.SSLSocketImpl, int}]
//        [pc: 75, full, stack: {sun.security.ssl.SSLSocketImpl, sun.security.ssl.SSLContextImpl}, locals: {sun.security.ssl.SSLSocketImpl, int}]
//        [pc: 76, full, stack: {sun.security.ssl.SSLSocketImpl, sun.security.ssl.SSLContextImpl, int}, locals: {sun.security.ssl.SSLSocketImpl, int}]
//        [pc: 82, same]
//        [pc: 91, same_locals_1_stack_item, stack: {sun.security.ssl.SSLSocketImpl}]
//        [pc: 92, full, stack: {sun.security.ssl.SSLSocketImpl, int}, locals: {sun.security.ssl.SSLSocketImpl, int}]
//        [pc: 98, same]
//        [pc: 119, same]
//        [pc: 141, same_locals_1_stack_item, stack: {int}]
//        [pc: 142, full, stack: {int, int}, locals: {sun.security.ssl.SSLSocketImpl, int}]
//        [pc: 172, full, stack: {sun.security.ssl.SSLSocketImpl, sun.security.ssl.SSLContextImpl}, locals: {sun.security.ssl.SSLSocketImpl, int}]
//        [pc: 173, full, stack: {sun.security.ssl.SSLSocketImpl, sun.security.ssl.SSLContextImpl, int}, locals: {sun.security.ssl.SSLSocketImpl, int}]
//        [pc: 179, same]
//        [pc: 188, same_locals_1_stack_item, stack: {sun.security.ssl.SSLSocketImpl}]
//        [pc: 189, full, stack: {sun.security.ssl.SSLSocketImpl, int}, locals: {sun.security.ssl.SSLSocketImpl, int}]
//        [pc: 204, same]
//        [pc: 256, same]
//        [pc: 267, same]
//  
//  // Method descriptor #51 ()Z
//  // Stack: 1, Locals: 1
//  public synchronized boolean getUseClientMode();
//     0  aload_0 [this]
//     1  getfield sun.security.ssl.SSLSocketImpl.roleIsServer : boolean [921]
//     4  ifne 11
//     7  iconst_1
//     8  goto 12
//    11  iconst_0
//    12  ireturn
//      Line numbers:
//        [pc: 0, line: 2470]
//      Stack map table: number of frames 2
//        [pc: 11, same]
//        [pc: 12, same_locals_1_stack_item, stack: {int}]
//  
//  // Method descriptor #579 ()[Ljava/lang/String;
//  // Stack: 1, Locals: 1
//  public java.lang.String[] getSupportedCipherSuites();
//     0  aload_0 [this]
//     1  getfield sun.security.ssl.SSLSocketImpl.sslContext : sun.security.ssl.SSLContextImpl [952]
//     4  invokevirtual sun.security.ssl.SSLContextImpl.getSupportedCipherSuiteList() : sun.security.ssl.CipherSuiteList [1100]
//     7  invokevirtual sun.security.ssl.CipherSuiteList.toStringArray() : java.lang.String[] [1046]
//    10  areturn
//      Line numbers:
//        [pc: 0, line: 2486]
//  
//  // Method descriptor #587 ([Ljava/lang/String;)V
//  // Stack: 4, Locals: 2
//  public synchronized void setEnabledCipherSuites(java.lang.String[] arg0);
//     0  aload_0 [this]
//     1  new sun.security.ssl.CipherSuiteList [526]
//     4  dup
//     5  aload_1 [arg0]
//     6  invokespecial sun.security.ssl.CipherSuiteList(java.lang.String[]) [1047]
//     9  putfield sun.security.ssl.SSLSocketImpl.enabledCipherSuites : sun.security.ssl.CipherSuiteList [946]
//    12  aload_0 [this]
//    13  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    16  ifnull 40
//    19  aload_0 [this]
//    20  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    23  invokevirtual sun.security.ssl.Handshaker.activated() : boolean [1054]
//    26  ifne 40
//    29  aload_0 [this]
//    30  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    33  aload_0 [this]
//    34  getfield sun.security.ssl.SSLSocketImpl.enabledCipherSuites : sun.security.ssl.CipherSuiteList [946]
//    37  invokevirtual sun.security.ssl.Handshaker.setEnabledCipherSuites(sun.security.ssl.CipherSuiteList) : void [1072]
//    40  return
//      Line numbers:
//        [pc: 0, line: 2500]
//        [pc: 12, line: 2501]
//        [pc: 29, line: 2502]
//        [pc: 40, line: 2504]
//      Stack map table: number of frames 1
//        [pc: 40, same]
//  
//  // Method descriptor #579 ()[Ljava/lang/String;
//  // Stack: 1, Locals: 1
//  public synchronized java.lang.String[] getEnabledCipherSuites();
//    0  aload_0 [this]
//    1  getfield sun.security.ssl.SSLSocketImpl.enabledCipherSuites : sun.security.ssl.CipherSuiteList [946]
//    4  invokevirtual sun.security.ssl.CipherSuiteList.toStringArray() : java.lang.String[] [1046]
//    7  areturn
//      Line numbers:
//        [pc: 0, line: 2518]
//  
//  // Method descriptor #579 ()[Ljava/lang/String;
//  // Stack: 1, Locals: 1
//  public java.lang.String[] getSupportedProtocols();
//     0  aload_0 [this]
//     1  getfield sun.security.ssl.SSLSocketImpl.sslContext : sun.security.ssl.SSLContextImpl [952]
//     4  invokevirtual sun.security.ssl.SSLContextImpl.getSuportedProtocolList() : sun.security.ssl.ProtocolList [1102]
//     7  invokevirtual sun.security.ssl.ProtocolList.toStringArray() : java.lang.String[] [1098]
//    10  areturn
//      Line numbers:
//        [pc: 0, line: 2529]
//  
//  // Method descriptor #587 ([Ljava/lang/String;)V
//  // Stack: 4, Locals: 2
//  public synchronized void setEnabledProtocols(java.lang.String[] arg0);
//     0  aload_0 [this]
//     1  new sun.security.ssl.ProtocolList [534]
//     4  dup
//     5  aload_1 [arg0]
//     6  invokespecial sun.security.ssl.ProtocolList(java.lang.String[]) [1099]
//     9  putfield sun.security.ssl.SSLSocketImpl.enabledProtocols : sun.security.ssl.ProtocolList [950]
//    12  aload_0 [this]
//    13  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    16  ifnull 40
//    19  aload_0 [this]
//    20  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    23  invokevirtual sun.security.ssl.Handshaker.activated() : boolean [1054]
//    26  ifne 40
//    29  aload_0 [this]
//    30  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    33  aload_0 [this]
//    34  getfield sun.security.ssl.SSLSocketImpl.enabledProtocols : sun.security.ssl.ProtocolList [950]
//    37  invokevirtual sun.security.ssl.Handshaker.setEnabledProtocols(sun.security.ssl.ProtocolList) : void [1074]
//    40  return
//      Line numbers:
//        [pc: 0, line: 2543]
//        [pc: 12, line: 2544]
//        [pc: 29, line: 2545]
//        [pc: 40, line: 2547]
//      Stack map table: number of frames 1
//        [pc: 40, same]
//  
//  // Method descriptor #579 ()[Ljava/lang/String;
//  // Stack: 1, Locals: 1
//  public synchronized java.lang.String[] getEnabledProtocols();
//    0  aload_0 [this]
//    1  getfield sun.security.ssl.SSLSocketImpl.enabledProtocols : sun.security.ssl.ProtocolList [950]
//    4  invokevirtual sun.security.ssl.ProtocolList.toStringArray() : java.lang.String[] [1098]
//    7  areturn
//      Line numbers:
//        [pc: 0, line: 2551]
//  
//  // Method descriptor #56 (I)V
//  // Stack: 3, Locals: 2
//  public void setSoTimeout(int arg0) throws java.net.SocketException;
//     0  getstatic sun.security.ssl.SSLSocketImpl.debug : sun.security.ssl.Debug [947]
//     3  ifnull 55
//     6  ldc <String "ssl"> [44]
//     8  invokestatic sun.security.ssl.Debug.isOn(java.lang.String) : boolean [1049]
//    11  ifeq 55
//    14  getstatic java.lang.System.out : java.io.PrintStream [894]
//    17  new java.lang.StringBuilder [493]
//    20  dup
//    21  invokespecial java.lang.StringBuilder() [975]
//    24  invokestatic java.lang.Thread.currentThread() : java.lang.Thread [985]
//    27  invokevirtual java.lang.Thread.getName() : java.lang.String [984]
//    30  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    33  ldc_w <String ", setSoTimeout("> [452]
//    36  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    39  iload_1 [arg0]
//    40  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [977]
//    43  ldc_w <String ") called"> [446]
//    46  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [980]
//    49  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [976]
//    52  invokevirtual java.io.PrintStream.println(java.lang.String) : void [960]
//    55  aload_0 [this]
//    56  iload_1 [arg0]
//    57  invokespecial sun.security.ssl.BaseSSLSocketImpl.setSoTimeout(int) : void [1031]
//    60  return
//      Line numbers:
//        [pc: 0, line: 2560]
//        [pc: 14, line: 2561]
//        [pc: 55, line: 2565]
//        [pc: 60, line: 2566]
//      Stack map table: number of frames 1
//        [pc: 55, same]
//  
//  // Method descriptor #607 (Ljavax/net/ssl/HandshakeCompletedListener;)V
//  // Stack: 4, Locals: 2
//  public synchronized void addHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener arg0);
//     0  aload_1 [arg0]
//     1  ifnonnull 15
//     4  new java.lang.IllegalArgumentException [485]
//     7  dup
//     8  ldc_w <String "listener is null"> [470]
//    11  invokespecial java.lang.IllegalArgumentException(java.lang.String) [964]
//    14  athrow
//    15  aload_0 [this]
//    16  getfield sun.security.ssl.SSLSocketImpl.handshakeListeners : java.util.HashMap [936]
//    19  ifnonnull 34
//    22  aload_0 [this]
//    23  new java.util.HashMap [508]
//    26  dup
//    27  iconst_4
//    28  invokespecial java.util.HashMap(int) [996]
//    31  putfield sun.security.ssl.SSLSocketImpl.handshakeListeners : java.util.HashMap [936]
//    34  aload_0 [this]
//    35  getfield sun.security.ssl.SSLSocketImpl.handshakeListeners : java.util.HashMap [936]
//    38  aload_1 [arg0]
//    39  invokestatic java.security.AccessController.getContext() : java.security.AccessControlContext [993]
//    42  invokevirtual java.util.HashMap.put(java.lang.Object, java.lang.Object) : java.lang.Object [999]
//    45  pop
//    46  return
//      Line numbers:
//        [pc: 0, line: 2575]
//        [pc: 4, line: 2576]
//        [pc: 15, line: 2578]
//        [pc: 22, line: 2579]
//        [pc: 34, line: 2582]
//        [pc: 46, line: 2583]
//      Stack map table: number of frames 2
//        [pc: 15, same]
//        [pc: 34, same]
//  
//  // Method descriptor #607 (Ljavax/net/ssl/HandshakeCompletedListener;)V
//  // Stack: 3, Locals: 2
//  public synchronized void removeHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener arg0);
//     0  aload_0 [this]
//     1  getfield sun.security.ssl.SSLSocketImpl.handshakeListeners : java.util.HashMap [936]
//     4  ifnonnull 18
//     7  new java.lang.IllegalArgumentException [485]
//    10  dup
//    11  ldc_w <String "no listeners"> [472]
//    14  invokespecial java.lang.IllegalArgumentException(java.lang.String) [964]
//    17  athrow
//    18  aload_0 [this]
//    19  getfield sun.security.ssl.SSLSocketImpl.handshakeListeners : java.util.HashMap [936]
//    22  aload_1 [arg0]
//    23  invokevirtual java.util.HashMap.remove(java.lang.Object) : java.lang.Object [998]
//    26  ifnonnull 40
//    29  new java.lang.IllegalArgumentException [485]
//    32  dup
//    33  ldc_w <String "listener not registered"> [471]
//    36  invokespecial java.lang.IllegalArgumentException(java.lang.String) [964]
//    39  athrow
//    40  aload_0 [this]
//    41  getfield sun.security.ssl.SSLSocketImpl.handshakeListeners : java.util.HashMap [936]
//    44  invokevirtual java.util.HashMap.isEmpty() : boolean [995]
//    47  ifeq 55
//    50  aload_0 [this]
//    51  aconst_null
//    52  putfield sun.security.ssl.SSLSocketImpl.handshakeListeners : java.util.HashMap [936]
//    55  return
//      Line numbers:
//        [pc: 0, line: 2592]
//        [pc: 7, line: 2593]
//        [pc: 18, line: 2595]
//        [pc: 29, line: 2596]
//        [pc: 40, line: 2598]
//        [pc: 50, line: 2599]
//        [pc: 55, line: 2601]
//      Stack map table: number of frames 3
//        [pc: 18, same]
//        [pc: 40, same]
//        [pc: 55, same]
//  
//  // Method descriptor #608 ()Ljavax/net/ssl/SSLParameters;
//  // Stack: 2, Locals: 2
//  public synchronized javax.net.ssl.SSLParameters getSSLParameters();
//      0  aload_0 [this]
//      1  invokespecial sun.security.ssl.BaseSSLSocketImpl.getSSLParameters() : javax.net.ssl.SSLParameters [1041]
//      4  astore_1
//      5  aload_1
//      6  aload_0 [this]
//      7  getfield sun.security.ssl.SSLSocketImpl.identificationProtocol : java.lang.String [932]
//     10  invokevirtual javax.net.ssl.SSLParameters.setEndpointIdentificationAlgorithm(java.lang.String) : void [1013]
//     13  aload_1
//     14  aload_0 [this]
//     15  getfield sun.security.ssl.SSLSocketImpl.algorithmConstraints : java.security.AlgorithmConstraints [934]
//     18  invokevirtual javax.net.ssl.SSLParameters.setAlgorithmConstraints(java.security.AlgorithmConstraints) : void [1015]
//     21  aload_0 [this]
//     22  getfield sun.security.ssl.SSLSocketImpl.sniMatchers : java.util.Collection [935]
//     25  invokeinterface java.util.Collection.isEmpty() : boolean [1148] [nargs: 1]
//     30  ifeq 48
//     33  aload_0 [this]
//     34  getfield sun.security.ssl.SSLSocketImpl.noSniMatcher : boolean [917]
//     37  ifne 48
//     40  aload_1
//     41  aconst_null
//     42  invokevirtual javax.net.ssl.SSLParameters.setSNIMatchers(java.util.Collection) : void [1017]
//     45  goto 56
//     48  aload_1
//     49  aload_0 [this]
//     50  getfield sun.security.ssl.SSLSocketImpl.sniMatchers : java.util.Collection [935]
//     53  invokevirtual javax.net.ssl.SSLParameters.setSNIMatchers(java.util.Collection) : void [1017]
//     56  aload_0 [this]
//     57  getfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//     60  invokeinterface java.util.List.isEmpty() : boolean [1149] [nargs: 1]
//     65  ifeq 83
//     68  aload_0 [this]
//     69  getfield sun.security.ssl.SSLSocketImpl.noSniExtension : boolean [916]
//     72  ifne 83
//     75  aload_1
//     76  aconst_null
//     77  invokevirtual javax.net.ssl.SSLParameters.setServerNames(java.util.List) : void [1019]
//     80  goto 91
//     83  aload_1
//     84  aload_0 [this]
//     85  getfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//     88  invokevirtual javax.net.ssl.SSLParameters.setServerNames(java.util.List) : void [1019]
//     91  aload_1
//     92  aload_0 [this]
//     93  getfield sun.security.ssl.SSLSocketImpl.preferLocalCipherSuites : boolean [918]
//     96  invokevirtual javax.net.ssl.SSLParameters.setUseCipherSuitesOrder(boolean) : void [1011]
//     99  aload_1
//    100  areturn
//      Line numbers:
//        [pc: 0, line: 2608]
//        [pc: 5, line: 2611]
//        [pc: 13, line: 2612]
//        [pc: 21, line: 2614]
//        [pc: 40, line: 2616]
//        [pc: 48, line: 2618]
//        [pc: 56, line: 2621]
//        [pc: 75, line: 2623]
//        [pc: 83, line: 2625]
//        [pc: 91, line: 2628]
//        [pc: 99, line: 2630]
//      Stack map table: number of frames 4
//        [pc: 48, append: {javax.net.ssl.SSLParameters}]
//        [pc: 56, same]
//        [pc: 83, same]
//        [pc: 91, same]
//  
//  // Method descriptor #609 (Ljavax/net/ssl/SSLParameters;)V
//  // Stack: 2, Locals: 4
//  public synchronized void setSSLParameters(javax.net.ssl.SSLParameters arg0);
//      0  aload_0 [this]
//      1  aload_1 [arg0]
//      2  invokespecial sun.security.ssl.BaseSSLSocketImpl.setSSLParameters(javax.net.ssl.SSLParameters) : void [1042]
//      5  aload_0 [this]
//      6  aload_1 [arg0]
//      7  invokevirtual javax.net.ssl.SSLParameters.getEndpointIdentificationAlgorithm() : java.lang.String [1012]
//     10  putfield sun.security.ssl.SSLSocketImpl.identificationProtocol : java.lang.String [932]
//     13  aload_0 [this]
//     14  aload_1 [arg0]
//     15  invokevirtual javax.net.ssl.SSLParameters.getAlgorithmConstraints() : java.security.AlgorithmConstraints [1014]
//     18  putfield sun.security.ssl.SSLSocketImpl.algorithmConstraints : java.security.AlgorithmConstraints [934]
//     21  aload_0 [this]
//     22  aload_1 [arg0]
//     23  invokevirtual javax.net.ssl.SSLParameters.getUseCipherSuitesOrder() : boolean [1010]
//     26  putfield sun.security.ssl.SSLSocketImpl.preferLocalCipherSuites : boolean [918]
//     29  aload_1 [arg0]
//     30  invokevirtual javax.net.ssl.SSLParameters.getServerNames() : java.util.List [1018]
//     33  astore_2
//     34  aload_2
//     35  ifnull 53
//     38  aload_0 [this]
//     39  aload_2
//     40  invokeinterface java.util.List.isEmpty() : boolean [1149] [nargs: 1]
//     45  putfield sun.security.ssl.SSLSocketImpl.noSniExtension : boolean [916]
//     48  aload_0 [this]
//     49  aload_2
//     50  putfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//     53  aload_1 [arg0]
//     54  invokevirtual javax.net.ssl.SSLParameters.getSNIMatchers() : java.util.Collection [1016]
//     57  astore_3
//     58  aload_3
//     59  ifnull 77
//     62  aload_0 [this]
//     63  aload_3
//     64  invokeinterface java.util.Collection.isEmpty() : boolean [1148] [nargs: 1]
//     69  putfield sun.security.ssl.SSLSocketImpl.noSniMatcher : boolean [917]
//     72  aload_0 [this]
//     73  aload_3
//     74  putfield sun.security.ssl.SSLSocketImpl.sniMatchers : java.util.Collection [935]
//     77  aload_0 [this]
//     78  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//     81  ifnull 159
//     84  aload_0 [this]
//     85  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//     88  invokevirtual sun.security.ssl.Handshaker.started() : boolean [1058]
//     91  ifne 159
//     94  aload_0 [this]
//     95  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//     98  aload_0 [this]
//     99  getfield sun.security.ssl.SSLSocketImpl.identificationProtocol : java.lang.String [932]
//    102  invokevirtual sun.security.ssl.Handshaker.setIdentificationProtocol(java.lang.String) : void [1064]
//    105  aload_0 [this]
//    106  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    109  aload_0 [this]
//    110  getfield sun.security.ssl.SSLSocketImpl.algorithmConstraints : java.security.AlgorithmConstraints [934]
//    113  invokevirtual sun.security.ssl.Handshaker.setAlgorithmConstraints(java.security.AlgorithmConstraints) : void [1065]
//    116  aload_0 [this]
//    117  getfield sun.security.ssl.SSLSocketImpl.roleIsServer : boolean [921]
//    120  ifeq 148
//    123  aload_0 [this]
//    124  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    127  aload_0 [this]
//    128  getfield sun.security.ssl.SSLSocketImpl.sniMatchers : java.util.Collection [935]
//    131  invokevirtual sun.security.ssl.Handshaker.setSNIMatchers(java.util.Collection) : void [1066]
//    134  aload_0 [this]
//    135  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    138  aload_0 [this]
//    139  getfield sun.security.ssl.SSLSocketImpl.preferLocalCipherSuites : boolean [918]
//    142  invokevirtual sun.security.ssl.Handshaker.setUseCipherSuitesOrder(boolean) : void [1063]
//    145  goto 159
//    148  aload_0 [this]
//    149  getfield sun.security.ssl.SSLSocketImpl.handshaker : sun.security.ssl.Handshaker [948]
//    152  aload_0 [this]
//    153  getfield sun.security.ssl.SSLSocketImpl.serverNames : java.util.List [937]
//    156  invokevirtual sun.security.ssl.Handshaker.setSNIServerNames(java.util.List) : void [1067]
//    159  return
//      Line numbers:
//        [pc: 0, line: 2638]
//        [pc: 5, line: 2641]
//        [pc: 13, line: 2642]
//        [pc: 21, line: 2643]
//        [pc: 29, line: 2645]
//        [pc: 34, line: 2646]
//        [pc: 38, line: 2647]
//        [pc: 48, line: 2648]
//        [pc: 53, line: 2651]
//        [pc: 58, line: 2652]
//        [pc: 62, line: 2653]
//        [pc: 72, line: 2654]
//        [pc: 77, line: 2657]
//        [pc: 94, line: 2658]
//        [pc: 105, line: 2659]
//        [pc: 116, line: 2660]
//        [pc: 123, line: 2661]
//        [pc: 134, line: 2662]
//        [pc: 148, line: 2664]
//        [pc: 159, line: 2667]
//      Stack map table: number of frames 4
//        [pc: 53, append: {java.util.List}]
//        [pc: 77, append: {java.util.Collection}]
//        [pc: 148, same_extended]
//        [pc: 159, same]
//  
//  // Method descriptor #51 ()Z
//  // Stack: 1, Locals: 1
//  boolean receivedChangeCipherSpec();
//    0  aload_0 [this]
//    1  getfield sun.security.ssl.SSLSocketImpl.receivedCCS : boolean [919]
//    4  ireturn
//      Line numbers:
//        [pc: 0, line: 2674]
//  
//  // Method descriptor #578 ()Ljava/lang/String;
//  // Stack: 3, Locals: 2
//  public java.lang.String toString();
//     0  new java.lang.StringBuffer [492]
//     3  dup
//     4  bipush 80
//     6  invokespecial java.lang.StringBuffer(int) [972]
//     9  astore_1
//    10  aload_1
//    11  aload_0 [this]
//    12  invokevirtual java.lang.Object.hashCode() : int [967]
//    15  invokestatic java.lang.Integer.toHexString(int) : java.lang.String [966]
//    18  invokevirtual java.lang.StringBuffer.append(java.lang.String) : java.lang.StringBuffer [974]
//    21  pop
//    22  aload_1
//    23  ldc_w <String "["> [465]
//    26  invokevirtual java.lang.StringBuffer.append(java.lang.String) : java.lang.StringBuffer [974]
//    29  pop
//    30  aload_1
//    31  aload_0 [this]
//    32  getfield sun.security.ssl.SSLSocketImpl.sess : sun.security.ssl.SSLSessionImpl [954]
//    35  invokevirtual sun.security.ssl.SSLSessionImpl.getCipherSuite() : java.lang.String [1106]
//    38  invokevirtual java.lang.StringBuffer.append(java.lang.String) : java.lang.StringBuffer [974]
//    41  pop
//    42  aload_1
//    43  ldc_w <String ": "> [454]
//    46  invokevirtual java.lang.StringBuffer.append(java.lang.String) : java.lang.StringBuffer [974]
//    49  pop
//    50  aload_1
//    51  aload_0 [this]
//    52  invokespecial sun.security.ssl.BaseSSLSocketImpl.toString() : java.lang.String [1035]
//    55  invokevirtual java.lang.StringBuffer.append(java.lang.String) : java.lang.StringBuffer [974]
//    58  pop
//    59  aload_1
//    60  ldc_w <String "]"> [466]
//    63  invokevirtual java.lang.StringBuffer.append(java.lang.String) : java.lang.StringBuffer [974]
//    66  pop
//    67  aload_1
//    68  invokevirtual java.lang.StringBuffer.toString() : java.lang.String [973]
//    71  areturn
//      Line numbers:
//        [pc: 0, line: 2721]
//        [pc: 10, line: 2723]
//        [pc: 22, line: 2724]
//        [pc: 30, line: 2725]
//        [pc: 42, line: 2726]
//        [pc: 50, line: 2728]
//        [pc: 59, line: 2729]
//        [pc: 67, line: 2731]
//  
//  // Method descriptor #57 (III)V
//  // Stack: 4, Locals: 4
//  public bridge synthetic void setPerformancePreferences(int arg0, int arg1, int arg2);
//    0  aload_0 [this]
//    1  iload_1 [arg0]
//    2  iload_2 [arg1]
//    3  iload_3 [arg2]
//    4  invokespecial sun.security.ssl.BaseSSLSocketImpl.setPerformancePreferences(int, int, int) : void [1032]
//    7  return
//      Line numbers:
//        [pc: 0, line: 65]
//  
//  // Method descriptor #595 ()Ljava/net/SocketAddress;
//  // Stack: 1, Locals: 1
//  public bridge synthetic java.net.SocketAddress getRemoteSocketAddress();
//    0  aload_0 [this]
//    1  invokespecial sun.security.ssl.BaseSSLSocketImpl.getRemoteSocketAddress() : java.net.SocketAddress [1038]
//    4  areturn
//      Line numbers:
//        [pc: 0, line: 65]
//  
//  // Method descriptor #595 ()Ljava/net/SocketAddress;
//  // Stack: 1, Locals: 1
//  public bridge synthetic java.net.SocketAddress getLocalSocketAddress();
//    0  aload_0 [this]
//    1  invokespecial sun.security.ssl.BaseSSLSocketImpl.getLocalSocketAddress() : java.net.SocketAddress [1037]
//    4  areturn
//      Line numbers:
//        [pc: 0, line: 65]
//  
//  // Method descriptor #596 (Ljava/net/SocketAddress;)V
//  // Stack: 2, Locals: 2
//  public bridge synthetic void bind(java.net.SocketAddress arg0) throws java.io.IOException;
//    0  aload_0 [this]
//    1  aload_1 [arg0]
//    2  invokespecial sun.security.ssl.BaseSSLSocketImpl.bind(java.net.SocketAddress) : void [1039]
//    5  return
//      Line numbers:
//        [pc: 0, line: 65]
//  
//  // Method descriptor #50 ()V
//  // Stack: 2, Locals: 0
//  static {};
//     0  ldc <Class sun.security.ssl.SSLSocketImpl> [45]
//     2  invokevirtual java.lang.Class.desiredAssertionStatus() : boolean [962]
//     5  ifne 12
//     8  iconst_1
//     9  goto 13
//    12  iconst_0
//    13  putstatic sun.security.ssl.SSLSocketImpl.$assertionsDisabled : boolean [911]
//    16  ldc <String "ssl"> [44]
//    18  invokestatic sun.security.ssl.Debug.getInstance(java.lang.String) : sun.security.ssl.Debug [1051]
//    21  putstatic sun.security.ssl.SSLSocketImpl.debug : sun.security.ssl.Debug [947]
//    24  ldc_w <String "jdk.tls.trustNameService"> [469]
//    27  iconst_0
//    28  invokestatic sun.security.ssl.Debug.getBooleanProperty(java.lang.String, boolean) : boolean [1050]
//    31  putstatic sun.security.ssl.SSLSocketImpl.trustNameService : boolean [923]
//    34  return
//      Line numbers:
//        [pc: 0, line: 65]
//        [pc: 16, line: 381]
//        [pc: 24, line: 406]
//        [pc: 28, line: 407]
//        [pc: 34, line: 406]
//      Stack map table: number of frames 2
//        [pc: 12, same]
//        [pc: 13, same_locals_1_stack_item, stack: {int}]
//
//  Inner classes:
//    [inner class info: #539 sun/security/ssl/SSLSocketImpl$NotifyHandshakeThread, outer class info: #45 sun/security/ssl/SSLSocketImpl
//     inner name: #1156 NotifyHandshakeThread, accessflags: 10 private static]
//}