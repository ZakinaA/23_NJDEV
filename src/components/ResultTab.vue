<script setup>

</script>

<template>

  <div id="div-background-result-tab">
    <div id="div-result-tab">
      <table id="result-tab" class="table table-striped table-dark">
        <thead>
        <tr>
          <th>Nom</th>
          <th>Prénom</th>
          <th>Age</th>
          <th>Pays</th>
        </tr>
        </thead>
        <tbody>
        <tr>
          <td>AGBEGNENOU</td>
          <td>Clarisseo</td>
          <td>31</td>
          <td>FRANCE</td>
        </tr>
        <tr>
          <td>RINNER</td>
          <td>Teddy</td>
          <td>34</td>
          <td>FRANCE</td>
        </tr>
        <tr>
          <td>RINNER</td>
          <td>Teddy</td>
          <td>34</td>
          <td>FRANCE</td>
        </tr>
        <tr>
          <td>RINNER</td>
          <td>Teddy</td>
          <td>34</td>
          <td>FRANCE</td>
        </tr>
        <tr>
          <td>RINNER</td>
          <td>Teddy</td>
          <td>34</td>
          <td>FRANCE</td>
        </tr>
        <tr>
          <td>RINNER</td>
          <td>Teddy</td>
          <td>34</td>
          <td>FRANCE</td>
        </tr>
        <tr>
          <td>RINNER</td>
          <td>Teddy</td>
          <td>34</td>
          <td>FRANCE</td>
        </tr>
        <tr>
          <td>RINNER</td>
          <td>Teddy</td>
          <td>34</td>
          <td>FRANCE</td>
        </tr>
        <tr>
          <td>RINNER</td>
          <td>Teddy</td>
          <td>34</td>
          <td>FRANCE</td>
        </tr>
        <tr>
          <td>RINNER</td>
          <td>Teddy</td>
          <td>34</td>
          <td>FRANCE</td>
        </tr>
        <tr>
          <td>RINNER</td>
          <td>Teddy</td>
          <td>34</td>
          <td>FRANCE</td>
        </tr>
        <tr>
          <td>RINNER</td>
          <td>Teddy</td>
          <td>34</td>
          <td>FRANCE</td>
        </tr>
        <tr>
          <td>RINNER</td>
          <td>Teddy</td>
          <td>34</td>
          <td>FRANCE</td>
        </tr>
        <tr>
          <td>RINNER</td>
          <td>Teddy</td>
          <td>34</td>
          <td>FRANCE</td>
        </tr>
        <tr>
          <td>RINNER</td>
          <td>Teddy</td>
          <td>34</td>
          <td>FRANCE</td>
        </tr>
        </tbody>
      </table>
    </div>
  </div>

</template>

<style scoped>

#div-background-result-tab{
  position: fixed;
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100%;
  height: 100vh;
  background-color: rgba(0, 0, 0, 0.5);
}

#div-result-tab{
  width: 60%;
  height: 60vh;
  background-color: beige;
  display: flex;
  justify-content: center;
  align-items: start;
  background-color: #212529;
  border-radius: 20px;
}

#result-tab{
  width: 95%;
  height: 95%;
  margin: 0;
}

#result-tab tbody{
  max-height: 300px;
  overflow: auto;
}

#result-tab tr{
  height: 40px;
}

</style>
