package ro.emanuel.tema;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TemaController {

	@RequestMapping(value="form.htm", method=RequestMethod.GET)
	public ModelAndView getForm() {
		return new ModelAndView("form.jsp",new ModelMap());
	}
	
	@RequestMapping(value="calcul.htm",method= RequestMethod.POST)
	public ModelAndView computeSum(@RequestParam Integer a,@RequestParam Integer b,@RequestParam Integer c,@RequestParam Integer d,@RequestParam Integer e) {
		ModelMap model= new ModelMap();
		int[] param= {a,b,c,d,e};
		
		int suma=0;
		int count=0;
		int min=a;
		int max=a;
		for(int i=0;i<param.length;i++) {
			suma+=param[i];
			count++;
			if(param[i]<min)
				min=param[i];
			if(param[i]>max)
				max=param[i];
		}
		double arit=Math.floor(suma/count);
		Arrays.sort(param);
		model.put("suma",suma);
		model.put("min", min);
		model.put("max",max);
		model.put("arit",arit);
		model.put("aux",param);
		
		return new ModelAndView("rezultat.jsp",model);
	}
	
}

