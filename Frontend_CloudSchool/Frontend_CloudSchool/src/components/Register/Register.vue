<template>
  <v-app style="background-color:rgba(0,164,215,0.25)">
    <div style="margin-top: 10%">
      <v-avatar color="blue">
        <span class="white--text headline">Hi</span>
      </v-avatar>
    </div>
  <v-row  style="margin-left: 28%;">
    <v-form
      ref="form"
      v-model="valid"
      :lazy-validation="lazy"
    >
      <v-text-field
        v-model="name"
        :rules="nameRules"
        label="用户名"
        required
      ></v-text-field>
      <v-text-field
        v-model="password"
        :rules="passwordRules"
        label="密码"
        required
      ></v-text-field>
      <v-text-field
        label="确认密码"
        required
      ></v-text-field>
      <v-text-field
        label="学校"
        required
      ></v-text-field>
      <v-text-field
        label="手机号"
        required
      ></v-text-field>
      <div style="margin-top: 5%">
        <v-btn
          color="blue"
          class="mr-4"
          @click="validate"
        >
         确认
        </v-btn>
      </div>

    </v-form>
  </v-row>
  </v-app>
</template>

<script>
    export default {
        data: () => ({
            name: '',
            nameRules: [
                v => !!v || '用户名必填',
            ],
            password: '',
            passwordRules: [
                v => !!v || '密码必填',
            ],
            lazy: false,
        }),

        methods: {
            validate () {
                this.$router.push({path:'/Personal',query:{}});//传递参数
                this.$refs.form.validate()
            },
        },
    }
</script>

  <style scoped>

</style>
