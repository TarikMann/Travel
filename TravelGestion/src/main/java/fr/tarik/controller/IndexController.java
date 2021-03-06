package fr.tarik.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.tarik.domaine.Bagage;
import fr.tarik.domaine.Voyage;

@Controller
public class IndexController {

	@Autowired
	private Voyage leVoyage;
	private Bagage leBagage;

	@RequestMapping(path = "/welcome", method = RequestMethod.GET)
	ModelAndView displayIndex() {

		ModelAndView monModelAndView = new ModelAndView("welcome");

		final List<Voyage> voyages = new ArrayList<>();
		voyages.add(this.leVoyage);

		monModelAndView.getModel().put("voyages", voyages);

		return monModelAndView;
	}
}
