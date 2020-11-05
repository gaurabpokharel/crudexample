<template>
  <div class="w-screen h-screen overflow-hidden flex flex-col font-nunito">
    <div class="w-full h-full flex justify-center items-center">
      <div class="w-86 h-72 overflow-auto bg-blue-300">
     
        <table class="table-auto w-full">
          <thead>
            <tr class="bg-gray-200">
              <th class="px-4 py-2">Address</th>
              <th class="px-4 py-2">Email</th>
              <th class="px-4 py-2">Gender</th>
              <th class="px-4 py-2">Patient Full Name</th>
              <th class="px-4 py-2">Patient ID</th>
              <th class="px-4 py-2">Phone No</th>
            </tr>
          </thead>
          <tbody>
            <tr v-for="(info, index) in infos" :key="index">
              <td class="border px-4 py-2 text-center">{{info.patientid}}</td>
              <td class="border px-4 py-2 text-center">{{info.patientfullname}}</td>
              <td class="border px-4 py-2 text-center">{{info.address}}</td>
              <td class="border px-4 py-2 text-center">{{info.phono}}</td>
              <td class="border px-4 py-2 text-center">{{info.gender}}</td>
              <td class="border px-4 py-2 text-center">{{info.email}}</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  </div>
</template>

<script>
import axios from "axios";
export default {
  data() {
    return {
      infos: [],
      
    };
  },
  mounted() {
    axios.get("http://localhost:9090/api/viewpatientdata").then((res) => {
        console.log(res);
        this.infos = res.data;
      })
      .catch((err) => {
        console.log(err);
      });
  },
};
</script>

<style>
</style>