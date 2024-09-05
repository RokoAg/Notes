package a08;

/**
 ** The MonthlyPrecipitation class represents the precipitation data for a
 * given month. It includes methods for setting and getting the month name, the
 * precipitation values for each day of the month, and calculating the monthly
 * average and wettest day. The class also includes a constructor for
 * initializing the class variables and constants.
 *
 * @author Rakhuzhuwo Sapruna(A00455075)
 */
public class MonthlyPrecipitation {

    //Class Variables/Constants
    public static final int DEF_NUM_DAYS = 31;

    //Instance Variables/Constants
    private String monthName;
    private double[] pctVals;

    /**
     * Primary Constructor Constructs a MonthlyPrecipitation object with a given
     * month name and precipitation values.
     *
     * @param month the month name
     * @param pctVals the precipitation values for each day of the month
     */
    public MonthlyPrecipitation(String month, double[] pctVals) {
        monthName = month;
        this.pctVals = new double[DEF_NUM_DAYS];
        for (int i = 0; i < pctVals.length; i++) {
            this.pctVals[i] = pctVals[i];
        }
        for (int i = pctVals.length; i < DEF_NUM_DAYS; i++) {
            this.pctVals[i] = Double.NaN;
        }
    }

    /**
     * Secondary constructor takes only an initial value for monthName, and
     * pctVals will be initialized to Double.NaN for all its elements.
     *
     * @param month the month name
     */
    public MonthlyPrecipitation(String monthName) {
        this(monthName, new double[0]);
    }

    //setters
    /**
     * Setter for the monthName property.
     *
     * @param name the month name
     */
    public void setMonthName(String name) {
        monthName = name;
    }

    /**
     * A setter for one element of pctVals array.
     *
     * @param dayNum the day number (1-31)
     * @param value the percentage value of precipitation for that day
     */
    public void setPctVal(int dayNum, double value) {
        if (dayNum < 1 || dayNum > 31) {
            System.out.println("ERROR: Invalid day number " + dayNum);
        } else {
            pctVals[dayNum - 1] = value;
        }
    }

    //getters
    /**
     * Getter for the name of the month.
     *
     * @return the name of the month
     */
    public String getMonthName() {
        return monthName;
    }

    /**
     * Getter for the percentage value of precipitation for a given day.
     *
     * @param dayNum the day number (1-31)
     * @return the percentage value of precipitation for that day
     */
    public double getPctVal(int dayNum) {
        if (dayNum < 1 || dayNum > DEF_NUM_DAYS) {
            System.out.printf("ERROR: Invalid day number %d", dayNum);
            System.out.println();
            return Double.NaN;
        } else if (Double.isNaN(pctVals[dayNum - 1])) {
            System.out.printf("No defined precipitation amount for day#%d",
                     dayNum);
            System.out.println();
            return Double.NaN;
        } else {
            return pctVals[dayNum - 1];
        }
    }

    /**
     * Getter for the percentage values of precipitation for all days.
     *
     * @return an array of the percentage values of precipitation for all days
     */
    public double[] getPctVals() {
        double[] pctVal = new double[DEF_NUM_DAYS];
        for (int i = 0; i < DEF_NUM_DAYS; i++) {
            pctVal[i] = pctVals[i];
        }
        return pctVal;
    }

    /**
     * Calculates and returns the monthly average percentage value of
     * precipitation.
     *
     * @return the monthly average percentage value of precipitation
     */
    public double getMonthlyAverage() {
        double sum = 0, average = 0;
        double empty = 0;
        for (int i = 0; i < DEF_NUM_DAYS; i++) {
            if (Double.isNaN(pctVals[i])) {
                sum += 0;
                empty++;
            } else {
                sum += pctVals[i];
            }

        }
        return sum / (DEF_NUM_DAYS - empty);
    }

    /**
     * Calculates and returns the day number (1-31) of the wettest day in the
     * month.
     *
     * @return the day number (1-31) of the wettest day in the month
     */
    public double getWettestDayNumber() {
        double wettest = 0;
        int wettestDay = 0;
        for (int i = 0; i < DEF_NUM_DAYS; i++) {
            if (wettest == -1 && Double.isNaN(pctVals[i]) == false) {
                wettest = pctVals[i];
            }
            if (pctVals[i] > wettest) {
                wettest = pctVals[i];
                wettestDay = i + 1;
            }
        }
        return wettestDay;
    }

