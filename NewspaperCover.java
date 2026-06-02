import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class NewspaperCover{

    public static void main(String[] args) {
        SwingUtilities.invokeLater(NewspaperCover::createUI);
    }

    static void createUI() {

        JFrame frame = new JFrame("THE RAZON POST");
        frame.setSize(1200, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10,10));

        JPanel header = new JPanel(new BorderLayout());

        JLabel newspaperName = new JLabel("THE RAZON POST", SwingConstants.CENTER);
        newspaperName.setFont(new Font("Serif", Font.BOLD, 50));

        JLabel date = new JLabel(
                "Tuesday, June 02, 2026    |    Kathmandu, Nepal",
                SwingConstants.CENTER);
        date.setFont(new Font("Arial", Font.PLAIN, 16));

        header.add(newspaperName, BorderLayout.CENTER);
        header.add(date, BorderLayout.SOUTH);

        frame.add(header, BorderLayout.NORTH);

        JLabel breaking = new JLabel(
                " BREAKING: Parliament session turns chaotic • Government announces new reforms ",
                SwingConstants.CENTER);

        breaking.setOpaque(true);
        breaking.setBackground(Color.RED);
        breaking.setForeground(Color.WHITE);
        breaking.setFont(new Font("Arial", Font.BOLD, 18));

        frame.add(breaking, BorderLayout.SOUTH);

        JPanel main = new JPanel(new BorderLayout(10,10));
        main.setBorder(new EmptyBorder(10,10,10,10));

        JPanel headlinePanel = new JPanel(new BorderLayout());

        JLabel headline = new JLabel(
                "<html><center>BALEN GOVERNMENT ANNOUNCES<br>MAJOR NATIONAL REFORMS</center></html>",
                SwingConstants.CENTER);

        headline.setFont(new Font("Serif", Font.BOLD, 36));

        JTextArea headlineText = new JTextArea(
                "The government today unveiled a series of new policies "
              + "aimed at infrastructure, education and technology growth "
              + "across Nepal."
        );

        headlineText.setEditable(false);
        headlineText.setLineWrap(true);
        headlineText.setWrapStyleWord(true);
        headlineText.setFont(new Font("Serif", Font.PLAIN, 18));

        headlinePanel.add(headline, BorderLayout.NORTH);
        headlinePanel.add(headlineText, BorderLayout.CENTER);

        main.add(headlinePanel, BorderLayout.NORTH);

        JPanel sections = new JPanel(new GridLayout(1,3,10,10));

        sections.add(createArticle(
                "SPORTS",
                "Nepal wins thrilling cricket encounter. "
                        + "Kushal Bhurtel returns to form with a match-winning performance."
        ));

        sections.add(createArticle(
                "ECONOMY",
                "New budget proposals spark discussion among economists. "
                        + "Infrastructure spending sees significant increase."
        ));

        sections.add(createArticle(
                "WEATHER",
                "Sunny skies expected throughout the week.\n\n"
                        + "Temperature: 28°C\n"
                        + "Humidity: 45%\n"
                        + "Wind: 12 km/h"
        ));

        main.add(sections, BorderLayout.CENTER);

        frame.add(main, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    static JPanel createArticle(String title, String content) {

        JPanel panel = new JPanel(new BorderLayout());

        panel.setBorder(new CompoundBorder(
                new LineBorder(Color.DARK_GRAY,2),
                new EmptyBorder(10,10,10,10)
        ));

        JLabel heading = new JLabel(title, SwingConstants.CENTER);
        heading.setOpaque(true);
        heading.setBackground(Color.BLACK);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Arial", Font.BOLD, 22));

        JTextArea text = new JTextArea(content);
        text.setEditable(false);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setFont(new Font("Serif", Font.PLAIN, 17));

        panel.add(heading, BorderLayout.NORTH);
        panel.add(text, BorderLayout.CENTER);

        return panel;
    }
}