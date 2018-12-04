/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var frase;
var tipo;
var grados;
var Frases = (function () {
    function gradeToFarange(){
        
        axios.get('/temp/gf/'+grados).then(function (response) {
            
            console.log(response.data);                

          
        })
        .catch(function (error) {
            
            console.log(error);
        });
    };
    
    
    function farangeToGrade(){
        
        axios.get('/temp/fg'+grados).then(function (response){
            console.log('save succesfully')
 
        }).catch(function(error){
                console.log(error);
            });
    }
    function eraser(){
        axios.post('/info/era',frase).then(function (response){
            console.log('save succesfully')
 
        }).catch(function(error){
                console.log(error);
            });           
    }
    
    function mandar(){
        tipo=document.getElementById("id").value;
        alert(tipo);
        grados=document.getElementById("x").value;
        alert(grados);
        if(tipo=="Fahrenheit"){
            Frases.farangeToGrade();
        }else{
            Frases.gradeToFarange();
        }
      
    };
    
    return {
        gradeToFarange:gradeToFarange,
        farangeToGrade:farangeToGrade,
        eraser:eraser,
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





