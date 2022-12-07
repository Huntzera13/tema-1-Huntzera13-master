package com.example.project;

import java.io.IOException;

import static com.example.project.Questions.verification_no_user_or_no_password;
import static com.example.project.User.verification;
import static com.example.project.cleanfilequestions.cleanquestions;
import static com.example.project.cleanuser.cleanuser;

public class Tema1 {
//
	public static void main(final String[] args){
		if (args == null)
			System.out.print("Hello world!");

		 else if (args[0].equals("-get-question-id-by-text")) {
			verification_no_user_or_no_password(args);
		} else if (args[0].equals("-create-user")){
			verification(args);
		}
		else if (args[0].equals("-cleanup-all")){
			cleanuser();
			cleanquestions();
		}
		else if(args[0].equals("-create-question"))	{
			verification_no_user_or_no_password(args);
		}
		else if(args[0].equals("-get-question-id-by-text")){
			verification_no_user_or_no_password(args);
		}
		else if(args[0].equals("-get-all-questions")){
			verification_no_user_or_no_password(args);
		}
		else if(args[0].equals("-create-quizz")){
			verification_no_user_or_no_password(args);
		}
		else if(args[0].equals("-get-quizz-by-name")){
			verification_no_user_or_no_password(args);
		}

		else if(args[0].equals("-get-all-quizzes")){
			verification_no_user_or_no_password(args);
		}
		else if(args[0].equals("-get-quizz-details-by-id")){
			verification_no_user_or_no_password(args);
		}
		else if(args[0].equals("-submit-quizz")){
			verification_no_user_or_no_password(args);
		}
		else if(args[0].equals("-delete-quizz-by-id")){
			verification_no_user_or_no_password(args);
		}
	}
}

