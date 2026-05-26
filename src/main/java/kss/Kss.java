package kss;

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
import kss.base.ChunkWithIndex;
import java.util.ArrayList;
import kss.core.Backend;

public class Kss {

    private final Backend kss;

    public Kss() {
        this.kss = new Backend();
    }

    public ArrayList<String> splitSentences(String text, boolean useHeuristic, boolean useQuotesBracketProcessing, int maxRecoverStep, int maxRecoverLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ArrayList<String> splitSentences(String text, boolean useHeuristic, boolean useQuotesBracketProcessing, int maxRecoverStep) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ArrayList<String> splitSentences(String text, boolean useHeuristic, boolean useQuotesBracketProcessing) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ArrayList<String> splitSentences(String text, boolean useHeuristic) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ArrayList<String> splitSentences(String text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ArrayList<ChunkWithIndex> splitChunks(String text, int maxLength, boolean overlap, boolean useHeuristic, boolean useQuotesBracketsProcessing, int maxRecoverStep, int maxRecoverLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ArrayList<ChunkWithIndex> splitChunks(String text, int maxLength, boolean overlap, boolean useHeuristic, boolean useQuotesBracketsProcessing, int maxRecoverStep) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ArrayList<ChunkWithIndex> splitChunks(String text, int maxLength, boolean overlap, boolean useHeuristic, boolean useQuotesBracketsProcessing) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ArrayList<ChunkWithIndex> splitChunks(String text, int maxLength, boolean overlap, boolean useHeuristic) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ArrayList<ChunkWithIndex> splitChunks(String text, int maxLength, boolean overlap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ArrayList<ChunkWithIndex> splitChunks(String text, int maxLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
