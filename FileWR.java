import java.io.*;
public class FileWR
{
    public static void main(String args[])throws IOException
    {
        int charCount=0;
        int wordCount=0;
        int sentenceCount=0;
        int paragraphCount=1;
        int whitespaceCount=0;
        FileWriter myWriter=new FileWriter("C:\\Users\\admin\\OneDrive\\Desktop\\test.txt");
        System.out.println("the file is successfully created");
        myWriter.write("Java is a programming language and it is first released by sun microsystems in 1995");
        myWriter.close();
        System.out.println("successfully wrote file");
        File file=new File("C:\\Users\\admin\\OneDrive\\Desktop\\test.txt");
        FileInputStream stream=new FileInputStream(file);
        InputStreamReader input=new InputStreamReader(stream);
        BufferedReader reader=new BufferedReader(input);
        String line;
        while((line=reader.readLine())!=null) {
            System.out.println(line);
            if (line.equals("")) {
                paragraphCount++;
            } else {
                charCount += line.length();
                String[] wordList = line.split("\\s+");
                wordCount += wordList.length;
                whitespaceCount = wordCount - 1;
                String[] sentenceList = line.split("[!?.:]+");
                sentenceCount += sentenceList.length;
            }
        }
        System.out.println(charCount);
        System.out.println(wordCount);
        System.out.println(sentenceCount);
        System.out.println(paragraphCount);
        System.out.println(whitespaceCount);
    }

}

