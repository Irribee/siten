package Skill.RegulaExpression;

//взять любой ангийский текст и написать программу, который будет разбивать этот текст на отдельные слова
public class EnglishWords {
    public static void main(String[] args) {
        String text = "Three rhesus macaques with a mutated gene that's associated with Bardet-Biedl Syndrome have been discovered, according to a study published in the journal Experimental Eye Research. It is the first known naturally occurring nonhuman primate model of the syndrome, which is also called BBS.\n" +
                "\n" +
                "BBS leads to vision loss, kidney disfunction, extra fingers or toes, and other symptoms. It occurs in 1 of 140,000 to 160,000 North American births.\n" +
                "\n" +
                "\"There is no cure for Bardet-Biedel Syndrome today, but having a naturally occurring animal model for the condition could help us find one in the future,\" said the paper's corresponding author, Martha Neuringer, Ph.D., a professor of neuroscience at the Oregon National Primate Research Center at Oregon Health & Science University, and a research associate professor of ophthalmology in the OHSU School of Medicine and OHSU Casey Eye Institute.\n" +
                "\n" +
                "Broader applications\n" +
                "\n" +
                "Rhesus macaques with this disease could help more than just BBS patients. BBS is part of a larger family of diseases called retinitis pigmentosa, all of which affect the retina, or the back part of the eye. A naturally occurring animal model for BBS could help researchers find treatments for a variety of retinitis pigmentosa diseases.\n" +
                "\n" +
                "The discovery is timely, as gene therapy is already becoming a reality for some with retinal diseases. In the 1990s, researchers discovered dogs that had a gene mutation linked to a congenital blindness-causing condition called Leber's congenital amaurosis. That animal model played a key role in helping researchers develop what became the first FDA-approved gene therapy for an inherited disease in December 2018. Neuringer's group also hopes to develop a similar therapy for BBS.";
        String[] words = text.split(" ");
        for (int i = 0; i < text.length(); i++) {
            System.out.println(words[i]);
        }
    }
}