    /**
     * Returns a string representation of the PrecipitationMonth object.
     * Includes the month name, the average precipitation, the wettest day, and
     * the precipitation amount per day.
     *
     * @return s a string representation of the PrecipitationMonth object.
     */
    @Override
    public String toString() {
        String s = "Month: " + monthName + "\n";
        s += "Average precipitation: " + getMonthlyAverage() + "\n";
        s += "The wettest day was day#" + getWettestDayNumber() + "\n";
        s += "Precipitation amount per day: \n";
        for (int i = 0; i < DEF_NUM_DAYS; ++i) {
            if (Double.isNaN(pctVals[i])) {
                System.out.print("");
            } else {
                s += String.format("\t%s : %s\n", i + 1, pctVals[i]);
            }
        }

        return s;
    }
    /**
     * 5ffour295
m9qvkqlgfhtwo3seven4seven
2vdqng1sixzjlkjvq
5twonineeight3onefive
2three2seveneightseven
eightsevenfive3bcptwo
five8six
twonineseven24one3
one8bdxplbtfninefourspqn
nineeight3fiveseven
xmkhttr64htgvhjfivefcjlzjqrsjlfivekbcnhqpzg
261flvsthree
one2mgnphzcx45rmnffneight
sevenfivesixzvpone8f1plj
ccthpbg6six3
f1hzds5kfdsj
qkneightwofourninejzjfmkjv8eightthdtp
eight62rvkjphrdtwoseventwo28
eight33
sevenkzvnkj5ftone
76sixrcznjkthreethree72nf
5nnine
3cjseventhreen
sixsix18ctxvtxbs
7mksmd9threetnkbtwo
7hxnrgnl8
vq3dcgtlzgfives8kthone7
76tmpjjvbzzclfour
ptwonefive2threekfrtvnbmplpsevenseven
79sixone
mheightfhllpvk6rdnrznkndp
7sixfjsspxhljrtsz39szdtsrfkh
3prqtwolcljdhcksix6three3gjkvcsz
31vjpsdqlncjone
2qhbsjcxqfive
cccgsqgj2seveneight2
eightthree65tbhvpnthree
ltpeight27fivethxzjthree27
m31cxstb4
xfmnzconevzmzkcthree2
837
vjone779jzskrxqgkrd2
rgd9eight
3onetwo34one
threeffthlxtmc8zfpl7fivetwo2seven
two6rxqghhnnthm
9gfjhhlc4hlpcc
glcj9zdnfkrnfcvqqhr9four
seven6564four
3lrlkmqbvllqpn7fivedmmqhk
8fivefiver3eighteight3
3eightthree
bhzsjfivefour391753
nine5sixsix4jrqdljfive8
threeninenine68gkjlrh8n
7vdprdhrmbrnineonektjpseveneight
3prjtkg6three1
nine5rnbxdsgdnine2seven
threes6
62zzbgfq7
5hbcvdhslxb
6msfzlhmksplcbmrqoneoneone
4sevennine3
five99threezmxsj7sqbtthree
56vbt42three
12fjlcvkgcv
dnsdbrphqhrthmqtm7sixonezv5fgtwo
5seven5fourlhgb
fivetwo26threeone7eight3
lxlzzhfkfive4eight2fivezqkdxczbmndvflrsq
71nineseven5one58
fivelncljrgtxkdq51gnnpvtsbnine3five
mjlrpthgvz57skzbs24fourtwoneklr
njqlhp39five
8xxmstonetwolhlcgzcpqb
8gjqlbgfive
xcdssbrltmf8sevenkxntdzgfsv
vhgjfxeightvfvpgcxsnineninepkrjtqtseven7
two3ztllvnrmg7fivetwo
five1jspfivethree1one
5stkpqcjhxvmrn
three3six12fourkdmlgfbflm
7sixeightnnjnc4one7four
4bqszrqnfzl9nlp
two3threesnjpncrjljpcxhjdzxqcjcjbktvxjgvnfp
36tworrhlh
43trbqvgrrsjbrxhk
eight7five
four934eight8three
9zjzhmtkt4bvljpttc25sixsix
twotwocmzcczsjz2qcslmnjl1pqfjqfhlpmtjlpzpjhffxr
4fseven
sevennvxlnineph8ninefqbm
2611five42
two7nine
7eightfour7gh19
71kzdvkfbqnineonetwo
onesixnine325
5cbtbckx4vhtslbk
eightdgczsgkc5seventlsfd
xdljsnqjctzmmxcgxctdxxg73four
2shjqglxct5rctbmgvfvjfvrqsvdmthree
three71onekbksz8
ninesevenzrcxnnbvninetwoftsvg39
twofour36
onerddzfgdnpkjxlbh9twojbtqk
jjcnine59lgcttxncsix
ninesevenone76zrtmvdponeprfszns
bzrxtwocqczcmkdlnjtwor7
sixjqcgcl973one5eight
freightwo7three
dnzdrnthreemlqvrjspl79kfkfrbjm6czkzqvqp
two7953mftrgpkxjmrpvn
xone4vqljzqrspsgdhvnsgsptwo4
2612fvhthree
one3nine
8five9onetwo
fourtwo45sixxkjgdvrpltlnrtdbbpjjmqq
four1fiveonenine6
4three4
qkjpskjglpeightjnc8two
eight85sixfour
53fivefive
lbmqqpdbpnppzzmttmbpkxbl6sixfour
ninemlm7
mbvxvl2
1vpszgjvdbd
7qd7two3onesevenkkgnnlztzxs
cqrnn1ninefxpglvtkf1
7sixvnknzqpnhvsix6tbfnljfoursixrjzqxctmq
five889four
5rvsk7tsljtfivefour
prkhvq61clveight9dcvcfsr
four6ninenp2
xoneight2five3fqmc6zrgcbzbzghpvbzt
sixghxgbjfivesxrth5frzxcjfivegnktshzrpmbdlp
6prgnxdseven2ggcqhc88
five46
4bmvzlbcsggseventhreefivesix66
pzkljhppcmpnnng4
ninefivemqnjsmkgtnzzstrq55
one4lveightqjhjjzmrtwo97sctp
3vzdmk
lrzj71215
three78ddzzmvfxfzsqtkdqtfsnk5
db7
deightwofour9eight63foursixcgllm
123
sevenninegtphtjkkbhdx6sqbggcbljx4
8qtk4
thvml91nngfjgrsfive2three
17nine92twojkvmfrmpqhtlk
ninetworcvtjc76
5jrzpvgchg7tlfdlbfmxj8stb
3t6sixjtnjxhxnfv
9f2skxmzgnthreenine
8sevenonethreeeightsixthree
csrcdmtmscqvqkpthreepfour86
threeseveneightfour5zsgfour
onellbgsvseven9
rnnkxtbnx1threekbddbpzthreerxcnbcgx
jbvlsxdxsixxjj65one5fours
kzsix4zg8fgmzc
mkfpflcpkd37
5sixthreefivectltwo94eight
fponeight86phxr
278dmxscxb42
five86
63jqkh7sixnine1jmqsqtdhpg
zxchvfnvskctd9
64sgddnvnm6five37rzhpzlccz4
69nzlzkrkqt9ninehqrmvklgq234
qqtc2pdzzddgjrfhcvsbrbstwo4pdl
ninegjlqdclpmgcjfdqhhsl7n
voneight6
onevfqrnvpm9mfkgseightonemrpj
9twosixfivexz
1mlbvlninepjvn1onesixfour
1one33fiveeightfour
onevsrlmzfivefour11
5gpfqbtn9sevenninefiveseven
8six8oner3vxgttfhtlnnine
qc1kcpnpqdthreeeightwoj
v8onefive
8eight56kkpnbzvczmkxtzkjbcm1
1threegeightcjb5pdpz29
ttxcmthreekdsxdfxvrclfn4sixfive69
zgddz389
2one344nkxtsvf762
klncdshlrkpfrxflsncnfmtg5
trvmkbjvreight2kdhxfvlz3ds
seven57xqrzmcsnjftfthreeonetwofive
5five686lvmlgk4twonefmr
six1khm82xronexqhzjdqzx
zldbsjcsnine6vkdslrmtnpthree2
tbbtcl5xnsrjdz
1pqxgmnc1
3ninefckfrppvdlmf7
cprpq7three9twobql
fivexgjsgvpd12lzvcbpstpsprdvs
eightone2
4threeninexhdcxrffive414
79sxxtpxtpmj
37nine
mfmgtz32smkgxgmnk
68sevenhmchv
skjxk9shvdrznrrz5onetbdcjmk73
865seven
4twofivesixbtqjcjthreeeight
64fxctcljfsixninedxdbthree
rgxzttr21vnvgbcfceight91
jseven422onerzpxvgjpd
twofkktmpvcb4zngnnpdsixtwokgxcgk
xhcddkcvjpcb4354
88eightsevenseven
2twoqpxtqlccksixthreetwotwo
vqnlmpsixvpbxdnsfive4
fourfivefive6one
7xlkzc4
17klxs
snml9
ninepzvg964hqczmdfvnbvrkngrs
76nine5twosnm86
prjrjfxffczhv4six
eight53twonine
tkjh2eightjh
k2zsfdsm
four1hlxxvgqcgvhcdcjrr68
onethree4nine844threetwo
94twonedsn
2four3five4tgpkrjdmdfrbjddkxv
3cnsj
oneninetwo3cpfrdhnrbrd4
2nfcbffx1qhszkhkmmeightnine8v
4three6llthreemrpztjb
53xksczcvmdsixnmxvqcctpv1
xzhhpr66threeblplpkmktp9pgseven
seven63twoneb
9btlntpndseventwovtnplnqldthreenine
nthreeseven4five
zpktwone1gjzntpllkghhsqqsix8p
eightfourlcrkqcjfsheightfive69
hvkv8
four93dzrfive9eightthree8
9fivecfour47threecpcjbf
pb1one8two
seven64twofivefoursix
hgjjjj7mkxztspmzvbdcbbfkone
mkdmqzfpkvqfcfiveshstxgnrs9fzzdr
ssddfgcd2three
xzzrrxm28seven
1nffqfjtmftwothreeninerqbthmhkhseven
lkbbgsjmbtpgncfive63
jddsdrkmhkthreefoursixone1
6nine5ngdcninemq7xqlsmdkgjf
eightfhppf3f9jgdvzldxltrgg2
3nszqpfth9338six
srmhtvn46five8four
6qqttwoeightthree
threedpqxmlghsgls8sixsslthdfzdknmjeight
rtwone66four2
six4dt5one1
xrmlvrfpmtttvppc5
34fivesixfivesix
1rnrtkbqlpphqlch52eight
fourgbr19
79sixfoureight8
kdlqxjzdx7mrdqpeightzgdx
1eight6254dplmqrpkq1
sevenvqpnd222
mpddrhlncrp1fivev69znxthree
87znxjsmsvlzxbfivesevenrgghkbrsdq5
5rxbkctnsfeightxpbllldgjxqdrd3dmt
6twog48eightone
2sixfour
433onexklbhneightfour
eight5hjlmdsnzxeight1
9fvqtc
ltmcrnhrpqtwo7five9
six55
mpsjhvbxmkpppfjhdjlgcrvkzpvds6htl
jldzmj671vzljbmrjtwo
rsznrsrtcz2threerk5ggdrtfmktrjjrdpjvvhshhqszzmbzp
nine53v
6khbvone
tvzoneight5khzglntxjgb
qtgx9zhtrqcnlblvrsngsfkeightninefvlnpjbxsix
tljmkjbb1kncvqsix9jthkqlkvkztjjbtrbqjxjmrblzzjfive
eight6l
47qxgjthreeeightwohp
lqponeightggj4smzdbzqg86three
75znine
nvqgzfx4five
five8pks78fourdbspf
seventczx3threeninemlsevenmvntwo
one59tqqxbjhp
six5threehgmcnpvone6bsix4
eightsixckfpcffour4
hbzjvzdr2five7
one4jxz5fourm
76bbldjckqksixhcmb3
onenine49vq
6rzxhsmnfbmqgsgvt57k1six
zdftpqqplpqfhrd16four
ninebsnjtrkfhgfbqsnqhrthree1mqkrrtxnine4
nine3lhrzkbcmzq11
fourthree5ninesljdvseightsix5
8qjtbfjpf
8twobvtgbgbtnxrh5lblkxtnlphfmhpccfzz2
brqbgn27377kltngmlqsfnf3
twotwo67nkgmth9one
29twoonevqffqqjqsixthreeeightseven
xbrv6qgqjxmvjkr5ngjhdjlvnjsmlqgngfr
ggbmtmbcrnkj83vhhgdjlfsix4
4blnxlvmq6zpfpgxcp38
dcvrzvqcteighttwo3cxfn5
qzsix5fbqbflhzzvblfhvfgmzkm8
7twojtbdkzpsix2seven6
6six86
two4sbnnsskqtm
19onefourfivefoursmg7
9rxrbxbmqs1twoseveneightthreetwo
two3zmcdnm3rlpkjqgthree
gtlkgpmpprpbbrzjrsp9ssvnzg68nine
ptwonerddxhnzfive53xhflnccpfkeight1one
sixvxlbllseven8seven81
jhfxcvccjdsevenfive58
5ninefourmz
one7three9threeoneonetwo
four4clsfoursixxvkzx
fourseven3
szeightwo18l16rxcmvdmkcvb
bdzqlbthreedsb45five9
8pztdljxbjjthreenineeightseven7crkdr8eightwocb
9krvttdxf34mrpzzchrgeightthree
8jqlmgseveneightzvxrszfsixf
ninefiveztthreeeight7l5
7vhbjdnldvlfourhpptwo53pqbnzqnine
mxdhsixseven6
threepzlkeight7ppdpqqlv
nine15threeqxlrngntwokhzgh
4hblzjb22
pm6eighteightsnztcmfoureightninefive
3jffzhl
97dlrqzvfour6594oneightltg
sixlpfivelbjktk7
three23seven
44x7twoninedrzvnfourseven
8xpndnspgbnfourzcngchbmd
gpdfptgjxcthreeptmpttnfive1
rzcnffhslj398xrhlkbxbcgqtcsjdl3three7
fourddqlonetwo5ms7
zjnfvksq4djdrjtxdmnsixqshlntxn
fournpgkxtp4twojtmqgjgnzdxrnvdxfsltzpflmg1nine
one2one3
twosixfgklbnprck26vstrjkfxgmbhhceightwomz
bxxbt5two2g7
5gnineone8697five
vcvsfxdninecz8stcvnine
five8fivenxzcjqjxfrbmhdnthree6kkplgmthree
dtchdczdvbsevenzsb4one
78cdeightvjdlqpvql2fgrrrd61
pvr5nineoneightzvs
8three8jvthree
2one6one
three3six
thzmsdbqthreertfjsddone7
nmhctqdj3hlsixonevkhdbvskg
five42255
ninefivenqmljgv3
hjgm71
mldfbltrfn6jxjsixpbkzbcqvcj
three8nmmp9threeeightwohft
eight9zltdfrdnrthree
3twom
5kt
pgvglmgpjtnqnkg96seven3seven
lhnnine2qjptwonine3
eightfourllgmfkjnthreegc6bbdrfcninem
xmlckt9kkdprslxthree91nine
threespfklnine538
qlkbjplh1
5sevenfivefour
2ninejsjfngfhhldkkghqlmflqfbqpvtnsthgj8four
59eightthreejdzbzbfxlnjqgxxhpbhqhxv3
threebsgqfseven4xdvnpvpnzslfsvxvshptjffn
vnnpmdqhzm61sevenfivepmbktbsdljp
379zffourxvlvpb6
3mhlnbdqr
one9kjqtgm5hrbrxrseven
twobqssixdfz6
f1bnhjnfzpcrsevenfour3
ninefive1
5oneonecfdpdqthree75
eight7ninefivesft2cmfonefour
8fourfour
bnfive69vcqhfive5ft
9lkpj2eight9ssmsbh8three
bq9drgtone2sixfour9kthrmeightwob
eighteightgppg86
1six1fivekmnkvlfnhsxtpthree
gqxqtdktrltmhqp4fivelbqsrklgfllrh48fxgdlcvsrc
twothree6ckkclhsnine
five5eightqfn
37threedkvtvnfs3mbmzhjbnine
hclcdxsvhzpc9onethrees
6gff5txnv7qmgptkgdrggfnlh
nnpvnstlb9hhdqjhbxkbthrzclvsbgktwo
zvkqdqmqgfivetwo334vzgvllv
7foursix
ninedfbmns5xqthree
16frxsevenpnfbgdhb
qqfcn6353one
eightpczvxnzmhkgc25ztrrqkmeight
94lnlmx2
9mvtssn
kctwonegkprf9onefive38bjsvnnxsgpseven
4stwosevenkccc
1sbnbxzninesixfkcdfl
69eightonedsjoneone6
8five5rrsplshtlmrj
chntvmpkdr8nsnine12one
ninefourqlxfj6cfzczseven4v
1gsbnklv6lszhmrrfvmsevenpfckscfn5
lgt9ninekgstwovkgqckhbthree7three
ztwone91ltzmtmgpdr
1eightlqvrone
11jbvdprskhkczr32tdjmxbf1
oneqttfcdtxbt6
four6one8mvzqskzgnh
eight74fourcnflfncmjsix5skdqcmvtwo
jmqpvlv71
9oneightgd
8341
pdtmqvhzvp7
bpfnfdm2eight4
2fivedxlntgmgjtwooneightt
tjmvvbqmq9njjxrbmgrlcbrbtzjbone
7sixsixsix
eighttwo6bheightfour
onedtdhrsjsvflfmrkfz3d
hxbzrvj5ninenine
vdldceight7eight
twombtmnntjsfpmvjhqt2
2eight96
9fivegbgvtpzrg1
5three1fjhsn
473
np8
kbdrczcmsbfives4two9sevenseven
ninelmrkgtfive145five
5two92eightdspeight
6zxtlvlrcl
1mkcvsctvh1eight3pmrckhbone1
4pqrrvqsqlvsixbt1
742cl2qnknmcxqjtklbjmsjdvdhngptpljmfour
bfsfcf92
vzjlrffouronertfhcsmdgbjrdcd55
knineonecmsvonetwo3
vpnqsix2qgptjp5shdeightthree
jdp5lgffkrmsxjd8twoeightgnfzkpt8
four6three2rq6lpseven
1pfnmmpctwovqvonebcbqjhghrbthreepdxf
kpxkgdheight4nine
839sixfive5kh9
21seveneightmffgnmqvbfive32g
8twozncssnsllksbncbz1dgmtdljdssix
jchhdqjf1
7six2
onefourtwo3five
zgktwo3
dlxdsdslhnine7
two86
2kjkmmjbsprfourseventkqlr
5threetwocvhlnnqhchchgl6
gtdlffspsjhcnxqdfour6
2gkldzksdxcnhgcdvshgxjv9rcxhh
twogjx7nine
25threeqmh9qfghrnvzb
248onefouronexcjbbqpcfb
onethree8pqkzsmlfdcfhz
74j
szfjpjbnfcjmsthree9
99msrmcxn
1f9twoone
mrsvrhbgfone42fivethreetllzkd
rnrvx9925
4fourzhonefive2eight
threeonetwo3nfbgnjxq
eightgz1lnqeighteight
6fivefvvtvqcjsix
djrl13
gppmmzq5threej7pc4three
63sixhtcmp1sixtwo
fcjjzf3nxdtxnqmtjthreeonefour2
8fpbc5
25mrzjfppbfourfrzrspqkcbmn
1qrmkvgxnc
qvbmn7
nine6lvdddmrfxc4two4cdhhdzthree6
mtrjrfb6htv4mcrzqrbkthree
eight3oneseventbbdqpffnfm
eightxfll15rxkdkglxsthreethree7
38fivethreelsixbczgzdffn
884twolp1ninetwo
csxl4one8
dtrxqjshbfournine9two5gng
dgpvkcqzn7
nineeighttpzfnpzdtjzseven9seven
eightnkrrnmbvqz2cvktr
55nine6kttszrtjvm
vxvzmmmnrkzvkffivetxhgj8pqtfvvlprd
43kfvtplhjfdfivefiveseventwothreezkmqlsk
gpkgckdone7xssjkmlsgddg
4fourqrspbqzzthreefour28five
one1st3kmseven
fourjqmmbone6four7gnine5
one93mbdbtqvtqmcjxhtzst2onezhlmszqh
7krlt
dbstsmrm4onefour
vqqxjteight3
ppndcfssbchr2vsr4xdhzvs9jbdkrh
2vdkxkqmrzveightzrgnineninentx
6one7
three24sixsix
hthree441threemchrone
threeqhxzkpjkbthree5
seven5hcxhlgxtr8qjtjpqnqc
2mcxlqpqqffvljnhhlplnmlq
fvbckcgjgk7two
zgglpqj92bjfvrfntsdfvffx1fourseven
jgeightwo6
ldthsjlm6crjhxdvlqthree3
five38threenine4dgctxdfour
mljrxk52eight3bkbeight
1mkkgnvzeightninesnr
895sixd
qqngkprp9eight
9qp1cqtkhdhdlv6hrl8eightwodln
ldgksxpnp7mxckrpftsixone3bqkktvmqsix
chtzvmneighteight5pjrdxrmdqh82
tfr7ppsxdfvhtsdlqlmbscfourthree8bxhgtztwo
three65dnlpgcmx6
znf69pbfsbfmxgn7four9
5bhqfcghxssjflbzmrninesevengbqvtkgs8
3vkdpfdkhpsix96eightgbckkflpq
drkbpmfkrrzqeightninevgznnmf9three71
8lpl4twoneff
gvffv6229eightvbgbhzb8
xvrzxvxmsv3oneeight8eight8
4vfnppkqxvbxfktcltspgbnljp2
43twobgftvc
sdpmpm4sixfourzlxkfrt7nine
eightzkxc6nzgjfgmjdfive37jcz
624fivetxvlrtnnng3
fivefoureight5xrrvkjflbktjmxsonehlzggjkft
threextctdxfcmjsqxt9hscbhsevenfour
sdvmnpdfvsdslcqft3zhdhdbxvbkkseveneight
npzx52done
foursggcg88sixzhf4
one2fourr
jhjgptzvjhvs8eight
cdsrpfqmtnthreesevenonefive9
6five4four1xjjlhgsv
7nine5eightjbrdlvfphb
8ninegrhnkhsfc5pstfcrttwoone
9kpcchc
seveneightnine24
91two
four9vvlfive3five
threedmxvdqfrhrlfour5sixngmpngxvclcjhcrseven
threethree36seven1five6
six2five
one79581eight
xsrbppnt7nine8
lcltq633rvzkkqxfxmonenine3seven
4two9hnjxpmft3mkzdqcvjpsmnccplcqk
6six3
pr4eightfour2sixfivekgvstmktkcbqgz
foursevenpxgbkrmmcjbvdvqqcrdhbx1zkg
tkkl8sixvonesztkszlmzbczxgdnnkmn8
gzptmplvxzmzjqfzrjcmjlzbfdrpfpfivesix3three
848kphtdjgqfkfourshmzjpfdpsdfzxlldz
18eightjmlzlfdch64three
8pf6
5rt51
9ffpmlqnbcs7lcsrbczglslhrrphbh55
lcmllcsix7sbcrrrlfiveeight
9lbkmqrtfgxjphplc4eightfivethreesixzdpgrkptj
ltwo9
jbklfg3oneg
1g6sixlszmvjmrf4dzvnqcbzh
8lfxxtmfqslxqjxxshqs4
xddmf6five2
454eightnxtlqzeight
5xgtstcbfg
2seven7dqseven5hkndsjthree
sevenncjnrvvf24threezxdzps
onetfnl1xmlqkrsjbtwo71gbscmnmvnvmjj
8three8seven27cqxzkpbdzfourhghz
4kcrthree9
1dhsvlhzr8ngdb
cqvfmsdnone4tcfqhpdgzsixnineeight7
three7mtwosix
5eightonefourzxlhlhxlbxds4
8dzvdsp9xgnine
jzftwosnpgtpqt1
pdpfive72eight
lbvvclr71zmfmqjfq8gqmmltwo
84three
eight9fourfnzxkqt5ss3
threethreetworfqzpqfour172
ninemzxqfzqk96df
eight7cknshzjlnlcb3kzseven
eight9seven
twok5vmxtlpdhvthreeone
6seven2nmjdbjscsevenvkdmp
sixseven8
qslfivetwogvvlnine7ninefive
nrdcfbqczppphqvqxcd6mz
78ktndqqlrrlfourcgxpnvdps5
sixtwo8jrkz9q
986zhdpnlmlpseven
1six676rnine8eight
threebdqknone9onefour
dmnbb39seven6
threeqshbxpnm41two41five
mkdldph7eight7736
sevenfour25
p5q
263rgnrnmn97mbrjfnmgzlrgz
hmfgzqjtmhmncxthree26csfnggsmnt
8bzrjhrvdlzxnhctffoureight86sevencjtrpql
nine5twozl2seven
bsssxvkksbrgszldgpbfmxqldeight8tqmdvmdgrnclceight5
2seven41sixnine5
143lprjcnrzfive
2seven3
7853
46stkfqskgx9
4pztjcp3pmjnnts
sixptnckh8t
84seven
815four
pxxvhzc9rtgv1dph
73foursix4nflbrsvnzmmgmfbpg67
3nine57ninelzcsqsgrn
spzldcone17seventhreethreeqlrq
7three3zmmfvxtsdsthree
mgvmckndvnpc89jvqsix5
fouronej34vsrzdgnm
53g25nkpgckxl
lhtzx73mhqvgflfkblfjqrb4
eightfiveone5ktqstpvmszlhhssjbn
vgznine5s
5cgp
6cntgsl4ninemmgcsqntl9mzlvpqjz1
cpcqqv67seven33
9jvnlhceightvmtxddxlng5three
gcfcnpkjcj6five247zn
onekqqdjdqgnine1eightonesdx
8qzmdhp9983
1sevenfour
qvjfzqstwo7six
2sixvzvmsc2jczxrlcq5rj
ptgqfourvqmtglcnine7three2eight
xkprfrrjqr2eight6sixdkprbtpmpjxfvxtz
oneninetwo7cdbbrrlnjk
hvbhdqnpgzsevendjggs1threeglslxpmv4eight
fiveone348five85
87fcxflzm7
jlkoneight9seven
kx5hjbmqg8
vgklfrnljrbqeightfour5fhjhdhjgttxntmm
dtrkgphmlftq9threedmpbgsnsvzvsevenxnx
113nine8fourmvqqfblbgz
sdssh8nlzpgqdhvdpxc
ch2twofour26seven8
1fivebmxpnineone3eightwojhd
6xknv3threethree3
twostx3fourtptgklkfg
fourh9lxgnine55
one991two2lf6
two3jjhcmsd3sixeighttwoeight
43ms3sixthree4
9fourfrzrgvxrmkb6onez1
nvtjhfpbht376pp5eight
pbtclmsrkxspmmnchlm2sevenpqnksccztwo5eight
vtcjnine3
mcvsbgbktgssgkqxs1pztwo
kvndtblmgqbkzxhmghthree47mtqqjctxtm
bjkndjfivezctcbhzpffthreeninefourseven1xmfdsr
rhgshgkmtd9
sixtwobrnkvrlnsix7mvbp
twoninefivefive8fourvthree
kk3
1xpjcsbnpxtwofivehqvxpgqznlthree
vbcgppkcjjxqpknfthreefivenine19n
74jfqfbsjthjkhdzk
nine86vmclcgfscreighttnmlnsvdpxlkt
3dxbsctxgntfivehlcbdzgqtxvqddsjdrjnpgjtxhc
6ftlgzrbfjeightsix5onesevenfourtwoneh
4ninezcpvppbktl35eight
four7five27nine2
5qhbdqjcdtbsevenfivenine
99six
fourfivezhgtbmkhxrj9threehtwonebj
4threethree19threefivetjmcnvpkrfdmhjsnzlv
7sevenvxmtninefvvprtdhkhxpkth5
qbmtvl12fiveclone4three
44fivevpqtslbxkskhftmk
ltbfourkpbgvx3nine
zxtmnh111stz
3tdvhjtfdcheightwobjf
xrn14foureightspmeightspgmvbs9
j1
txsmrhnzf9fiveqnine4
31znnthgrtzf33dzxtdndbf
vdtwotwo4zjthree
17tdhvl4txhjthree9two7
1nttq8tphmdhbvnhcfqmvtmfxm1zzdcll
991
5zxlddbxrpc628
91dgxjxkrxfxtgzmfourzqlvpqvdbmgxxx1
tdk94sevenone6
two1fivembnftwoxqqjzdfivetxxm
four5one75eight
eighteight8znlfvz7
one3trkt77qnkgldtthree9two
fourdkgjxbf8one3three85
gkgsldqmndfrvx1tmfchpxsfxeight
fivevxfdmlrdqseight2zc3
32threegcznf25jvfn3five
7one86five
7vdckjfive8four7one
sixeight5gcdnine4
vgnvsv2zhvqkbrninehfkrn87
fkzonekghrlnmdktwo635
8fivekrhmdnt5sevenseven
three96bcvgp4
jhnvjp1rhrfive
fpvhhkqmgstwosix2jfour
sixqfvvbfvljmsevenlzfr5
xpvdzngsdz3nrvkr4lvhhdvmxq
8vlxjqpvpqmqnktfive
pvgxjdb7pqk711
pqxl3r8sixsixpstcxjtjdrns
gmmqrkfqrzddtmpnsvzkqnz3zjqbn9threenlm
2823eightfour4
two558xqtrtrtf8tnsj
bv6twonmfttddpf
17nbtdjone48
three6sevenzhzstnmlkf
89eightjlphdkfszlfftq44
threenxqvz3seveneight
1lzdsevenseven3onefourtwoeight
nnd1threez8
six9eight2nxcxplkdp8
cd88rkbvmqqlnfqgbbq66
2eight9cnzrk8five
onecl7
vjfsvqfivejhbscnhqkkfk31
fpqdkcsx6
ninezztlsddbk3two
1xmfsfh6726threesix
6four6196one7seven
2bpsgvlgcqvsix
1464hctgxfxzb
6nhcbfour36eightwohv
9five5
eight7dkktqkseven
pxzxsqz56fourtwofive
threednzfgdfpmr925two
kphngkzkpl867zllm95
39threekthvvqkvm2
seven6fsqfhltgvqnmghczlrjqnbjstsgprpxfhfphftfnp
23fourhjtvq7mp
drq9
fkqsmgddvxhrjvvtsjlr5four6
5ngcfsqvlcl7vbfive3
6372cltztz
1threefiveseventhree
one5ninebfdgzhqs581
hdqfour9
four6jzfdkdzkrdnnshltjlt
jlqtqzm6nine2one
bbvpcplzrbmjvvtm3qhk6fivefive2
pnclzfmfqcgmkrrtzlbptfnhlpdfsix66hjghhrmpvl
7sgnbxrkvfour4pqkpdzgmsg5three
lqgfzc9six57five9fivek
rfour9
3sfsgzbfoursix
5sixsqddmc67fiveone93
8sixnine
threecdgvgckq285
sevenfivetwo58qgq
4three3eightfouronefive2p
sroneightgmcbfhpsxdvlfqcvdhhk34
lxxhdmseveneighttwotwo5one34
threeninevlvch3fourrvppn6
4dgjx
twonpthklzbv8seven2lzbgktjfive
threefivesix7cnvjqpzrbv
zdonefour65seven
nine5vnmhqdntnlkfx6threeztdqpnm
2three8
tthqsj6two
3sixfivenine4pslhjnine5
1ckvr8
one8bnvhglghpq
zvzbnine91fiveseven
kffpqshlljcjqqlgp8threenine2
1fivek5qzfour
fqlthree14five1sixng7
two74fcrvqjtc
sixsixhbztdjfcztqrsqccdzb6lfx
twotwofour4onefourgszqbqlnz
4fourcjthree
5two7eight
zdzsmflkzvxkzvzvfive6
6vsblnxtwozjmrs
sixfour95jmzgl6
jgbpdkmltwo1xzxvvb
pnvcbnv6jpfkdddglz
sixz95threefourninesix3
9sixthree3three
tbzq1ninemrsfjncvsix6
zpjxspcmzhkdchhxqcd8threesixhdhfourfxpjzfqbone
m4cnntxcthree
38onexslhfourvttrfeightsqthree
eightng6pcz
8h1jkprzqdbz9six99
69nppconethree8
3qvlktndrrdtjrtmnine
two62eightthreevjjmtpmmt54
smgmnkmpktthree27nine
bdtbhgsdkjfhgrctc2trthree
six9sixthreeone
three6kssbz2sgnine
5kx88xfive
fiveeightpnfqtzcrkb22
fivettnmjmlrlb3fourfourjxmsj2five
xeightwo9cvpbhrgqphgdsix3foureight
1nhpcsrknine
gqtxctr1lfouronetwo
3sjdmn4ninevjpqgjvmzsqv319
joneight7zphm2hkpnine3szvjtljlqx
2sevenmmmhvxnfourvvtkpppc
vloneonethreeonenine2
9tbsmxpmsevensix
j3sixfive6fourninethree
ltmmsrbk8zjbpht9vxfive
nine1twoxpnsvnzqm3kgkkps7
eightthree59
nine5six616fourzmxkjpxr4
six42fivev
bgzteightsevencbbpfbbcrc5
dgmfbzbmlvzfive7pqmseventhree
sixsevenfiveonehcrbsevenfive3
twomjspbjhmlsqn42foursix
8two2seven6fourninefive
fourfivefvg1
twofour9
5vvlk3vfone
glrnhpdjq715ninehtone
1twosixmgrnvfmxxcfdtpjthreetwo
four21
3bjsrzpnq49ktnmrmlgeight5bvlvqdkcnvrrbvx
four4z3eight25seven
66bkdmrjh4three7
67zgzvldlkx2thgsbseight8seven
xknjonethreeninezjd4
17twofour64eightfnzkcgccljnrtnf
fivebgfpbtdn5f
ddlkgjmgs9twolxhpcqh
bgkzkf5fourtlphndsxb3nine
5srkjggqxmr3seven
fourksnmcsbcxsevenbnnrnvr9five
onetwonmsixltg5jztchznvml1five
3sevenone9ninetwofive
cqzsvsqrktwo8eight681seven
six5eightx7lpvlqpcp9
sbpbrqksix99four7six
mqcldhrjm49nine62fivethree
btskhbz7hkqnbhpnb4njbtrssp5oneonebth
2gtdvj9pbbbppkpg34dcjhbtc
mtphkzhdsix6seven
7dmsmrxfive2dmsbkhseven7
3five6xninezfqndzmtsix
8mrh5two2
zcpthree17ggpxmqlk
97tbtthree
tcztntvls2cnnlsixqjgkchpkmc
cjl462mdrxzzt
bbvhrqfjppsevenfive7fivethree
mfbmkd65
3471kmrcckrqgninethree7
2bfourtwocdhjzqvsxknine3three
ljzxxfcbfive1eight8eightkx7
gsdcjthree1
gmctxtr1jdsl
rrjtxqqtssix45three1five
7633
sixbpsdone7fourrmgzjp1
26flznhqvrcpzfbqkseven5nine9zfg
nrqgcthree15dchnrnghkntktfxl
fzvbvntrhrmcx81nvnfppmz
qrfzn1sqg
pcbvps9xhlkjnpgpfoursr6
6v7
six75sixninezpsjptdfhkrk
dlfgjjkfmfngfivefive5lzrcbsz
6sfgpfg
5four1bvggfs62nineone
2eightthreegvqznfjmhdxhblxf7qkxcst
seven51ldfnhlpvzn1ctlmn
jxdhkn56vmnxseven
89fjpcfklprlqkcbxjpdnp3
lxdgnhqqgvone3
ninesftqvgbbl4seven
4pcqqxhghsnn9two8gqrqdzjt3
2jntsg1two48zbbclss5
onegcgcrccvsxzvkpfqdj4oneightrgd
xrpnjjdqxxkqjqjvgsevenjnnkmxxgtl2smcbrlcceight
sixone43
2nine1ninejrdzndmqjfourthreegnsxstzjqc2
rtptwoone2sixlxtn3
one4twosevenbhbmlt
xfiveeight41832
bxgfchvjpgcmmmcchxsixcqeightskxbmscgpsix45
fivesix17zhcvp5
jkjmvzjmonefour73eight8fiveoneightczf
nbsjxlmdzx95
8threeonesix5rzr
rxktdsbrr6nineseven7
4twofvhvl3srvtcgkjm4oneighthx
39mqbdrf
8sevenseven79xqtvrznine1
1sdckgsknfour
sevendmftpbmfzkctrfdzlhk3sevenfourhqbxcjn
hxkxzvz3147zksknjrjmvbtbrtm
xqnjh3518rtgcqggb
fnzvkdqhpmm555nljnxmdprb
97fourtwo
5xhkdtvkgvhvsthreebrvbp72
jhl48khqkfbxjpgvprhbzp9fivepknpdthvthree
kjk6
43fiveonetlzeight16j
one4threesix
mtsbnsgtwofourzkn3twoone7
pmttwo45x
182twoone
jpltone6one1
33jkrsevenseven
cbtnktlrksevenone4onesevensevensvvxjjgrx
9zzgsq34eight9eight
9five1
threehfjkpxcvnbthreethreefour6
fivevgtwo1rctjzcrlninethree5six
1onetwotzhvqgtpnxz1vntznz
jvvztshjdchbgkcxmjkjghth54twofourrvbl
onesix4seven7fourdgdsmvldzccqlhrxl
839hdjjplqgclx
jqtfgbxkgb368
6sevenfivedlprsevenc
6czklmzsmxgmktzxmxsixmnlfxonetwonesgj
four28sbkrsqcdgl1three
sllmdpqvvdeight5vtvcz3kthpxgfkbgklxrfm
one5six6
3psklrfivefvlxrsghqveight34
6gkrrpj
32ddzqvxbpgrlndeight
nine16sixljvqjsddfstwo9
eightmpfjpdkhhzsix23one5
rjnlkfv9txshfcvgzp9875qtqvbjjvbggpvmpqfr
dvjnqskcqqb5pppfvgcz7one
threekllssmdxsjtwodzdcxjlk43
fourninervscfnpgt8xkmkflvtjthree
xcvpzpfdrtthreesix2nine
onektssgthree8rjvlkpq8mfour
twoqqxgqblvmc8tqsrbs
fourthreejlgkfour6
ninesix87
92
pmzqmmdh9vqvxrxbhglj7
fourrhhhdmzcbvbldqlmb4
rtrx3foureightsxlp2mlxtslh6five
3nineddhmnfngtfour1seven3
lfnt5
3kjhffpxlt2
onefive29htsdkllvr
tbninefour4eight
18k62nine1
seven6sevenphjfhdtnrhfsgcfived9seven
ttmtqrh3four4oneightrkv
42onekfbgxgtzl7qxzrmqbmeight
7fjkfdlmhqxtwoxcpssngss
gsntbddbnone4cjqjmspzcsxmvvthreefive
56four4one2
cqmzqbxzfvonevmmmlxsnjr5zfg
     */
}
