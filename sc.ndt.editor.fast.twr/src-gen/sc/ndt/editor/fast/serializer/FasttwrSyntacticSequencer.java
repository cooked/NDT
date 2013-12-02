package sc.ndt.editor.fast.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import sc.ndt.editor.fast.services.FasttwrGrammarAccess;

@SuppressWarnings("all")
public class FasttwrSyntacticSequencer extends AbstractSyntacticSequencer {

	protected FasttwrGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AdjFASt_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_AdjFASt_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_AdjFASt_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_AdjSSSt_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_AdjSSSt_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_AdjSSSt_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_AdjTwMa_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_AdjTwMa_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_AdjTwMa_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_ModelFasttwr___NEWLINETerminalRuleCall_40_1_or_SL_COMMENTTerminalRuleCall_40_2_or_WSTerminalRuleCall_40_0__a;
	protected AbstractElementAlias match_aTwrStat_SL_COMMENTTerminalRuleCall_21_q;
	protected AbstractElementAlias match_aTwrStat_SL_COMMENTTerminalRuleCall_44_q;
	protected AbstractElementAlias match_aTwrStat_SL_COMMENTTerminalRuleCall_46_21_q;
	protected AbstractElementAlias match_aTwrStat_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_aTwrStat_WSTerminalRuleCall_20_q;
	protected AbstractElementAlias match_aTwrStat_WSTerminalRuleCall_23_q;
	protected AbstractElementAlias match_aTwrStat_WSTerminalRuleCall_43_q;
	protected AbstractElementAlias match_aTwrStat_WSTerminalRuleCall_46_0_q;
	protected AbstractElementAlias match_aTwrStat_WSTerminalRuleCall_46_20_q;
	protected AbstractElementAlias match_bCalcTMode_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_bCalcTMode_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_bCalcTMode_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nFAStTunr1_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nFAStTunr1_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nFAStTunr1_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nFAStTunr2_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nFAStTunr2_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nFAStTunr2_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nNTwInpSt_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nNTwInpSt_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nNTwInpSt_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nSSStTunr1_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nSSStTunr1_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nSSStTunr1_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nSSStTunr2_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nSSStTunr2_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nSSStTunr2_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwFAM1Sh2_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwFAM1Sh2_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwFAM1Sh2_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwFAM1Sh3_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwFAM1Sh3_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwFAM1Sh3_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwFAM1Sh4_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwFAM1Sh4_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwFAM1Sh4_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwFAM1Sh5_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwFAM1Sh5_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwFAM1Sh5_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwFAM1Sh6_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwFAM1Sh6_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwFAM1Sh6_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwFAM2Sh2_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwFAM2Sh2_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwFAM2Sh2_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwFAM2Sh3_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwFAM2Sh3_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwFAM2Sh3_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwFAM2Sh4_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwFAM2Sh4_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwFAM2Sh4_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwFAM2Sh5_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwFAM2Sh5_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwFAM2Sh5_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwFAM2Sh6_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwFAM2Sh6_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwFAM2Sh6_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwSSM1Sh2_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwSSM1Sh2_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwSSM1Sh2_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwSSM1Sh3_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwSSM1Sh3_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwSSM1Sh3_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwSSM1Sh4_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwSSM1Sh4_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwSSM1Sh4_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwSSM1Sh5_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwSSM1Sh5_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwSSM1Sh5_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwSSM1Sh6_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwSSM1Sh6_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwSSM1Sh6_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwSSM2Sh2_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwSSM2Sh2_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwSSM2Sh2_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwSSM2Sh3_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwSSM2Sh3_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwSSM2Sh3_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwSSM2Sh4_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwSSM2Sh4_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwSSM2Sh4_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwSSM2Sh5_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwSSM2Sh5_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwSSM2Sh5_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwSSM2Sh6_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwSSM2Sh6_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwSSM2Sh6_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwrFADmp1_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwrFADmp1_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwrFADmp1_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwrFADmp2_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwrFADmp2_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwrFADmp2_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwrSSDmp1_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwrSSDmp1_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwrSSDmp1_WSTerminalRuleCall_4_q;
	protected AbstractElementAlias match_nTwrSSDmp2_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_nTwrSSDmp2_WSTerminalRuleCall_0_q;
	protected AbstractElementAlias match_nTwrSSDmp2_WSTerminalRuleCall_4_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (FasttwrGrammarAccess) access;
		match_AdjFASt_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getAdjFAStAccess().getSL_COMMENTTerminalRuleCall_5());
		match_AdjFASt_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getAdjFAStAccess().getWSTerminalRuleCall_0());
		match_AdjFASt_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getAdjFAStAccess().getWSTerminalRuleCall_4());
		match_AdjSSSt_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getAdjSSStAccess().getSL_COMMENTTerminalRuleCall_5());
		match_AdjSSSt_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getAdjSSStAccess().getWSTerminalRuleCall_0());
		match_AdjSSSt_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getAdjSSStAccess().getWSTerminalRuleCall_4());
		match_AdjTwMa_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getAdjTwMaAccess().getSL_COMMENTTerminalRuleCall_5());
		match_AdjTwMa_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getAdjTwMaAccess().getWSTerminalRuleCall_0());
		match_AdjTwMa_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getAdjTwMaAccess().getWSTerminalRuleCall_4());
		match_ModelFasttwr___NEWLINETerminalRuleCall_40_1_or_SL_COMMENTTerminalRuleCall_40_2_or_WSTerminalRuleCall_40_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getModelFasttwrAccess().getNEWLINETerminalRuleCall_40_1()), new TokenAlias(false, false, grammarAccess.getModelFasttwrAccess().getSL_COMMENTTerminalRuleCall_40_2()), new TokenAlias(false, false, grammarAccess.getModelFasttwrAccess().getWSTerminalRuleCall_40_0()));
		match_aTwrStat_SL_COMMENTTerminalRuleCall_21_q = new TokenAlias(false, true, grammarAccess.getATwrStatAccess().getSL_COMMENTTerminalRuleCall_21());
		match_aTwrStat_SL_COMMENTTerminalRuleCall_44_q = new TokenAlias(false, true, grammarAccess.getATwrStatAccess().getSL_COMMENTTerminalRuleCall_44());
		match_aTwrStat_SL_COMMENTTerminalRuleCall_46_21_q = new TokenAlias(false, true, grammarAccess.getATwrStatAccess().getSL_COMMENTTerminalRuleCall_46_21());
		match_aTwrStat_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_0());
		match_aTwrStat_WSTerminalRuleCall_20_q = new TokenAlias(false, true, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_20());
		match_aTwrStat_WSTerminalRuleCall_23_q = new TokenAlias(false, true, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_23());
		match_aTwrStat_WSTerminalRuleCall_43_q = new TokenAlias(false, true, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_43());
		match_aTwrStat_WSTerminalRuleCall_46_0_q = new TokenAlias(false, true, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_46_0());
		match_aTwrStat_WSTerminalRuleCall_46_20_q = new TokenAlias(false, true, grammarAccess.getATwrStatAccess().getWSTerminalRuleCall_46_20());
		match_bCalcTMode_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getBCalcTModeAccess().getSL_COMMENTTerminalRuleCall_5());
		match_bCalcTMode_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getBCalcTModeAccess().getWSTerminalRuleCall_0());
		match_bCalcTMode_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getBCalcTModeAccess().getWSTerminalRuleCall_4());
		match_nFAStTunr1_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNFAStTunr1Access().getSL_COMMENTTerminalRuleCall_5());
		match_nFAStTunr1_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNFAStTunr1Access().getWSTerminalRuleCall_0());
		match_nFAStTunr1_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNFAStTunr1Access().getWSTerminalRuleCall_4());
		match_nFAStTunr2_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNFAStTunr2Access().getSL_COMMENTTerminalRuleCall_5());
		match_nFAStTunr2_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNFAStTunr2Access().getWSTerminalRuleCall_0());
		match_nFAStTunr2_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNFAStTunr2Access().getWSTerminalRuleCall_4());
		match_nNTwInpSt_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNNTwInpStAccess().getSL_COMMENTTerminalRuleCall_5());
		match_nNTwInpSt_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNNTwInpStAccess().getWSTerminalRuleCall_0());
		match_nNTwInpSt_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNNTwInpStAccess().getWSTerminalRuleCall_4());
		match_nSSStTunr1_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNSSStTunr1Access().getSL_COMMENTTerminalRuleCall_5());
		match_nSSStTunr1_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNSSStTunr1Access().getWSTerminalRuleCall_0());
		match_nSSStTunr1_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNSSStTunr1Access().getWSTerminalRuleCall_4());
		match_nSSStTunr2_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNSSStTunr2Access().getSL_COMMENTTerminalRuleCall_5());
		match_nSSStTunr2_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNSSStTunr2Access().getWSTerminalRuleCall_0());
		match_nSSStTunr2_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNSSStTunr2Access().getWSTerminalRuleCall_4());
		match_nTwFAM1Sh2_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwFAM1Sh2Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwFAM1Sh2_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwFAM1Sh2Access().getWSTerminalRuleCall_0());
		match_nTwFAM1Sh2_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwFAM1Sh2Access().getWSTerminalRuleCall_4());
		match_nTwFAM1Sh3_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwFAM1Sh3Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwFAM1Sh3_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwFAM1Sh3Access().getWSTerminalRuleCall_0());
		match_nTwFAM1Sh3_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwFAM1Sh3Access().getWSTerminalRuleCall_4());
		match_nTwFAM1Sh4_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwFAM1Sh4Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwFAM1Sh4_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwFAM1Sh4Access().getWSTerminalRuleCall_0());
		match_nTwFAM1Sh4_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwFAM1Sh4Access().getWSTerminalRuleCall_4());
		match_nTwFAM1Sh5_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwFAM1Sh5Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwFAM1Sh5_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwFAM1Sh5Access().getWSTerminalRuleCall_0());
		match_nTwFAM1Sh5_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwFAM1Sh5Access().getWSTerminalRuleCall_4());
		match_nTwFAM1Sh6_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwFAM1Sh6Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwFAM1Sh6_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwFAM1Sh6Access().getWSTerminalRuleCall_0());
		match_nTwFAM1Sh6_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwFAM1Sh6Access().getWSTerminalRuleCall_4());
		match_nTwFAM2Sh2_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwFAM2Sh2Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwFAM2Sh2_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwFAM2Sh2Access().getWSTerminalRuleCall_0());
		match_nTwFAM2Sh2_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwFAM2Sh2Access().getWSTerminalRuleCall_4());
		match_nTwFAM2Sh3_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwFAM2Sh3Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwFAM2Sh3_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwFAM2Sh3Access().getWSTerminalRuleCall_0());
		match_nTwFAM2Sh3_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwFAM2Sh3Access().getWSTerminalRuleCall_4());
		match_nTwFAM2Sh4_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwFAM2Sh4Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwFAM2Sh4_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwFAM2Sh4Access().getWSTerminalRuleCall_0());
		match_nTwFAM2Sh4_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwFAM2Sh4Access().getWSTerminalRuleCall_4());
		match_nTwFAM2Sh5_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwFAM2Sh5Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwFAM2Sh5_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwFAM2Sh5Access().getWSTerminalRuleCall_0());
		match_nTwFAM2Sh5_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwFAM2Sh5Access().getWSTerminalRuleCall_4());
		match_nTwFAM2Sh6_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwFAM2Sh6Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwFAM2Sh6_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwFAM2Sh6Access().getWSTerminalRuleCall_0());
		match_nTwFAM2Sh6_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwFAM2Sh6Access().getWSTerminalRuleCall_4());
		match_nTwSSM1Sh2_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwSSM1Sh2Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwSSM1Sh2_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwSSM1Sh2Access().getWSTerminalRuleCall_0());
		match_nTwSSM1Sh2_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwSSM1Sh2Access().getWSTerminalRuleCall_4());
		match_nTwSSM1Sh3_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwSSM1Sh3Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwSSM1Sh3_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwSSM1Sh3Access().getWSTerminalRuleCall_0());
		match_nTwSSM1Sh3_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwSSM1Sh3Access().getWSTerminalRuleCall_4());
		match_nTwSSM1Sh4_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwSSM1Sh4Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwSSM1Sh4_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwSSM1Sh4Access().getWSTerminalRuleCall_0());
		match_nTwSSM1Sh4_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwSSM1Sh4Access().getWSTerminalRuleCall_4());
		match_nTwSSM1Sh5_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwSSM1Sh5Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwSSM1Sh5_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwSSM1Sh5Access().getWSTerminalRuleCall_0());
		match_nTwSSM1Sh5_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwSSM1Sh5Access().getWSTerminalRuleCall_4());
		match_nTwSSM1Sh6_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwSSM1Sh6Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwSSM1Sh6_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwSSM1Sh6Access().getWSTerminalRuleCall_0());
		match_nTwSSM1Sh6_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwSSM1Sh6Access().getWSTerminalRuleCall_4());
		match_nTwSSM2Sh2_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwSSM2Sh2Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwSSM2Sh2_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwSSM2Sh2Access().getWSTerminalRuleCall_0());
		match_nTwSSM2Sh2_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwSSM2Sh2Access().getWSTerminalRuleCall_4());
		match_nTwSSM2Sh3_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwSSM2Sh3Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwSSM2Sh3_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwSSM2Sh3Access().getWSTerminalRuleCall_0());
		match_nTwSSM2Sh3_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwSSM2Sh3Access().getWSTerminalRuleCall_4());
		match_nTwSSM2Sh4_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwSSM2Sh4Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwSSM2Sh4_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwSSM2Sh4Access().getWSTerminalRuleCall_0());
		match_nTwSSM2Sh4_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwSSM2Sh4Access().getWSTerminalRuleCall_4());
		match_nTwSSM2Sh5_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwSSM2Sh5Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwSSM2Sh5_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwSSM2Sh5Access().getWSTerminalRuleCall_0());
		match_nTwSSM2Sh5_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwSSM2Sh5Access().getWSTerminalRuleCall_4());
		match_nTwSSM2Sh6_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwSSM2Sh6Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwSSM2Sh6_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwSSM2Sh6Access().getWSTerminalRuleCall_0());
		match_nTwSSM2Sh6_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwSSM2Sh6Access().getWSTerminalRuleCall_4());
		match_nTwrFADmp1_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwrFADmp1Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwrFADmp1_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwrFADmp1Access().getWSTerminalRuleCall_0());
		match_nTwrFADmp1_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwrFADmp1Access().getWSTerminalRuleCall_4());
		match_nTwrFADmp2_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwrFADmp2Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwrFADmp2_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwrFADmp2Access().getWSTerminalRuleCall_0());
		match_nTwrFADmp2_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwrFADmp2Access().getWSTerminalRuleCall_4());
		match_nTwrSSDmp1_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwrSSDmp1Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwrSSDmp1_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwrSSDmp1Access().getWSTerminalRuleCall_0());
		match_nTwrSSDmp1_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwrSSDmp1Access().getWSTerminalRuleCall_4());
		match_nTwrSSDmp2_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getNTwrSSDmp2Access().getSL_COMMENTTerminalRuleCall_5());
		match_nTwrSSDmp2_WSTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getNTwrSSDmp2Access().getWSTerminalRuleCall_0());
		match_nTwrSSDmp2_WSTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getNTwrSSDmp2Access().getWSTerminalRuleCall_4());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getNEWLINERule())
			return getNEWLINEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSL_COMMENTRule())
			return getSL_COMMENTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal NEWLINE	: '\r'|'\n'|'\r\n';
	 */
	protected String getNEWLINEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\r";
	}
	
	/**
	 * terminal SL_COMMENT	: '-' !('0'..'9') !('\r'|'\n'|'\r\n')*;
	 */
	protected String getSL_COMMENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "-";
	}
	
	/**
	 * terminal WS			: (' '|'\t')+;
	 */
	protected String getWSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AdjFASt_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_AdjFASt_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AdjFASt_WSTerminalRuleCall_0_q.equals(syntax))
				emit_AdjFASt_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AdjFASt_WSTerminalRuleCall_4_q.equals(syntax))
				emit_AdjFASt_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AdjSSSt_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_AdjSSSt_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AdjSSSt_WSTerminalRuleCall_0_q.equals(syntax))
				emit_AdjSSSt_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AdjSSSt_WSTerminalRuleCall_4_q.equals(syntax))
				emit_AdjSSSt_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AdjTwMa_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_AdjTwMa_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AdjTwMa_WSTerminalRuleCall_0_q.equals(syntax))
				emit_AdjTwMa_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AdjTwMa_WSTerminalRuleCall_4_q.equals(syntax))
				emit_AdjTwMa_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ModelFasttwr___NEWLINETerminalRuleCall_40_1_or_SL_COMMENTTerminalRuleCall_40_2_or_WSTerminalRuleCall_40_0__a.equals(syntax))
				emit_ModelFasttwr___NEWLINETerminalRuleCall_40_1_or_SL_COMMENTTerminalRuleCall_40_2_or_WSTerminalRuleCall_40_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aTwrStat_SL_COMMENTTerminalRuleCall_21_q.equals(syntax))
				emit_aTwrStat_SL_COMMENTTerminalRuleCall_21_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aTwrStat_SL_COMMENTTerminalRuleCall_44_q.equals(syntax))
				emit_aTwrStat_SL_COMMENTTerminalRuleCall_44_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aTwrStat_SL_COMMENTTerminalRuleCall_46_21_q.equals(syntax))
				emit_aTwrStat_SL_COMMENTTerminalRuleCall_46_21_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aTwrStat_WSTerminalRuleCall_0_q.equals(syntax))
				emit_aTwrStat_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aTwrStat_WSTerminalRuleCall_20_q.equals(syntax))
				emit_aTwrStat_WSTerminalRuleCall_20_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aTwrStat_WSTerminalRuleCall_23_q.equals(syntax))
				emit_aTwrStat_WSTerminalRuleCall_23_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aTwrStat_WSTerminalRuleCall_43_q.equals(syntax))
				emit_aTwrStat_WSTerminalRuleCall_43_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aTwrStat_WSTerminalRuleCall_46_0_q.equals(syntax))
				emit_aTwrStat_WSTerminalRuleCall_46_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_aTwrStat_WSTerminalRuleCall_46_20_q.equals(syntax))
				emit_aTwrStat_WSTerminalRuleCall_46_20_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_bCalcTMode_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_bCalcTMode_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_bCalcTMode_WSTerminalRuleCall_0_q.equals(syntax))
				emit_bCalcTMode_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_bCalcTMode_WSTerminalRuleCall_4_q.equals(syntax))
				emit_bCalcTMode_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nFAStTunr1_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nFAStTunr1_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nFAStTunr1_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nFAStTunr1_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nFAStTunr1_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nFAStTunr1_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nFAStTunr2_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nFAStTunr2_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nFAStTunr2_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nFAStTunr2_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nFAStTunr2_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nFAStTunr2_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nNTwInpSt_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nNTwInpSt_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nNTwInpSt_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nNTwInpSt_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nNTwInpSt_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nNTwInpSt_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nSSStTunr1_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nSSStTunr1_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nSSStTunr1_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nSSStTunr1_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nSSStTunr1_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nSSStTunr1_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nSSStTunr2_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nSSStTunr2_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nSSStTunr2_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nSSStTunr2_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nSSStTunr2_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nSSStTunr2_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM1Sh2_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwFAM1Sh2_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM1Sh2_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwFAM1Sh2_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM1Sh2_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwFAM1Sh2_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM1Sh3_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwFAM1Sh3_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM1Sh3_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwFAM1Sh3_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM1Sh3_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwFAM1Sh3_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM1Sh4_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwFAM1Sh4_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM1Sh4_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwFAM1Sh4_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM1Sh4_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwFAM1Sh4_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM1Sh5_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwFAM1Sh5_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM1Sh5_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwFAM1Sh5_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM1Sh5_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwFAM1Sh5_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM1Sh6_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwFAM1Sh6_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM1Sh6_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwFAM1Sh6_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM1Sh6_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwFAM1Sh6_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM2Sh2_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwFAM2Sh2_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM2Sh2_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwFAM2Sh2_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM2Sh2_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwFAM2Sh2_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM2Sh3_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwFAM2Sh3_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM2Sh3_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwFAM2Sh3_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM2Sh3_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwFAM2Sh3_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM2Sh4_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwFAM2Sh4_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM2Sh4_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwFAM2Sh4_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM2Sh4_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwFAM2Sh4_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM2Sh5_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwFAM2Sh5_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM2Sh5_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwFAM2Sh5_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM2Sh5_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwFAM2Sh5_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM2Sh6_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwFAM2Sh6_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM2Sh6_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwFAM2Sh6_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwFAM2Sh6_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwFAM2Sh6_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM1Sh2_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwSSM1Sh2_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM1Sh2_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwSSM1Sh2_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM1Sh2_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwSSM1Sh2_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM1Sh3_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwSSM1Sh3_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM1Sh3_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwSSM1Sh3_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM1Sh3_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwSSM1Sh3_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM1Sh4_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwSSM1Sh4_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM1Sh4_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwSSM1Sh4_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM1Sh4_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwSSM1Sh4_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM1Sh5_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwSSM1Sh5_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM1Sh5_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwSSM1Sh5_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM1Sh5_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwSSM1Sh5_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM1Sh6_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwSSM1Sh6_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM1Sh6_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwSSM1Sh6_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM1Sh6_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwSSM1Sh6_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM2Sh2_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwSSM2Sh2_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM2Sh2_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwSSM2Sh2_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM2Sh2_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwSSM2Sh2_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM2Sh3_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwSSM2Sh3_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM2Sh3_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwSSM2Sh3_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM2Sh3_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwSSM2Sh3_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM2Sh4_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwSSM2Sh4_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM2Sh4_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwSSM2Sh4_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM2Sh4_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwSSM2Sh4_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM2Sh5_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwSSM2Sh5_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM2Sh5_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwSSM2Sh5_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM2Sh5_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwSSM2Sh5_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM2Sh6_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwSSM2Sh6_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM2Sh6_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwSSM2Sh6_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwSSM2Sh6_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwSSM2Sh6_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwrFADmp1_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwrFADmp1_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwrFADmp1_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwrFADmp1_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwrFADmp1_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwrFADmp1_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwrFADmp2_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwrFADmp2_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwrFADmp2_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwrFADmp2_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwrFADmp2_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwrFADmp2_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwrSSDmp1_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwrSSDmp1_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwrSSDmp1_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwrSSDmp1_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwrSSDmp1_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwrSSDmp1_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwrSSDmp2_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_nTwrSSDmp2_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwrSSDmp2_WSTerminalRuleCall_0_q.equals(syntax))
				emit_nTwrSSDmp2_WSTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_nTwrSSDmp2_WSTerminalRuleCall_4_q.equals(syntax))
				emit_nTwrSSDmp2_WSTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_AdjFASt_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_AdjFASt_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_AdjFASt_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_AdjSSSt_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_AdjSSSt_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_AdjSSSt_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_AdjTwMa_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_AdjTwMa_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_AdjTwMa_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (WS | NEWLINE | SL_COMMENT)*
	 */
	protected void emit_ModelFasttwr___NEWLINETerminalRuleCall_40_1_or_SL_COMMENTTerminalRuleCall_40_2_or_WSTerminalRuleCall_40_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_aTwrStat_SL_COMMENTTerminalRuleCall_21_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_aTwrStat_SL_COMMENTTerminalRuleCall_44_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_aTwrStat_SL_COMMENTTerminalRuleCall_46_21_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_aTwrStat_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_aTwrStat_WSTerminalRuleCall_20_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_aTwrStat_WSTerminalRuleCall_23_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_aTwrStat_WSTerminalRuleCall_43_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_aTwrStat_WSTerminalRuleCall_46_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_aTwrStat_WSTerminalRuleCall_46_20_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_bCalcTMode_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_bCalcTMode_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_bCalcTMode_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nFAStTunr1_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nFAStTunr1_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nFAStTunr1_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nFAStTunr2_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nFAStTunr2_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nFAStTunr2_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nNTwInpSt_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nNTwInpSt_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nNTwInpSt_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nSSStTunr1_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nSSStTunr1_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nSSStTunr1_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nSSStTunr2_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nSSStTunr2_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nSSStTunr2_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwFAM1Sh2_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwFAM1Sh2_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwFAM1Sh2_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwFAM1Sh3_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwFAM1Sh3_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwFAM1Sh3_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwFAM1Sh4_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwFAM1Sh4_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwFAM1Sh4_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwFAM1Sh5_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwFAM1Sh5_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwFAM1Sh5_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwFAM1Sh6_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwFAM1Sh6_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwFAM1Sh6_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwFAM2Sh2_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwFAM2Sh2_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwFAM2Sh2_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwFAM2Sh3_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwFAM2Sh3_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwFAM2Sh3_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwFAM2Sh4_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwFAM2Sh4_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwFAM2Sh4_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwFAM2Sh5_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwFAM2Sh5_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwFAM2Sh5_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwFAM2Sh6_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwFAM2Sh6_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwFAM2Sh6_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwSSM1Sh2_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwSSM1Sh2_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwSSM1Sh2_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwSSM1Sh3_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwSSM1Sh3_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwSSM1Sh3_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwSSM1Sh4_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwSSM1Sh4_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwSSM1Sh4_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwSSM1Sh5_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwSSM1Sh5_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwSSM1Sh5_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwSSM1Sh6_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwSSM1Sh6_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwSSM1Sh6_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwSSM2Sh2_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwSSM2Sh2_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwSSM2Sh2_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwSSM2Sh3_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwSSM2Sh3_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwSSM2Sh3_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwSSM2Sh4_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwSSM2Sh4_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwSSM2Sh4_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwSSM2Sh5_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwSSM2Sh5_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwSSM2Sh5_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwSSM2Sh6_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwSSM2Sh6_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwSSM2Sh6_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwrFADmp1_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwrFADmp1_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwrFADmp1_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwrFADmp2_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwrFADmp2_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwrFADmp2_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwrSSDmp1_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwrSSDmp1_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwrSSDmp1_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_nTwrSSDmp2_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwrSSDmp2_WSTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS?
	 */
	protected void emit_nTwrSSDmp2_WSTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
