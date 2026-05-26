package kss.core;

/*
 * Korean Sentence Splitter
 * Split Korean text into sentences using heuristic algorithm.
 *
 * Copyright (C) 2021 Sang-ji Lee <tkdwl06@gmail.com>
 * Copyright (C) 2021 Hyun-woong Ko <kevin.woong@tunib.ai> and Sang-Kil Park <skpark1224@hyundai.com>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
import static kss.base.Base.doPushPopSymbol;
import static kss.base.Base.doTrimSentPushResults;
import static kss.base.Const.bracket;
import static kss.base.Const.bracketCloseToOpen;
import static kss.base.Const.bracketOpenToClose;
import static kss.base.Const.doubleQuotes;
import static kss.base.Const.doubleQuotesCloseToOpen;
import static kss.base.Const.doubleQuotesOpenToClose;
import static kss.base.Const.punctuation;
import static kss.base.Const.singleQuotes;
import static kss.base.Const.singleQuotesCloseToOpen;
import static kss.base.Const.singleQuotesOpenToClose;
import static kss.rule.Rule.commonValue;
import static kss.rule.Rule.postProcessingDa;
import static kss.rule.Rule.postProcessingHam;
import static kss.rule.Rule.postProcessingJyo;
import static kss.rule.Rule.postProcessingUm;
import static kss.rule.Rule.postProcessingYo;
import static kss.rule.Rule.table;
import static kss.util.IntToBool.intToBool;
import kss.base.BackupManager;
import kss.base.ChunkWithIndex;
import kss.base.SentenceIndex;
import kss.base.enumerate.Id;
import kss.base.enumerate.Stats;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Backend {

    public List<String> realignByQuote(String text, int lastQuotePos, String quoteType, boolean useHeuristic, boolean useQuotesBracketsProcessing, int maxRecoverStep, int maxRecoverLength, int recoverStep) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> lindexSplit(String text, List<Integer> indices) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Integer> findAll(String aStr, String sub) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> postProcessing(List<String> results, List<String> postProcessingList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    ArrayList<String> endPoint = setEndPoint();

    ArrayList<String> needToReplaceZwsp = setNeedToReplaceZwsp();

    private ArrayList<String> setEndPoint() {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(singleQuotes);
        list.addAll(doubleQuotes);
        list.addAll(bracket);
        list.addAll(punctuation);
        list.add(" ");
        list.add("");
        list.addAll(commonValue.keySet());
        return list;
    }

    private ArrayList<String> setNeedToReplaceZwsp() {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(singleQuotes);
        list.addAll(doubleQuotes);
        list.addAll(bracket);
        return list;
    }

    public ArrayList<String> splitSentences(String text, boolean useHeuristic, boolean useQuotesBracketsProcessing, int maxRecoverStep, int maxRecoverLength, int recoverStep, boolean useStrip) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ArrayList<SentenceIndex> splitSentencesIndex(String text, boolean useHeuristic, boolean useQuotesBracketsProcessing, int maxRecoverStep, int maxRecoverLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ArrayList<ChunkWithIndex> splitChunks(String text, int maxLength, boolean overlap, boolean useHeuristic, boolean useQuotesBracketsProcessing, int maxRecoverStep, int maxRecoverLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ChunkWithIndex getChunkWithIndex(List<SentenceIndex> span, String text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
