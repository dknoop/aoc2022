import java.util.ArrayList;
import java.util.List;

public class Day7 {

    private static String input = "$ cd /\n" +
            "$ ls\n" +
            "246027 gldg.jrd\n" +
            "dir qffvbf\n" +
            "dir qjjgh\n" +
            "dir vpjqpqfm\n" +
            "$ cd qffvbf\n" +
            "$ ls\n" +
            "dir dcqf\n" +
            "dir grcj\n" +
            "dir hwllqcd\n" +
            "76103 jrhp.hgg\n" +
            "253696 nscv.wvb\n" +
            "dir stnrzs\n" +
            "dir vzgpfd\n" +
            "$ cd dcqf\n" +
            "$ ls\n" +
            "dir gcjmpnsl\n" +
            "$ cd gcjmpnsl\n" +
            "$ ls\n" +
            "198360 gldg.jrd\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd grcj\n" +
            "$ ls\n" +
            "56512 grgtnhn.zdn\n" +
            "$ cd ..\n" +
            "$ cd hwllqcd\n" +
            "$ ls\n" +
            "100505 frzf.mzc\n" +
            "209030 gldg.jrd\n" +
            "9330 jjtjjlsr.dnl\n" +
            "191034 mfmps.vjt\n" +
            "82405 nscv.wvb\n" +
            "$ cd ..\n" +
            "$ cd stnrzs\n" +
            "$ ls\n" +
            "dir gmtmfpmb\n" +
            "dir jrhp\n" +
            "dir rhf\n" +
            "dir wzjtd\n" +
            "$ cd gmtmfpmb\n" +
            "$ ls\n" +
            "279472 hswhjhmj\n" +
            "81339 rsgsrn\n" +
            "$ cd ..\n" +
            "$ cd jrhp\n" +
            "$ ls\n" +
            "dir fpmnp\n" +
            "99771 grcj.scb\n" +
            "dir hjglg\n" +
            "dir hwvzv\n" +
            "$ cd fpmnp\n" +
            "$ ls\n" +
            "33215 grcj.tcj\n" +
            "$ cd ..\n" +
            "$ cd hjglg\n" +
            "$ ls\n" +
            "206893 tctfwpf.jhv\n" +
            "$ cd ..\n" +
            "$ cd hwvzv\n" +
            "$ ls\n" +
            "dir mfmps\n" +
            "$ cd mfmps\n" +
            "$ ls\n" +
            "46252 rjrmbqwr.wbj\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd rhf\n" +
            "$ ls\n" +
            "222859 dcgvw\n" +
            "41140 grcj.qzh\n" +
            "dir zcjh\n" +
            "217515 zgqjbf\n" +
            "$ cd zcjh\n" +
            "$ ls\n" +
            "92243 prqhbzl.hls\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd wzjtd\n" +
            "$ ls\n" +
            "dir bnjj\n" +
            "dir dhhpf\n" +
            "dir grcj\n" +
            "dir jqmnp\n" +
            "16602 mfmps.dht\n" +
            "dir mrgh\n" +
            "112236 rsgsrn\n" +
            "dir wqwwwfd\n" +
            "243851 zgqjbf.bjh\n" +
            "$ cd bnjj\n" +
            "$ ls\n" +
            "158778 zjdvggcz.fhr\n" +
            "$ cd ..\n" +
            "$ cd dhhpf\n" +
            "$ ls\n" +
            "228680 gldg.jrd\n" +
            "18523 wcfpqqp.tcf\n" +
            "$ cd ..\n" +
            "$ cd grcj\n" +
            "$ ls\n" +
            "dir bcbspw\n" +
            "dir mpq\n" +
            "dir pjzw\n" +
            "$ cd bcbspw\n" +
            "$ ls\n" +
            "5449 rsgsrn\n" +
            "$ cd ..\n" +
            "$ cd mpq\n" +
            "$ ls\n" +
            "135338 mfmps\n" +
            "$ cd ..\n" +
            "$ cd pjzw\n" +
            "$ ls\n" +
            "dir cpffwn\n" +
            "$ cd cpffwn\n" +
            "$ ls\n" +
            "131835 rnwqngz\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd jqmnp\n" +
            "$ ls\n" +
            "281939 nscv.wvb\n" +
            "103834 rsgsrn\n" +
            "34528 wcfpqqp.tcf\n" +
            "$ cd ..\n" +
            "$ cd mrgh\n" +
            "$ ls\n" +
            "dir grcj\n" +
            "$ cd grcj\n" +
            "$ ls\n" +
            "211470 bbzm.sbq\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd wqwwwfd\n" +
            "$ ls\n" +
            "59532 blfr.lqh\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd vzgpfd\n" +
            "$ ls\n" +
            "dir grcj\n" +
            "dir lvhfqr\n" +
            "dir zgvjpnf\n" +
            "$ cd grcj\n" +
            "$ ls\n" +
            "160936 jbfsbsnn.sgj\n" +
            "dir mfmps\n" +
            "dir mfqjssr\n" +
            "dir vzgpfd\n" +
            "dir zgqjbf\n" +
            "$ cd mfmps\n" +
            "$ ls\n" +
            "176441 dcgvw\n" +
            "9961 grcj.sdl\n" +
            "dir mfmps\n" +
            "181303 nscv.wvb\n" +
            "273550 zfjhqtp\n" +
            "$ cd mfmps\n" +
            "$ ls\n" +
            "dir ndqjhlhp\n" +
            "$ cd ndqjhlhp\n" +
            "$ ls\n" +
            "43593 wcfpqqp.tcf\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd mfqjssr\n" +
            "$ ls\n" +
            "137211 gldg.jrd\n" +
            "254301 grcj.rgv\n" +
            "$ cd ..\n" +
            "$ cd vzgpfd\n" +
            "$ ls\n" +
            "dir hqnfwtj\n" +
            "dir mtqzh\n" +
            "215717 thd.cgt\n" +
            "dir vgtvctd\n" +
            "dir vzgpfd\n" +
            "64282 zgqjbf\n" +
            "$ cd hqnfwtj\n" +
            "$ ls\n" +
            "155738 cjpqzq\n" +
            "128579 cnsm.mdt\n" +
            "150972 fpmjd\n" +
            "54851 rsgsrn\n" +
            "$ cd ..\n" +
            "$ cd mtqzh\n" +
            "$ ls\n" +
            "288824 bjnhtwg\n" +
            "209838 gldg.jrd\n" +
            "87464 jgdhm.wrb\n" +
            "dir nbnzfc\n" +
            "$ cd nbnzfc\n" +
            "$ ls\n" +
            "dir rtrbhtb\n" +
            "267378 wcfpqqp.tcf\n" +
            "152165 wsww.gdd\n" +
            "$ cd rtrbhtb\n" +
            "$ ls\n" +
            "264454 dcgvw\n" +
            "221078 jrhp.fsj\n" +
            "dir sgm\n" +
            "$ cd sgm\n" +
            "$ ls\n" +
            "dir tzzfc\n" +
            "$ cd tzzfc\n" +
            "$ ls\n" +
            "207888 cdmht.jjn\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd vgtvctd\n" +
            "$ ls\n" +
            "dir dtm\n" +
            "dir gghjmgqs\n" +
            "dir grcj\n" +
            "dir lcpmlcpn\n" +
            "57113 njpnzq.phl\n" +
            "279566 rsgsrn\n" +
            "59404 tzl\n" +
            "221164 vcpzw.qsh\n" +
            "$ cd dtm\n" +
            "$ ls\n" +
            "dir pmsvz\n" +
            "dir zdzv\n" +
            "$ cd pmsvz\n" +
            "$ ls\n" +
            "dir qctt\n" +
            "$ cd qctt\n" +
            "$ ls\n" +
            "285640 wzh.hwv\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd zdzv\n" +
            "$ ls\n" +
            "178732 fdvth.rvs\n" +
            "dir jjslblcb\n" +
            "dir tvq\n" +
            "dir zgqjbf\n" +
            "$ cd jjslblcb\n" +
            "$ ls\n" +
            "dir grcj\n" +
            "$ cd grcj\n" +
            "$ ls\n" +
            "186485 wcfpqqp.tcf\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd tvq\n" +
            "$ ls\n" +
            "48035 jrhp.qnf\n" +
            "$ cd ..\n" +
            "$ cd zgqjbf\n" +
            "$ ls\n" +
            "276537 gldg.jrd\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd gghjmgqs\n" +
            "$ ls\n" +
            "238068 qqczbf\n" +
            "$ cd ..\n" +
            "$ cd grcj\n" +
            "$ ls\n" +
            "dir qnn\n" +
            "$ cd qnn\n" +
            "$ ls\n" +
            "117284 jmst.mld\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd lcpmlcpn\n" +
            "$ ls\n" +
            "dir cbzpzsj\n" +
            "53036 frzslwl.qgd\n" +
            "82430 grcj\n" +
            "273768 pvzslpsn.ztw\n" +
            "67092 rsgsrn\n" +
            "$ cd cbzpzsj\n" +
            "$ ls\n" +
            "36456 gldg.jrd\n" +
            "95656 mfmps.cfl\n" +
            "2578 qpl.jhn\n" +
            "225756 sqt.njp\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd vzgpfd\n" +
            "$ ls\n" +
            "266582 cgvcwrfn.jjq\n" +
            "230770 dcgvw\n" +
            "266361 gqqcqtp.hvq\n" +
            "dir lnn\n" +
            "86659 pzft.smj\n" +
            "180519 qfszrvm.gnq\n" +
            "dir rwrt\n" +
            "dir thrthq\n" +
            "dir zgqjbf\n" +
            "$ cd lnn\n" +
            "$ ls\n" +
            "13294 dqqvbcf\n" +
            "268614 mczrlg.vmz\n" +
            "dir wqccmlvq\n" +
            "dir zgqjbf\n" +
            "$ cd wqccmlvq\n" +
            "$ ls\n" +
            "dir grcj\n" +
            "$ cd grcj\n" +
            "$ ls\n" +
            "55504 gldg.jrd\n" +
            "6925 jbqzth.rcj\n" +
            "168475 jqzmc.sfm\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd zgqjbf\n" +
            "$ ls\n" +
            "172255 nptpqjd.hzz\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd rwrt\n" +
            "$ ls\n" +
            "78039 jrhp.cmf\n" +
            "237632 mfmps\n" +
            "$ cd ..\n" +
            "$ cd thrthq\n" +
            "$ ls\n" +
            "122514 jrhp.fcj\n" +
            "$ cd ..\n" +
            "$ cd zgqjbf\n" +
            "$ ls\n" +
            "dir dpbnq\n" +
            "dir mfmps\n" +
            "dir rbnzhhn\n" +
            "$ cd dpbnq\n" +
            "$ ls\n" +
            "dir vzgpfd\n" +
            "$ cd vzgpfd\n" +
            "$ ls\n" +
            "278947 bhdtwf\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd mfmps\n" +
            "$ ls\n" +
            "118315 mfmps.lbq\n" +
            "$ cd ..\n" +
            "$ cd rbnzhhn\n" +
            "$ ls\n" +
            "96386 svwv.ldj\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd zgqjbf\n" +
            "$ ls\n" +
            "196735 cmrdgjl.hbd\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd lvhfqr\n" +
            "$ ls\n" +
            "dir njzv\n" +
            "dir sgwzscp\n" +
            "dir zgqjbf\n" +
            "$ cd njzv\n" +
            "$ ls\n" +
            "60680 bmqh.snz\n" +
            "129703 wcfpqqp.tcf\n" +
            "$ cd ..\n" +
            "$ cd sgwzscp\n" +
            "$ ls\n" +
            "dir rnjrj\n" +
            "1799 vzgpfd\n" +
            "37203 zgqjbf.jwf\n" +
            "25768 zjh\n" +
            "$ cd rnjrj\n" +
            "$ ls\n" +
            "242223 blrzc\n" +
            "63563 plb.dlq\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd zgqjbf\n" +
            "$ ls\n" +
            "91151 cmn.gcw\n" +
            "235818 llsnw.phb\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd zgvjpnf\n" +
            "$ ls\n" +
            "158932 nscv.wvb\n" +
            "110912 wzm\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd qjjgh\n" +
            "$ ls\n" +
            "dir cwslqsb\n" +
            "34405 dcgvw\n" +
            "dir fvmmd\n" +
            "dir jrhp\n" +
            "dir vflhljrl\n" +
            "239915 vzgpfd\n" +
            "$ cd cwslqsb\n" +
            "$ ls\n" +
            "49934 mqzfncgb.jbf\n" +
            "$ cd ..\n" +
            "$ cd fvmmd\n" +
            "$ ls\n" +
            "dir grcj\n" +
            "dir jrhp\n" +
            "dir sqmbncp\n" +
            "dir vzgpfd\n" +
            "$ cd grcj\n" +
            "$ ls\n" +
            "32276 bjgc\n" +
            "211068 mfmps\n" +
            "$ cd ..\n" +
            "$ cd jrhp\n" +
            "$ ls\n" +
            "218633 wpqh.jfl\n" +
            "$ cd ..\n" +
            "$ cd sqmbncp\n" +
            "$ ls\n" +
            "137187 tzqqm.jqr\n" +
            "$ cd ..\n" +
            "$ cd vzgpfd\n" +
            "$ ls\n" +
            "258286 hqg.qzn\n" +
            "dir mvqgb\n" +
            "236455 vqdtns\n" +
            "255724 wrnhw.mzf\n" +
            "192529 zgqjbf.zzb\n" +
            "$ cd mvqgb\n" +
            "$ ls\n" +
            "dir vzgpfd\n" +
            "$ cd vzgpfd\n" +
            "$ ls\n" +
            "200955 grcj.wwl\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd jrhp\n" +
            "$ ls\n" +
            "86368 dcgvw\n" +
            "16512 vzgpfd\n" +
            "245341 wcfpqqp.tcf\n" +
            "$ cd ..\n" +
            "$ cd vflhljrl\n" +
            "$ ls\n" +
            "82670 gldg.jrd\n" +
            "228251 nscv.wvb\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd vpjqpqfm\n" +
            "$ ls\n" +
            "246705 gfff\n" +
            "dir grcj\n" +
            "dir hjdwrt\n" +
            "dir mfmps\n" +
            "dir plrrsmph\n" +
            "dir rgqtzc\n" +
            "175555 rsgsrn\n" +
            "142983 wjpbr.hdr\n" +
            "dir zlv\n" +
            "$ cd grcj\n" +
            "$ ls\n" +
            "dir grcj\n" +
            "dir mdvcmm\n" +
            "285341 mfmps\n" +
            "89089 nscv.wvb\n" +
            "$ cd grcj\n" +
            "$ ls\n" +
            "dir fcdz\n" +
            "dir fswpmd\n" +
            "dir gvjjjp\n" +
            "dir jrhp\n" +
            "$ cd fcdz\n" +
            "$ ls\n" +
            "dir dpwvm\n" +
            "dir rmmw\n" +
            "$ cd dpwvm\n" +
            "$ ls\n" +
            "dir chjbpb\n" +
            "118852 dcgvw\n" +
            "dir dsc\n" +
            "7271 fclhnmz.cbp\n" +
            "$ cd chjbpb\n" +
            "$ ls\n" +
            "41211 pzr\n" +
            "$ cd ..\n" +
            "$ cd dsc\n" +
            "$ ls\n" +
            "217960 nscv.wvb\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd rmmw\n" +
            "$ ls\n" +
            "dir cqzvcv\n" +
            "dir hld\n" +
            "99687 jrhp.nnb\n" +
            "dir pfvthfw\n" +
            "97451 qjmfdjwz.phc\n" +
            "$ cd cqzvcv\n" +
            "$ ls\n" +
            "dir zgqjbf\n" +
            "$ cd zgqjbf\n" +
            "$ ls\n" +
            "204153 nscv.wvb\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd hld\n" +
            "$ ls\n" +
            "113905 pwqs\n" +
            "244609 wfsgg.jgp\n" +
            "$ cd ..\n" +
            "$ cd pfvthfw\n" +
            "$ ls\n" +
            "dir grcj\n" +
            "$ cd grcj\n" +
            "$ ls\n" +
            "207441 jrhp\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd fswpmd\n" +
            "$ ls\n" +
            "99446 gldg.jrd\n" +
            "$ cd ..\n" +
            "$ cd gvjjjp\n" +
            "$ ls\n" +
            "dir pvzz\n" +
            "279071 wdmm.vjv\n" +
            "$ cd pvzz\n" +
            "$ ls\n" +
            "196937 nqfzj\n" +
            "273491 nscv.wvb\n" +
            "dir qthbl\n" +
            "$ cd qthbl\n" +
            "$ ls\n" +
            "204553 dcgvw\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd jrhp\n" +
            "$ ls\n" +
            "175979 fct.dcg\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd mdvcmm\n" +
            "$ ls\n" +
            "dir crscnnh\n" +
            "109461 dcdtm.tvp\n" +
            "279544 ftzvrpcw.pff\n" +
            "124059 nnc\n" +
            "274104 nscv.wvb\n" +
            "dir ssvd\n" +
            "dir zvvhlw\n" +
            "$ cd crscnnh\n" +
            "$ ls\n" +
            "dir tzbjl\n" +
            "$ cd tzbjl\n" +
            "$ ls\n" +
            "112219 wcfpqqp.tcf\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ssvd\n" +
            "$ ls\n" +
            "227906 bsqhzw\n" +
            "$ cd ..\n" +
            "$ cd zvvhlw\n" +
            "$ ls\n" +
            "166628 gldg.jrd\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd hjdwrt\n" +
            "$ ls\n" +
            "59644 jrhp.fjj\n" +
            "dir rpsrm\n" +
            "221706 rsgsrn\n" +
            "dir rzn\n" +
            "14344 tvlmvr.flr\n" +
            "dir vlbrnq\n" +
            "dir vrcns\n" +
            "39113 wcfpqqp.tcf\n" +
            "dir zhwm\n" +
            "$ cd rpsrm\n" +
            "$ ls\n" +
            "282957 wmpnpjzd\n" +
            "$ cd ..\n" +
            "$ cd rzn\n" +
            "$ ls\n" +
            "142973 wcfpqqp.tcf\n" +
            "$ cd ..\n" +
            "$ cd vlbrnq\n" +
            "$ ls\n" +
            "79661 ccznjt.fqr\n" +
            "$ cd ..\n" +
            "$ cd vrcns\n" +
            "$ ls\n" +
            "262645 dcnnnhn.vhg\n" +
            "$ cd ..\n" +
            "$ cd zhwm\n" +
            "$ ls\n" +
            "dir glgs\n" +
            "dir grcj\n" +
            "dir jrhp\n" +
            "$ cd glgs\n" +
            "$ ls\n" +
            "282326 tcw.qnb\n" +
            "$ cd ..\n" +
            "$ cd grcj\n" +
            "$ ls\n" +
            "43293 qnqb.jqg\n" +
            "$ cd ..\n" +
            "$ cd jrhp\n" +
            "$ ls\n" +
            "197274 pgf.ltc\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd mfmps\n" +
            "$ ls\n" +
            "dir dcm\n" +
            "47902 mrcn.wtb\n" +
            "8444 mzdgdh.ctn\n" +
            "$ cd dcm\n" +
            "$ ls\n" +
            "72397 mnrvqg.vmm\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd plrrsmph\n" +
            "$ ls\n" +
            "216816 gldg.jrd\n" +
            "148190 jzbswh\n" +
            "120319 wcfpqqp.tcf\n" +
            "dir zgqjbf\n" +
            "$ cd zgqjbf\n" +
            "$ ls\n" +
            "dir cfdr\n" +
            "dir hdsnc\n" +
            "$ cd cfdr\n" +
            "$ ls\n" +
            "34272 bzctmbvt.qzr\n" +
            "$ cd ..\n" +
            "$ cd hdsnc\n" +
            "$ ls\n" +
            "43772 ccds.vlz\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd rgqtzc\n" +
            "$ ls\n" +
            "dir dblznh\n" +
            "dir lfpdqm\n" +
            "dir lmnmthm\n" +
            "dir mfmps\n" +
            "dir pcplzs\n" +
            "dir pvfbjm\n" +
            "dir rnl\n" +
            "dir wqgp\n" +
            "dir zgqjbf\n" +
            "$ cd dblznh\n" +
            "$ ls\n" +
            "65168 tdv.mwq\n" +
            "$ cd ..\n" +
            "$ cd lfpdqm\n" +
            "$ ls\n" +
            "dir cgvnspv\n" +
            "dir dthhvrln\n" +
            "dir jrhp\n" +
            "dir vzgpfd\n" +
            "$ cd cgvnspv\n" +
            "$ ls\n" +
            "dir qnmg\n" +
            "$ cd qnmg\n" +
            "$ ls\n" +
            "dir grcj\n" +
            "70937 jbvrp.psn\n" +
            "207093 vfgds.tjv\n" +
            "282330 vtlzgq.dfd\n" +
            "251235 zbvgc.whr\n" +
            "$ cd grcj\n" +
            "$ ls\n" +
            "dir pbn\n" +
            "$ cd pbn\n" +
            "$ ls\n" +
            "22094 dqt.dtv\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd dthhvrln\n" +
            "$ ls\n" +
            "206159 wvvczgd.wzs\n" +
            "$ cd ..\n" +
            "$ cd jrhp\n" +
            "$ ls\n" +
            "dir bqf\n" +
            "5738 rgpwf\n" +
            "dir zjhw\n" +
            "$ cd bqf\n" +
            "$ ls\n" +
            "dir clgjfn\n" +
            "58416 fcr\n" +
            "216467 mcdqnw.prv\n" +
            "288978 zthdgfhl.lqq\n" +
            "$ cd clgjfn\n" +
            "$ ls\n" +
            "274929 lwnpggm.mfp\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd zjhw\n" +
            "$ ls\n" +
            "dir cbwrrzwh\n" +
            "dir fdz\n" +
            "dir grcj\n" +
            "219439 grcj.szv\n" +
            "285756 mfmps\n" +
            "113288 mmg.cpr\n" +
            "236059 nmq\n" +
            "dir pbnfdq\n" +
            "74013 tvmswr\n" +
            "dir zgqjbf\n" +
            "$ cd cbwrrzwh\n" +
            "$ ls\n" +
            "223425 zgqjbf.ffm\n" +
            "$ cd ..\n" +
            "$ cd fdz\n" +
            "$ ls\n" +
            "dir wbtzsr\n" +
            "$ cd wbtzsr\n" +
            "$ ls\n" +
            "257781 hzf\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd grcj\n" +
            "$ ls\n" +
            "58266 dcgvw\n" +
            "dir rhncgdll\n" +
            "dir vzgpfd\n" +
            "12503 zgv.ndt\n" +
            "$ cd rhncgdll\n" +
            "$ ls\n" +
            "dir vnmbhbhc\n" +
            "$ cd vnmbhbhc\n" +
            "$ ls\n" +
            "10019 lfcggd.ccw\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd vzgpfd\n" +
            "$ ls\n" +
            "134965 zdsp.tzg\n" +
            "78684 zmjjvf.glv\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd pbnfdq\n" +
            "$ ls\n" +
            "173729 frqdqhw\n" +
            "dir fvjc\n" +
            "41055 svwd\n" +
            "106934 tngzpl.lml\n" +
            "dir zqhjjjd\n" +
            "$ cd fvjc\n" +
            "$ ls\n" +
            "88907 pcvcpptp.dsr\n" +
            "133102 tszsbtjp.lfl\n" +
            "$ cd ..\n" +
            "$ cd zqhjjjd\n" +
            "$ ls\n" +
            "61260 mpdlcjl\n" +
            "dir wfw\n" +
            "$ cd wfw\n" +
            "$ ls\n" +
            "dir jrhp\n" +
            "dir lwg\n" +
            "226393 rndnc\n" +
            "dir zhrtj\n" +
            "$ cd jrhp\n" +
            "$ ls\n" +
            "276912 dcgvw\n" +
            "dir pwrjq\n" +
            "dir zmnv\n" +
            "$ cd pwrjq\n" +
            "$ ls\n" +
            "198180 vclfmjf.tfp\n" +
            "$ cd ..\n" +
            "$ cd zmnv\n" +
            "$ ls\n" +
            "84228 mfmps.wzw\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd lwg\n" +
            "$ ls\n" +
            "dir jrhp\n" +
            "50562 lwcfwjh.dtm\n" +
            "145174 vnl\n" +
            "$ cd jrhp\n" +
            "$ ls\n" +
            "86877 dcgvw\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd zhrtj\n" +
            "$ ls\n" +
            "284728 rsgsrn\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd zgqjbf\n" +
            "$ ls\n" +
            "202268 zqpvm\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd vzgpfd\n" +
            "$ ls\n" +
            "138188 djqqfrbn.cps\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd lmnmthm\n" +
            "$ ls\n" +
            "2715 fqdm.bvm\n" +
            "37482 jdsn.zpr\n" +
            "255467 nscv.wvb\n" +
            "175914 stvscbg\n" +
            "$ cd ..\n" +
            "$ cd mfmps\n" +
            "$ ls\n" +
            "288712 gldg.jrd\n" +
            "182389 jrhp\n" +
            "dir lvjg\n" +
            "41815 nscv.wvb\n" +
            "dir vzgpfd\n" +
            "dir zgqjbf\n" +
            "dir zvpnq\n" +
            "$ cd lvjg\n" +
            "$ ls\n" +
            "184529 wcfpqqp.tcf\n" +
            "$ cd ..\n" +
            "$ cd vzgpfd\n" +
            "$ ls\n" +
            "265556 hjqng.glq\n" +
            "$ cd ..\n" +
            "$ cd zgqjbf\n" +
            "$ ls\n" +
            "dir dqmbmlrf\n" +
            "dir grcj\n" +
            "dir hlsr\n" +
            "$ cd dqmbmlrf\n" +
            "$ ls\n" +
            "dir bdvhvwct\n" +
            "254123 bzhhm.rqp\n" +
            "172950 fgqbj.bcb\n" +
            "7417 fjfq.qbv\n" +
            "188707 hfvvlvqg.sqh\n" +
            "78273 ppljtfjr.hpm\n" +
            "dir zgqjbf\n" +
            "$ cd bdvhvwct\n" +
            "$ ls\n" +
            "76840 gldg.jrd\n" +
            "dir grcj\n" +
            "$ cd grcj\n" +
            "$ ls\n" +
            "dir vzgpfd\n" +
            "$ cd vzgpfd\n" +
            "$ ls\n" +
            "73163 mfmps.tnr\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd zgqjbf\n" +
            "$ ls\n" +
            "62316 lpzsww\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd grcj\n" +
            "$ ls\n" +
            "160721 bwvgdqdr\n" +
            "$ cd ..\n" +
            "$ cd hlsr\n" +
            "$ ls\n" +
            "214688 vzgpfd\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd zvpnq\n" +
            "$ ls\n" +
            "34940 gjbzp.nqg\n" +
            "165326 mfmps.gfp\n" +
            "dir rwddqchj\n" +
            "dir ssw\n" +
            "dir zgqjbf\n" +
            "$ cd rwddqchj\n" +
            "$ ls\n" +
            "dir gnsndln\n" +
            "$ cd gnsndln\n" +
            "$ ls\n" +
            "223320 zgqjbf.wlm\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ssw\n" +
            "$ ls\n" +
            "dir grcj\n" +
            "$ cd grcj\n" +
            "$ ls\n" +
            "251146 gldg.jrd\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd zgqjbf\n" +
            "$ ls\n" +
            "45732 vzgpfd.nbz\n" +
            "86126 zdnv.sss\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd pcplzs\n" +
            "$ ls\n" +
            "90287 grcj\n" +
            "99213 rsgsrn\n" +
            "dir shmsp\n" +
            "156357 tgc.lzp\n" +
            "dir thbznt\n" +
            "dir vtqlszrs\n" +
            "dir vzgpfd\n" +
            "$ cd shmsp\n" +
            "$ ls\n" +
            "dir jrhp\n" +
            "$ cd jrhp\n" +
            "$ ls\n" +
            "132784 tmlntm\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd thbznt\n" +
            "$ ls\n" +
            "190697 mdj.lll\n" +
            "270626 wcfpqqp.tcf\n" +
            "$ cd ..\n" +
            "$ cd vtqlszrs\n" +
            "$ ls\n" +
            "44292 dcgvw\n" +
            "$ cd ..\n" +
            "$ cd vzgpfd\n" +
            "$ ls\n" +
            "13921 hccgnjqh.cdl\n" +
            "dir jrhp\n" +
            "23850 jvq\n" +
            "113952 mfmps\n" +
            "dir ppdfjqbr\n" +
            "dir vdpvzhrs\n" +
            "190631 vzgpfd\n" +
            "128060 wclfwhv.chh\n" +
            "dir wghzqb\n" +
            "$ cd jrhp\n" +
            "$ ls\n" +
            "237755 bgbmnpq\n" +
            "19551 dcgvw\n" +
            "$ cd ..\n" +
            "$ cd ppdfjqbr\n" +
            "$ ls\n" +
            "1458 dcgvw\n" +
            "563 gldg.jrd\n" +
            "155487 glhjmpm.sjt\n" +
            "dir vthf\n" +
            "dir vzgpfd\n" +
            "81314 zgqjbf.scm\n" +
            "$ cd vthf\n" +
            "$ ls\n" +
            "205316 vzgpfd.qlg\n" +
            "$ cd ..\n" +
            "$ cd vzgpfd\n" +
            "$ ls\n" +
            "46597 mfmps.zsq\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd vdpvzhrs\n" +
            "$ ls\n" +
            "13302 vcwrr.jvb\n" +
            "$ cd ..\n" +
            "$ cd wghzqb\n" +
            "$ ls\n" +
            "dir grcj\n" +
            "dir hbngsg\n" +
            "112293 jzvh.pvf\n" +
            "282888 smrq.lvp\n" +
            "$ cd grcj\n" +
            "$ ls\n" +
            "258764 nscv.wvb\n" +
            "230478 qpqgf\n" +
            "$ cd ..\n" +
            "$ cd hbngsg\n" +
            "$ ls\n" +
            "101699 bzwnwz.tgj\n" +
            "144196 hwjrgtt.pdm\n" +
            "dir mthnljv\n" +
            "$ cd mthnljv\n" +
            "$ ls\n" +
            "1397 jrhp.rvp\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd pvfbjm\n" +
            "$ ls\n" +
            "251602 nscv.wvb\n" +
            "$ cd ..\n" +
            "$ cd rnl\n" +
            "$ ls\n" +
            "233954 dqlncnds.dfn\n" +
            "dir nswpmqdd\n" +
            "$ cd nswpmqdd\n" +
            "$ ls\n" +
            "261883 rtpbgm.gbf\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd wqgp\n" +
            "$ ls\n" +
            "23813 pdfcfc\n" +
            "$ cd ..\n" +
            "$ cd zgqjbf\n" +
            "$ ls\n" +
            "15126 bvlbrq.pdj\n" +
            "dir jnjqhzh\n" +
            "dir smrzsq\n" +
            "dir vzgpfd\n" +
            "$ cd jnjqhzh\n" +
            "$ ls\n" +
            "243919 htdqwdc.nsr\n" +
            "254015 ppclcr.rms\n" +
            "234928 zmjr.hnt\n" +
            "$ cd ..\n" +
            "$ cd smrzsq\n" +
            "$ ls\n" +
            "dir ljvbmm\n" +
            "$ cd ljvbmm\n" +
            "$ ls\n" +
            "235241 jmcbrbdl.ccr\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd vzgpfd\n" +
            "$ ls\n" +
            "dir bhwd\n" +
            "38855 dcgvw\n" +
            "dir hdcqm\n" +
            "dir swcvhtmp\n" +
            "dir zgqjbf\n" +
            "118104 zhtlsdb.ncw\n" +
            "$ cd bhwd\n" +
            "$ ls\n" +
            "122018 gldg.jrd\n" +
            "dir lmjr\n" +
            "dir mfmps\n" +
            "$ cd lmjr\n" +
            "$ ls\n" +
            "40588 dcgvw\n" +
            "$ cd ..\n" +
            "$ cd mfmps\n" +
            "$ ls\n" +
            "dir grcj\n" +
            "$ cd grcj\n" +
            "$ ls\n" +
            "165840 zwbvbfj\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd hdcqm\n" +
            "$ ls\n" +
            "156543 qfb.vhv\n" +
            "$ cd ..\n" +
            "$ cd swcvhtmp\n" +
            "$ ls\n" +
            "227964 rrfnsqw.rvh\n" +
            "$ cd ..\n" +
            "$ cd zgqjbf\n" +
            "$ ls\n" +
            "94269 mfmps.jsq\n" +
            "266360 rsgsrn\n" +
            "252761 zlz\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd zlv\n" +
            "$ ls\n" +
            "127388 nscv.wvb";

