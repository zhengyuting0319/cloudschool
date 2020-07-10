<template>
  <v-app style="background-color:rgba(0,164,215,0.25)">
<div style="margin-top: 5%;color: #00b0ff;font-size: x-large">
  编辑待办
</div>
<div class="card">
  <v-row  style="margin-left: 28%;">
    <v-form
      ref="form"
      v-model="valid"
    >
      <v-text-field
        label="待办名称"
        required
      ></v-text-field>
      <v-text-field
        label="设置截止时间"
        required
      ></v-text-field>
      <v-text-field
        label="设置提醒时间"
        required
      ></v-text-field>
      <div style="margin-top: 5%">
        <v-btn
          color="blue"
          class="mr-4"
          @click="backToTodo"
        >
         确认
        </v-btn>
      </div>

    </v-form>
  </v-row>
</div>

      
      
  </v-app>
</template>

<script>
    export default {
        // data: () => ({
       
        // }),

        methods: {
            backToTodo () {
                this.$router.push({path:'/ToDo',query:{}});//传递参数
            },
        },
    }
</script>

  <style scoped>
  .card {
      margin-top: 4%;
      margin-left: 4%;
      /*display:inline-block;
      box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
      transition: 0.3s; */
      width: 90%;
      height:45%;
      border-radius: 25px;
      background-color: white;
    }
    .card:hover {
      box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
    }
</style>
