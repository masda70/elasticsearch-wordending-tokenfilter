/*
 *
 */

package biz.ixxi.analysis.wordending;

import org.elasticsearch.index.analysis.AnalysisModule;
import org.elasticsearch.plugins.Plugin;
/**
*
*/
public class WordEndingPlugin extends Plugin {

    @Override
    public String name() {
        return "wordending";
    }

    @Override
    public String description() {
        return "Add a delimiter at the end of each word, to ease build of autocompletion.";
    }

    public void onModule(AnalysisModule module) {
        module.addProcessor(new WordEndingBinderProcessor());
    }
}