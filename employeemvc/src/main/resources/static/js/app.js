function validate() {
	var id=document.getElementById("id").value;
	var name = document.getElementById("name").value;
	
	if(id==0){
		alert('Please enter valid id.');
		return false;
	}else if (name == '') {
		alert('Please enter a valid name.');
		return false;
	} 
	else {
		return true;
	}
	
	}