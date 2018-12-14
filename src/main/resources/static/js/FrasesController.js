var frase;
var tipo;
var grados;
var json;
var Frases = (function () {
    function gradeToFarange(){
        
        axios.get('/temp/gf/'+grados).then(function (response) {
            this.json=response.data;
            console.log(response.data);                
            alert("dsa"+json.grados);
            alert("Los grados centigrados"+grados+"En Fahrenheit son "+json.grados);
            
        })
        .catch(function (error) {
            
            console.log(error);
        });
    };
    function farangeToGrade(){
        
        axios.get('/temp/fg/'+grados).then(function (response) {
            this.json=response.data;
            console.log(response.data);    
            alert("Los"+grados+"Fahrenheit en centigrados son "+json.grados);

          
        })
        .catch(function (error) {
            
            console.log(error);
        });
    };
    

    function mandar(){
        tipo=document.getElementById("id").value;
        //alert(tipo);
        
        grados=document.getElementById("x").value;
        //alert(grados);
        if(tipo=="farang"){
            //alert("1");
            
            Frases.farangeToGrade();
        }else{
            //alert("2");
            
            Frases.gradeToFarange();
        }
      
    };
    
    return {
        gradeToFarange:gradeToFarange,
        farangeToGrade:farangeToGrade,
        mandar:mandar
        
    
    };
})();

   var Company=(function(){

    var getEmpresa=function(llama){
    
    axios.get('/info').then(function (response) {
            llama.Eraser();
            console.log(response.data);                
            llama.exito(response.data);
          
        })
        .catch(function (error) {
            
            console.log(error);
        });
    };
    return {
        getEmpresa:getEmpresa
    };
    })(); 
