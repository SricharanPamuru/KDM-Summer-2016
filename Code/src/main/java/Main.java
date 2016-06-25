import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.List;
import java.util.Properties;


/**
 * Created by Sricharan on 24-Jun-16.
 */
public class Main {
    public static void main(String args[]) {
        // creates a StanfordCoreNLP object, with POS tagging, lemmatization, NER, parsing, and coreference resolution
        Properties props = new Properties();
        props.setProperty("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref");
        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);

// read some text in the text variable
        //String text = "CHICAGO(AP) - Citing high fuel prices, United Airlines said Friday it has increased fares by $6 per round trip on flights to some cities also served by lower-cost carriers. American Airlines, a unit AMR, immediately matched the move, spokesman Time Wagner said. United, a unit of UAL, said the increase took effect Thursday night and applies to most routes where it competes against discount carriers, such as Chicago to Dallas and Atlanta and Denver to San Francisco, Los Angeles and New York"; // Add your text here!
        File dir = new File("E:\\summer 2016\\KDM\\Project\\Dataset\\bbcsport\\cricket");
        File[] directoryListing = dir.listFiles();
        for(int i=0;i<directoryListing.length;i++) {
            File file=directoryListing[i];
            String text = FileUtils.readFileToString(file);

// create an empty Annotation just with the given text
                Annotation document;
                document = new Annotation(text);

// run all Annotators on this text
                pipeline.annotate(document);

                // these are all the sentences in this document
// a CoreMap is essentially a Map that uses class objects as keys and has values with custom types
                List<CoreMap> sentences = document.get(CoreAnnotations.SentencesAnnotation.class);

                for (CoreMap sentence : sentences) {
                    // traversing the words in the current sentence
                    // a CoreLabel is a CoreMap with additional token-specific methods
                    for (CoreLabel token : sentence.get(CoreAnnotations.TokensAnnotation.class)) {

                        System.out.println("\n" + token);

                                               // this is the NER label of the token
                        String ne = token.get(CoreAnnotations.NamedEntityTagAnnotation.class);
                        if(!ne.equals("0")) {
                            System.out.println("NER");
                            System.out.println(token + ":" + ne);
                        }
                        System.out.println("\n\n");
                    }

                    // this is the parse tree of the current sentence
                    //Tree tree = sentence.get(TreeCoreAnnotations.TreeAnnotation.class);
                    //System.out.println(tree);
                    // this is the Stanford dependency graph of the current sentence
                    //SemanticGraph dependencies = sentence.get(SemanticGraphCoreAnnotations.CollapsedCCProcessedDependenciesAnnotation.class);
                    //System.out.println(dependencies.toString());

                    //Map<Integer, CorefChain> graph =
                   // document.get(CorefCoreAnnotations.CorefChainAnnotation.class);
                    //System.out.println(graph.values().toString());
                }


            }
    }

    }


