package savitri.sculptor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import savitri.sculptor.model.ContactUs;

import savitri.sculptor.service.ContactUsService;


@CrossOrigin(origins= "http://localhost:4200")
@RestController
@RequestMapping("/contactus")
public class ContactUsController {
	@Autowired
	private ContactUsService cn;
	
	@GetMapping("/contact")
	public List<ContactUs> handleget()
	{
		return cn.getAll();
	}
	@PostMapping("/addcon")
	public ContactUs add(@RequestBody ContactUs r)
	{
		return cn.insertrecord(r);
	}
	@DeleteMapping("/delfeed/{rid}")
	public void delr(@PathVariable("rid")int r)
	{
		cn.del(r);
	}
	@PutMapping("/upfeed/{rid}")
	public ContactUs update(@PathVariable("rid")int i,@RequestBody ContactUs r) 
	{
		return cn.updaterecord(i,r);
		
	}
}
