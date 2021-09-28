import javax.swing.*;

import static java.lang.System.exit;


public class MagicBall {
    public static void main(String[] args) {

        String userAnswer = "0";

        while (userAnswer != null) {
            String response = JOptionPane.showInputDialog(null,
                    "Ask me a question", " All knowing Magic 8 Ball", 3);
            userAnswer = response;

            if (userAnswer == null) {
                exit(0);
            }
            else {
                JOptionPane.showMessageDialog(null, "" + MagicBalls());
            }

        }

    }

    public static String MagicBalls() {
            int choice = (int) (Math.random() * 20 + 1);

            if (choice == 1)
                {return "Heck YEAH!";}

            else if (choice == 2) {

                return "It is decidedly so.";

            } else if (choice == 3) {

                return "Without a doubt.";

            } else if (choice == 4) {

                return "Yes - definitely.";

            } else if (choice == 5) {

                return "You may rely on it.";

            } else if (choice == 6) {

                return "As I see it, yes.";

            } else if (choice == 7) {

                return "Most likely.";

            } else if (choice == 8) {

                return "Outlook good.";

            } else if (choice == 9) {

                return "Yes.";

            } else if (choice == 10) {

                return "Signs point to yes.";

            } else if (choice == 11) {

                return "Reply hazy, try again.";

            } else if (choice == 12) {

                return "Ask again later.";

            } else if (choice == 13) {

                return "Better not tell you now.";

            } else if (choice == 14) {

                return "Cannot predict now.";

            } else if (choice == 15) {

                return "Concentrate and ask again.";

            } else if (choice == 16) {

                return "Don't count on it.";

            } else if (choice == 17) {

                return "The man with a plan says NO";

            } else if (choice == 18) {

                return "Maybe not today... or tomorrow... or ever";

            } else if (choice == 19) {

                return "Unlikely this is true";

            } else {

                return "Very low chances.";

            }

        }
    }

