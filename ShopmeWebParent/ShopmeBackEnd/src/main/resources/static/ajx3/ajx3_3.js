(function() {
  const url = 'ajx3_3_message.txt';
    const div = document.createElement('div');
    document.body.append(div);

  test();
  function test() {
      const xhr = new XMLHttpRequest();
      /*xhr.onreadystatechange = function() {  //1
          console.log(`${xhr.readyState}`);
          if(xhr.readyState === 4){
              console.log(xhr.responseText);
              const div = document.createElement('div');
              div.textContent = xhr.responseText;
              document.body.append(div);
          }
      }*/
      // another way for 1
      xhr.onload = () =>{  //equal: xhr.onload = function(){
          console.log("ready");
          console.log(xhr.responseText);
          const json = JSON.parse(xhr.responseText);
          console.log(json);

          message(json);
          message(json.message);
      }

      xhr.open('GET',url);
      xhr.send();
  }

  function message(output) {
      div.innerHTML += ` ,-> ${output}`;
  }

})();