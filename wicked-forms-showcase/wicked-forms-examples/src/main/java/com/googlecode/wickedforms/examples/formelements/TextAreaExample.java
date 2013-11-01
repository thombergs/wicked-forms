package com.googlecode.wickedforms.examples.formelements;

import com.googlecode.wickedforms.model.FormModel;
import com.googlecode.wickedforms.model.SectionModel;
import com.googlecode.wickedforms.model.elements.TextModel;
import com.googlecode.wickedforms.model.elements.fields.TextAreaModel;

public class TextAreaExample extends FormModel {

	public TextAreaExample() {
		super("Text Area Examples");

		add(new SectionModel("Simple Text Area")
		    .add(new TextModel(
		        "A simple Text Area. It's almost rocket science... ."))
		    .add(new TextAreaModel("Your favorite childhood story")));

		add(new SectionModel("Text Area with default text")
		    .add(
		        new TextModel(
		            "Most form elements provide a constructor in which you can pass a default value."))
		    .add(new TextAreaModel("Your favorite animal story", "The quick brown fox jumps over the lazy dog.")));

	}

}