    record TreeNode(String name, TreeNode pre, List<TreeNode> children, List<String> contents) {}

    public static void main(String[] args) {

        String[] lines = input.split("\\R");
        TreeNode root = new TreeNode("/", null, new ArrayList<>(), new ArrayList<>());
        TreeNode currentDir = root;

        for (int i = 1; i < lines.length; i++) {
            String line = lines[i];
            if (line.startsWith("dir")) {
                String dirName = line.split("\\s")[1];
                currentDir.children.add(new TreeNode(dirName, currentDir, new ArrayList<>(), new ArrayList<>()));
            } else if (line.startsWith("$ cd")) {
                String arg = line.split("\\s")[2];
                if (arg.equals("..")) {
                    currentDir = currentDir.pre();
                } else {
                    currentDir = currentDir.children().stream()
                            .filter(d -> d.name().equals(arg))
                            .findFirst()
                            .get();
                }
            } else if (line.matches("\\d+.*")) {
                currentDir.contents.add(line);
            }
        }


        System.out.println(sumDirSizes(root));

        int unusedSpace = 70000000 - calcDirSize(root);
        int neededSpace = 30000000 - unusedSpace;
        System.out.println(getSizeOfSmallestDirBigEnough(root, neededSpace));
    }

    private static int sumDirSizes(TreeNode root) {

        int sum = 0;

        int size = calcDirSize(root);
        if (size <= 100000) {
            sum += size;
        }

        for (TreeNode child : root.children()) {
            sum += sumDirSizes(child);
        }

        return sum;
    }

    private static int getSizeOfSmallestDirBigEnough(TreeNode root, int requiredSpace) {
        int smallestSize = Integer.MAX_VALUE;

        int currentDirSize = calcDirSize(root);
        if (currentDirSize >= requiredSpace && currentDirSize < smallestSize) {
            smallestSize = currentDirSize;
        }

        for (TreeNode child : root.children()) {
            int size = getSizeOfSmallestDirBigEnough(child, requiredSpace);
            if (size >= requiredSpace && size < smallestSize) {
                smallestSize = size;
            }
        }

        return smallestSize;
    }

    private static int calcDirSize(TreeNode dir) {
        int dirSize = 0;

        for (String content : dir.contents) {
            dirSize += Integer.parseInt(content.split("\\s")[0]);
        }

        for (TreeNode child : dir.children()) {
            dirSize += calcDirSize(child);
        }

        return dirSize;
    }
}
