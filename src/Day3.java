import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Day3 {

    private static String input = "wgqJtbJMqZVTwWPZZT\n" +
            "LHcTGHQhzrTzBsZFPHFZWFFs\n" +
            "RnLRClzGzRGLGLGCNRjTMjJfgmffSffMqNgp\n" +
            "WPLgsfLmLgqZvZgSRR\n" +
            "RbwHdbDdQFFFMvvMjbhqhZZS\n" +
            "lzTdldBDszfGcRsr\n" +
            "ZjnhJjMjnbdnbHdFLmmfFLmnCCWFFl\n" +
            "PpNwtRsNsZSsRwCfzQQBfQszCBsC\n" +
            "PpwcqqVZRtbggggjcgJJ\n" +
            "ntczBcVcgnHzgBHnVntcBBFhgsmmmssqWNWNWqLvNhsqTN\n" +
            "bSSGdSDZbGSGdDmLmGTvTGmLFFhm\n" +
            "PlFbDpJDPbPdPbZQZDZlSCDBfMVRwBzBtBQzfzRHVMVRtH\n" +
            "fDVrmmrvcmCcVpfcfGlswpPwsttMpjJMPPjjtP\n" +
            "RgSTdndFLbJqqPssWWjPWjPjHS\n" +
            "FqgzQnTqJRRQqLLhTCDhDCDmcmlvvlhcVm\n" +
            "nnqVtHbfVHZVmtlvmHtZtrFSFTRRFhRccTbrLsLSGr\n" +
            "cCNJQJPJQgjjMQdDrGGsRhTFGFRFSpMS\n" +
            "gzdCwWdjNPgzcJgjwdZtVlHHmvvmZlvffHnz\n" +
            "FFgsgwNwWvggQsMWDwvQQvQcccdcJZDtJGBtVGGGtcVlzt\n" +
            "rjfTrbjpjRSRTbTpzldjjHBtJGBdltJG\n" +
            "RbrPTfpCfmbpmnfRRCvMvQWNBwFFgMsgBL\n" +
            "zzLHgjjjdFHWbGBjjzcbgQRmSvqsSpmRsRSQSmRMWv\n" +
            "ZfJVrwPhZhZlhQQqBSQSNSqM\n" +
            "tnCfrDCltfPzHFFLBgngHz\n" +
            "DCpwrrMhwCrCMVCpGFqpVDnWWTWBtnTWvWfvbbTdFWRv\n" +
            "lmhhcsQPmTtTnnPBTB\n" +
            "QmcjNJsJzHNljZsNqDCGGhwqCqhgDDZV\n" +
            "hLfRnSLfhcndCCPfJJjzJfzt\n" +
            "pHNWwDpGGNJBZjjNNj\n" +
            "gmgwwHpWTpmGDmDTggqHmmDSsnnhvcqScdVVSVcjLrRcnq\n" +
            "CdlTJgnQJVCllNVWTPZBmPPGhGRmghPRGs\n" +
            "wHDrSwtHbmhRvHVZ\n" +
            "DzzwrtVFjLNnMTCTLCWW\n" +
            "SppdsnGpNVnZZZLPMlMPGq\n" +
            "mdcfvTTbBddLJgZJLlcFqJ\n" +
            "fzTvfwjjfzzCbvvjvQjWvNHVNNVWrRtdnVNppNprDp\n" +
            "lmlCGTmNbZlbSFlbNGfnzWfWzCdWWfVdwRCf\n" +
            "jDHtHHvLjQtqrsqpjBBLprRzwfwJfzzhRnczhWQVwzVR\n" +
            "rqpPtpPjDqpqDLtLrPGGFSFgPlNZZSGMPnMZ\n" +
            "pSHShqgSMzVpphFnJMFMBtssdjRJ\n" +
            "PZDbZfmCDgDfDNQPwCflCQNJsjRBRBFsdBWBsJRjsbsFJF\n" +
            "DQvCwwZrPPlffDmQCDwZQPmPhqVTcGhSHSLTpSGhLHzpGghr\n" +
            "gPqgqqmmmPgsqvGmsMCCnfZZfvBpWZhVrrZdHBvH\n" +
            "TSlcttTjRTDlDDTRhZVdrHHpWVnfVrtd\n" +
            "SFJzFzcJjcRJwGGqJMMCwW\n" +
            "gzWNLSjRLzlNqqQMLhvQccGGmcQm\n" +
            "fFrttPdTFTrpVwGpbdVQQp\n" +
            "HnTBGfHTGzWWqCqngn\n" +
            "SddrLdVpjjVSgRBszFswzwlV\n" +
            "mtPMbMqPMvqHHHDTTglBvsFshFFg\n" +
            "bmBHbtPctMtbMNMtbPtPqHmMjpdZdcJGrjSWWZGjJZnjndWj\n" +
            "nljWJHRHGrDcMBbDLZHV\n" +
            "wdvwmhghhbtBMcLtwZ\n" +
            "gvQvvghTfPSmpmQljGFRjQbFGCsJbC\n" +
            "BmphBWmDBBQfpVgQZpjg\n" +
            "rqqGrrrqlnqqHqjNnVDSSSgQQffj\n" +
            "FqLrbsLFsbLbLqHlMrmwwPDcCmMMmJBwDJcC\n" +
            "wZccfslqZPFFjrFbFfQQ\n" +
            "vvTvVWCJJZVBWCSvnVJJrhjQVMjVjzbgMQbjpphh\n" +
            "BBmNWBvZRvSqwsGwssPcmc\n" +
            "LGpnfcnzfzQdNFNHqHJptq\n" +
            "RBNNvZSBRbRCCDJqHrDZqHFZtw\n" +
            "SRNhRsNhWSNWsRRvgjngQnnMTnTgQjGMff\n" +
            "twtZmwqBHtmqnnmlGLfcfvQQ\n" +
            "dgMSPSMdQGclRRdF\n" +
            "pVMrDgThDDlPWPWbBZtZqqttBqjqjT\n" +
            "PPSWCGSzpCCQwNsNPFhTNVbB\n" +
            "vqcgJngqLLcZLvBhNTVlbsvdFF\n" +
            "DDmHgRjHZhHtGfWpQH\n" +
            "sBLbwWWBvsBsqLqStRjcGGRnggjGcntJDn\n" +
            "NCMQPMQPMQNzGGRRgRJRGzcG\n" +
            "dHQNfPCFTQfFfVVNvwwJvSWSqWqrSqdS\n" +
            "prDBnnDpFDprnDPBDQBvpBZttcSqSZSZcScFJSHcZJtz\n" +
            "VhMVdLsjdqVWJSWZZZcHst\n" +
            "hLVdGLfqjGjlfhCfCLjTTmrlpQBPBmvnrgDgpp\n" +
            "SSSTJmmgbGwtmRZHCCZRCH\n" +
            "FWcPQrrWqflzSWpRHZCZHRSt\n" +
            "PSQzzdcQTghdndDJ\n" +
            "cLlrNPvljRhRgTlM\n" +
            "VmDBGnVdmJDnDBndnnVwDRvMgRsTbTzMMsgZghzzsB\n" +
            "SpHvmGnSDJnwvDQqfrCPLpPLCfpF\n" +
            "PppbRCCgpzzQCgCSgZTlNNTWnNNDNlRnGl\n" +
            "hwMhLtBcBdjjNzWzlclcNGTs\n" +
            "FjJFHJwhfwLHMLJLwPmqfQPgVCmQgCmCzC\n" +
            "jTtMqFjMBqBmTntTztBTnTZBRZRLpLJgDgJNhghJrNNhhLJh\n" +
            "DCDdvdGsVDVsflVdQSsfSwhRJlgppgpRpbWLgJbJpgbR\n" +
            "wfSHSsdSVvQSwfwQPQPqHtFDcMzmtjBntqMTqn\n" +
            "HQhQWLCSHCSCjnjQdSJdCSQgTTmZPTVZmqnTpPtnpmRmpp\n" +
            "vDrzhvGzfchvlGvMFMrqVqPgZVVtZtVRgZgm\n" +
            "bcvMfwvDsDfbvfwDbbdhCShWCBLLJWjHsHjj\n" +
            "zLSsJNCjsjLCNLCgGcwBPPdwBwqwqz\n" +
            "WMFZprZDbrddWRVRRDvlPPBcPhhlBqqHPGPhhffg\n" +
            "VdbFvZWWWZZDFTLtCmNntjTnLSnn\n" +
            "JLVhhwRbhVwcLFJFhhJcccqwsvpRlllvpWvZSBSSSRsNWpzl\n" +
            "jgzfPffgZNspgZQS\n" +
            "fjCmDCGnfmTfFqrFnhqbFzqt\n" +
            "SfMRRNHSNNLfRfHcRRsqwdCCsssTqBCvgBLv\n" +
            "llDDWQnFGtQnmtGQDWQFsgdHVBddndHsgqTsCTsg\n" +
            "GzGjpWmWbmQmbpGGmGjHSrZcMfZSRPJPfcMRcb\n" +
            "PDdMdRTRrLDSwzJvfSvJ\n" +
            "FnjQnsqsFTnStvplhhzzFS\n" +
            "TBHHCsgVRRcMHbLR\n" +
            "GcLdGBJvBvLJHccJBvqHpGzDFfzwfzjwhDwrSFpfpDSn\n" +
            "mZZrTTQVmQmlsMPVblZQVZmfCwjzzjChzCCbDSzhFjfnSb\n" +
            "gZlRlZNPlmlgTTPmNRvJWcqrNLdvHWLBcHtH\n" +
            "jWWbBwgwWwwtvvSCtHvgWsMFmscHzTGMmcssGFTTGz\n" +
            "ZrLtpLnlfQJqnfJtpLnZlrqdNNGqcDNNFFTNDzzMMTMsMNMs\n" +
            "LJQrnZnfLZnlrZflJJRVRQbbwBgCtCVjWgjBjjgbPjBB\n" +
            "fqQVfRqSqmpnlLnm\n" +
            "jFcjMJTjhwwggjFtgzCHmCzCmGzGlzpn\n" +
            "wstMFFjWDfQRvmDPSB\n" +
            "PgTFGPgcBZPcHPFBZRjGPgwCnmwCsmSdQdThmMMMQCQS\n" +
            "JbpvWtvfHblWDHJDzmndSdMQnSwCdhMdQD\n" +
            "rfvWlLlbtfJvvLJpqWbbqZRRGPVFNHVFgZNVFBgH\n" +
            "TRMrrGBLMLPtbssTGtBHwZmdQQbdNzzZZNZZdwjd\n" +
            "CVlVhCnclvhWSFFfQrWNrjmpNfwmjZ\n" +
            "rlqFlclChhCvnlDvgVvRRtPtqTGJHRMBRTPPqM\n" +
            "gZzCrQGQdrQvZHPTHWDbTgWPJM\n" +
            "nSpLlcnnVjsSVLLnLSnhLSsJPTTWFsqfbPMFMqJDbfqM\n" +
            "VwwnpwLnlPdQCwPPCC\n" +
            "lRlrnlrsrMlhVsRnVhGPvCFNcPBDBvccrCGr\n" +
            "RZQTzWTRdDNvBDdNcC\n" +
            "TqjZbWRHmlMJgnmsng\n" +
            "scQmLfQBQQvvZfLsmmvDJwpgSNSDDdcJSSwTGD\n" +
            "PHlMbtzCCnlbztMRzlPNNdNwGpDpwgwptNLGpw\n" +
            "rRHnLbhCzbbCHnHjMbzzjzFZmfQqWZQqvmhmfVZmqFBW\n" +
            "fLTQWTMQtjcCGCJCbf\n" +
            "gGsmsVSzmjCFHJCJgg\n" +
            "SPRsSwSvBsPRPsqzwSVqzmhVWtLWhTDNLlTDtLTWGpNMtDLt\n" +
            "mbzRbchRRQzzssLdhLggLddJ\n" +
            "DCqDNNNWvDvjcPLsJcLLdv\n" +
            "cpFCVNnVBHtbfFRtMRFf\n" +
            "PFRcCCPtsDDDtjVspgwmgTNpTgTpspsw\n" +
            "BqqqdJdHdMgSfMmZpZND\n" +
            "vDHJGdLbLzBJdGnDdrBqVtCzWPPhthtPFzzPCFtV\n" +
            "HvhvHdFdvJDfHdZdpfhrmGPljPRrGPPVDGrWWC\n" +
            "NMMsRBMzcRRMMBSzcnbmNGrCVCWrCqPClmPqlG\n" +
            "zLBbwMzQnRSQMThtZFLvpdgHtJfF\n" +
            "DpcJcJPmMcLSHHZCfpnH\n" +
            "BsBFvvqTFlbhgdbBBblfZLCLzfHWfjnjLCnCrh\n" +
            "dTsNgqFvNgsGlZJRtVtMPmtDmG\n" +
            "LdGQqzPGCCjJTJdTLJQJtFcFRSctcrFNFltPFtcc\n" +
            "HphMMbbMdBMHbBhhgHMnhvwFFvtrlSNRNgcRllcvcc\n" +
            "spHMhBnHnnsmWdnsnMBMdVGGmzjzLmZLDQCCCCZjqjTD\n" +
            "DDZMzcTRgDMLzqCffhfWfcWnfj\n" +
            "NsHVVJmswwSSwNPPNjnhqhnCCnhNvjfTnv\n" +
            "rSSddrGSGrlMrpTpQT\n" +
            "bbbfCfrLHMMMWVWC\n" +
            "SqsvNZqQvvqcjNvqZsMMwgFgFplTHQVRFgWH\n" +
            "BSZWWqBZBjmPGJGLbBtf\n" +
            "RNCNfzfRHmzHwSdRdGfzRJPqFcFcDFGccZZqtLtGLtgl\n" +
            "pjhVMhvhbjvPcDJvcZqt\n" +
            "bsQMTsjppmSdTnHSJH\n" +
            "PtLwpSwdSJwQnGvvqtvMhZ\n" +
            "TlFcHlTjVjsDTQnCQhbZGCVVnb\n" +
            "cjljTslTrlzzHDNRfNgLSNBJfBwNfG\n" +
            "HvsZZqqqwWZswWHTmHsvvfhSfBfDffjchfBbhD\n" +
            "MCpnCVpQClRNnlNQVQClfDhScmjBfLhmLDGbBNbS\n" +
            "gmtpJpQQllJnWdZWwJWFwJJT\n" +
            "TzBvBwwdhgRPGHlRHh\n" +
            "NLWttJsrLWttppLpsGlsmVbVGRljGDRgjV\n" +
            "MlllnNFnnQqCdzqq\n" +
            "vptzrJhMMGGMptJPhJGJPvdFTFcSsTBVsczBScTSFFfn\n" +
            "gbRjWgRjCqjZnfHCHnTSVBHF\n" +
            "mRwqNbmqlbbjqRNlLbNrDJntNDGtDhNpGMrpvJ\n" +
            "GPWZLgWqLHHGbgbbGPPmqHqfcjjRHJJBDRBRjBBjMHjwvwQc\n" +
            "dhpFSpzVSSMSlDBvMQ\n" +
            "TndsVNztVTspnsdpshtmZLPCGGNPfgqbWWfDGb\n" +
            "CbqDjjCdClqgrfJvrv\n" +
            "NGNPtGGzzHztPWWnlgJvfBnWBFgp\n" +
            "hGzNHhsmGccwHPHZHcwdCCdbTVRTvSmTCjbLCb\n" +
            "sqnqsHGpJbqnrbshpshHmmmCWZZmWwfTjTjHmfLZ\n" +
            "dPggRgSDDttMFgctgdDtDcDcRWJBmjTWwmRLBLfmwBBjZWTB\n" +
            "PFcVPlJPglbqhhrnnlNz\n" +
            "wZdDNDdPPfhqwWqbsF\n" +
            "VTngRzpnzMLvzTCLlhvDfltqqDttqFqs\n" +
            "mggTVpCDDSNjBmPZrd\n" +
            "cSdqJSTTTJcSJpCdQbqTCPPdjdDtGzwzjDwjwwwwzD\n" +
            "rVvsBBVgsVBhHhfljtgbPgGtWjPtwt\n" +
            "fvHsVZHVnRHpSJJRmbbSLT\n" +
            "lDDPRRjwLGlvVRDRPlwwwPvmpSfhVWSzhqfzqpHpVpVHfqSH\n" +
            "qBnqBNsBBChhCSfZ\n" +
            "nTQbQnNNQJTLvlmTPLqqmG\n" +
            "TTCJhDrmDpRVhvhHfffwzwfz\n" +
            "dmmdmglWcqvHvWsHzB\n" +
            "gdQMZbtlgQlZcMSttCNmVVrLSTTJ\n" +
            "PLZLqhZZzZLBjjjGrrPjMH\n" +
            "CcQcCcfRlWDjdrMrBrHC\n" +
            "WlWFMcFpcRFmsWFcmflqSJzTqzwLvshggsZJwz\n" +
            "LgqRDDDHHGTpgpJrQrQhhhCqrwPw\n" +
            "ZSBWjjFshCFlQDrJ\n" +
            "SjWnnbWtWnsztgGDDbDTGgHHGp\n" +
            "llfvMlvzjzGzGRfvMSGRfSdStrCtQNCZrrFdJJLnNtLZ\n" +
            "shhhshPHsTTqsBHTVTwTwZZnCtQrQnJtQCCJBCCZdZ\n" +
            "TPHTPTHmDnljplfpGfGm\n" +
            "qcNTmvvSvTNrWhRrTdthzW\n" +
            "bDVJphpMMJwJpMHtrrttWsgwtzRW\n" +
            "bFpGJbllPfplVQmnhvvcSmCFqq\n" +
            "GTPJGMQTPQMqZjHTBmnndBVddHrrzNrz\n" +
            "bbcRFgDpptRbffwmzmrvLmcZvmLmLv\n" +
            "WCwgWbpgwtgfpfMlQGPhSPZWTZPl\n" +
            "DsPCswsMPBMwPDCVJPnTPPWFGJNJmbJW\n" +
            "RvvddfvftdtvNzghGSbFnWTntJSttGbG\n" +
            "LNgRddgRlgzcgCDjjjHjcBCwcM\n" +
            "gnVtgBnpwBgShBgcwhJJhjCMMMDmLRjDRMjrDMMMDMqMRF\n" +
            "slsblHPNHlbTNbsPvszHQWbzqrZLMRmFMFmdFmrtDFdMLNZD\n" +
            "bPzfvbfsvvlHtlzPHllHGTlTppCJpgcngcpwnwCGGJnnShwV\n" +
            "cgQRgtzDbHPcgHzQWpTjTLdjjNNpNLsDss\n" +
            "nwccZBmwcJqmJnjsTvmlTSsdlTNs\n" +
            "CCGFCBVrBwwGBhqVnZBrqWMMQzHfQcHzzzPtfztGfg\n" +
            "lhnwnhlbgbngbcfDgJLJQqDdVd\n" +
            "FSrvtMFZVJJJVtcq\n" +
            "jZNNNNjmjSPjFTJmGGzswwzHwHpBsbPblhhW\n" +
            "tnDWHntzDtzQBZLMLzNLDDcRFFjhJBmcFRCTjRchcRvT\n" +
            "sqwsPlbGfSbPGSVbJfpjjhcTFmCRjjvmTTvRdw\n" +
            "lJqSqPVbgGSGrVSqJqflbWZQNDMLHnrQQWNDMtQMQz\n" +
            "lpltwwJqsWVLPtVt\n" +
            "DGHsDdZQzHLSLZcFRrFS\n" +
            "BGsGCnHmMlMwCfwT\n" +
            "nrRNzRMPrrPnNwNzTSFSTNtqZdtMttvQqQmjdjvZpgjZ\n" +
            "GWVhGcGhHhGcffbZGDmmtttQvpdtbpppdj\n" +
            "HGlHBhHGJfJJhCfZzLTTNnNrTnCNwT\n" +
            "jBpCZStjBwWrQCMrhw\n" +
            "TvcHBzHdPPzdvFTzzJlvzdQfThrhhrhfQTWMQfWMqfwf\n" +
            "bzGJJBJcJvdvBPFzddGgjZSbZZngRZNNnnsjRs\n" +
            "dqPqbpPFJfsFfMcNQNNtNmzrNQJn\n" +
            "VVBDWvwZWDLwGlDhLGWWVcmQtSNmLmtSdSSTmrcQQm\n" +
            "lZlhwDCdhhHllvWvjMHbgMpgffMggpPb\n" +
            "SWSFLLFWDSWDNFzmmLMfGlfsdfnJMBfwMGVnBf\n" +
            "vPtgZcctcTQQZRRcgCtZwRfqBVGqnVTBGVnqlsdBJnqV\n" +
            "RcjgwbbgNSbFbhDb\n" +
            "JrRZLrHvjQFPLnnBPQ\n" +
            "DhwbtHbzpcpFTgtQ\n" +
            "zlDwlHlzWSwDqhMMbSJVZVvrCrCZJZNZdJ\n" +
            "fgNCZSDtDfDZTrTfqWghQGzGQshgpGGFQg\n" +
            "RFvLnvFjnVjmLQGPQWLmWh\n" +
            "MdwwVMFbMdRHFbccbCZJtbDJrqqJZNJZCZ\n" +
            "fdZVBMMdfdfBCzhTzMdMCgCrGGrpQJmSmGJGmpJQVpLmqV\n" +
            "RbFnhNsvlDsFHttllGmqGpPLvJpmPJSqLL\n" +
            "tjNsDnNwbNjttNNZTzhMWzcZcMTwMd\n" +
            "DjSSMShjRjPCbDFCdCSDbpBBswfNWZBZZrBVBPNfVmVf\n" +
            "zltLjLqqGlzQntqqGztqcgncZrVrmNfNwWBVrVmrgwrfswsW\n" +
            "qcTqHLlnJzGznLJtHGhMbhjFhMMpFbpbThpp\n" +
            "ZVFZcctFQzsCtbZFnPPHqmqpwmvPmp\n" +
            "NrjGfMgcLLcfdLqpmRwRRqJJmdPw\n" +
            "LMNDgMBGlgGDLMNDGljctVbVWZTTCWChhTttsl\n" +
            "RMGRRhhgzgZMtHdGTtvDwDJFCDvvwdvwqFFv\n" +
            "rfrrjLNmmSnSjVSmNNPPbJVbqvqsqvhvFqCq\n" +
            "flrpnSlrSNfjrNjSphNSWlHRGzTgtQGHQtttBTRBRQHW\n" +
            "tplDDprhbvprvrJDprCpbsvHRfzSzTtzmRqSTznRRBRnSfFF\n" +
            "MVwWjVNVQGfcMnTmRnBm\n" +
            "VQwGLNLjWNWPGjZbsDBppBZhhDvBlZ\n" +
            "RVVrGVVchRZsnzRzBWZb\n" +
            "FQHWWCHwQmWmlqfCHSwJnsbNJnNsvttntBtb\n" +
            "QQSFgqgqLMLPPdWdMVhWDT\n" +
            "cZrMjncTdfJpPJbr\n" +
            "WHNqnQwwCwvlqHtCtHNslNlvLLPDfSVdVPVDVSfVSbftffVf\n" +
            "NCwwwQwllwnvgsvZzgzFZzBzjGGGMM\n" +
            "MvHpfzcTcZzpphhbsDSTStsltqSDtS\n" +
            "PRmnwCrWnWQrmNMRNnlNGbqlbDltdlbDtNtD\n" +
            "CRJnmRVWJfgMLvcz\n" +
            "HPFbHrrwLdVdgbDZqcphCqSZBhLZ\n" +
            "tQRfRRGtvTNNSGTMjjmDCRhmqpBChqhsRDZh\n" +
            "vjSfMzGQNQQnMtNTTWNNjgblFdFHwgdJJHHPwddgnr\n" +
            "BggPRVBPPgfCBmJTjTTqpTNpZBwMbr\n" +
            "lclLLllsQLFlsbMqNrMwTpwpcM\n" +
            "SvbDzSDbWFJfWPPgdnfR\n" +
            "GbpSSbGDNbSSJbDZNZbDppGtMntHLHvHCTLCJMHnRCMLTT\n" +
            "cdwddjBfPsmPPQqQqscnHgRMtngvtjjgCCTMzM\n" +
            "WvwPvWvflBwdQPlNVVhbDGpFhNGhbl\n" +
            "WZRGmRvpCRFTZMQQQMCdddDDcD\n" +
            "lqgqsgvjVtbMDzzbtcDQ\n" +
            "NsNNgjNNjsNhnSvRmnpGRmSTSG\n" +
            "nTgFtDTDDLrFBStdGdcHcbvGSc\n" +
            "QPzfPCMzWCjfMPJhWGlRbRWRWrRRdVVH\n" +
            "zhCrCQCjPrpNNBsNspNnwq\n" +
            "zTJpqFzbTzsWsVbbfLGfSSCDNSBCHfMLHG\n" +
            "rZcvtmhctrvmlPPmmmrhhmBLCHDCCLLDlqMlGMNDMwDC\n" +
            "rRhRhnnQPZhtZcZtdttZgqFWWVjssqQpppWpFpJW\n" +
            "NWPhdWJPWVzVqQrqmSsPbrPP\n" +
            "cZDRjGsffGsCDfffgjGgRQSrTcTmSlTrbnqmSSrlln\n" +
            "fFGCjGCjLDLFRgfDHZvzLVWtvsWWBtzJNWMB\n" +
            "qMVbtnmMMTpCppsR\n" +
            "NffHGrWzWWgDBfTRhChCnSCWcnjT\n" +
            "QrlQBPBrlPHrrQlrHFLqPnLvVvbVmVVJtq\n" +
            "MVMpHMZLVCpMrfWjvWnfrJ\n" +
            "hlblzDDzwlSlGtRhRlSdrfGGWnWWfFPjJjnfqWGF\n" +
            "lmlhBRlDhhhDRRhwDmBpHJmsNCHmCgNHJCJLsc\n" +
            "jvsLgmqLgHvbPPVbNjSCjC\n" +
            "pwTcRpRWLRMLJJFwBBGWcFWNVlDDCSTVttNPblZZCVVDlP\n" +
            "GcdhccpcpRpGRhGmfsHHzLQQHrmsnh\n" +
            "FMmSRgtMltMnVgnmNvlrsJrsZWjspvsZJp\n" +
            "QbdhqwqbNqdHbTdcbcpsrpvjfWfLJLfwJrWp\n" +
            "DQBBQqQGccdTPGqqBNtFGRSMRSFGtnVSnnmM\n" +
            "fPjGrfFrrprprdrbQPZwlcZwZmlJwH\n" +
            "qvNnvWnvWDvSvqNtWSLWStqbcJBQwQJwQZHLBZbcmJbblb\n" +
            "DMtvqSvvDtntCRfwzGCgdzzFjG\n" +
            "TfdZgtmfDgqgvlLFFsFHvcvZ\n" +
            "pphWQMVjQVVBWWjRlHlHnlcLDDhcnF\n" +
            "JQwwWVPBwMJpJwpWwGBWNzrDzSSzfgTPqTSTTtSPgt";

    public static void main(String[] args) {

        String[] rucksacks = input.split("\\R");
        int sum = 0;

        for (String rucksack : rucksacks) {
            int middle = rucksack.length() / 2;
            String part1 = rucksack.substring(0, middle);
            String part2 = rucksack.substring(middle);
            List<String> part1Items = new ArrayList<>(List.of(part1.split("")));
            List<String> part2Items = List.of(part2.split(""));
            part1Items.retainAll(part2Items);
            char commonItem = part1Items.get(0).charAt(0);
            sum += getScoreForChar(commonItem);
        }

        System.out.println(sum);
        
        int sum2 = 0;

        for (int i = 0; i < rucksacks.length; i+=3) {
            List<String> elf1Items = new ArrayList<>(List.of(rucksacks[i].split("")));
            List<String> elf2Items = List.of(rucksacks[i+1].split(""));
            List<String> elf3Items = List.of(rucksacks[i+2].split(""));
            elf1Items.retainAll(elf2Items);
            elf1Items.retainAll(elf3Items);
            int score = getScoreForChar(elf1Items.get(0).charAt(0));
            sum2 += score;
        }

        System.out.println(sum2);
    }

    private static int getScoreForChar(char c) {
        if (Character.isUpperCase(c)) {
            return c - 'A' + 1 + 26;
        }

        return c - 'a' + 1;
    }
}
